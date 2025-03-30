package org.mrstm.springboot.TodoApi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/v2/")
public class TodoController3 {
    // bt what if we needed sometimes anothertodoservice nd sometimes loosetodoservice???????
//    @Autowired
//    @Qualifier("loosetodoservice") //it specifies which to use here in v2 api
    private TodoService looseTodoService;
    private static List<Todo> todoList;
    private static final String hello = "Not Found";

    /*
    since nowadays spring do not recommend to use @Autowired . So , we will use constructor injection.
    => Also using through autowired is called field injection....
    => Using in constructor directly is called dependency injection ... which is one of solid principles.
     */
    public TodoController3(@Qualifier("loosetodoservice") TodoService todoService){
        this.looseTodoService = todoService;
        todoList = new ArrayList<>();
        todoList.add(new Todo(1L, false , "New Todo created" , 100));
        todoList.add(new Todo(2L, true , "New True Todo created" , 101));
    }


    @PostMapping("/todos")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo currtodo){
        todoList.add(currtodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(currtodo);
    }

    //handling filtering responess based on requests
    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> filterTodo(@RequestParam(required = false) boolean isCompleted){
        System.out.println(isCompleted + looseTodoService.doSomething());
        return ResponseEntity.ok(todoList);
    }


    // getting specific data
    @GetMapping("/todos/{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long todoId){

        for(Todo todo : todoList){
            if(todo.getId() == todoId){
                return ResponseEntity.ok().body(todo);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    @DeleteMapping("/todos/{todoId}/delete")
    public ResponseEntity<String> deleteTodo(@PathVariable Long todoId) {
        Iterator<Todo> iterator = todoList.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId().equals(todoId)) {
                iterator.remove();
                return ResponseEntity.ok("Todo deleted successfully");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo not found");
    }

    @PatchMapping("/todos/{todoId}/patch")
    public ResponseEntity<String> patchItem(@RequestBody String newTitle , @PathVariable Long todoId){
        for(Todo todo : todoList){
            if(todo.getId() == todoId){
                todo.setTitle(newTitle);
                return ResponseEntity.ok().body("patched");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }




}
