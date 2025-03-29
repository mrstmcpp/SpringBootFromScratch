package org.mrstm.springboot.TodoApi;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//restcontroller instead of these two below
//@Controller
//@ResponseBody
// Controllers have two works : collecting the request nd returning the responnse.... it does not contain any business logic
// handles serialization nd deserialization by itself...
//@RequestMapping("/api/v1/todos") => this is used if any request comes from this api below controller will be used...
//it is used in case my multiple apis... nd for migration
@RequestMapping("/api/v1/")
public class TodoController2 {
    private static List<Todo> todoList;

    public TodoController2(){
        todoList = new ArrayList<>();
        todoList.add(new Todo(1 , false , "New Todo created" , 100));
        todoList.add(new Todo(2 , true , "New True Todo created" , 101));
    }

//    @GetMapping("/todos")
//    public List<Todo> getTodos(){
//        return todoList;
//    }

    //my solution
//    @PostMapping("/todos")
//    public ResponseEntity<Todo> createTodo(@RequestBody Todo currtodo){
//        todoList.add(new Todo(currtodo.getId() , currtodo.isCompleted() , currtodo.getTitle() , currtodo.getUserId()));
//        return new ResponseEntity("Success" , HttpStatus.OK);
//    }


    //solution by teacher
//    @PostMapping("/todos")
//
//    public Todo createTodo(@RequestBody Todo currtodo){
//        /*
//        *Instead of using @ResponseStatus(HttpStatus.CREATED)
//        * we can use ResponseEntity , it gives us more freedom.... nd methods
//
//         */
//        todoList.add(currtodo);
//        return currtodo;
//    }

    @PostMapping("/todos")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo currtodo){
        todoList.add(currtodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(currtodo);
    }

    //also in getmapping
    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> getTodos(){
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


}
