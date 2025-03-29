package org.mrstm.springboot.TodoApi;



import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//restcontroller instead of these two below
//@Controller
//@ResponseBody
// Controllers have two works : collecting the request nd returning the responnse.... it does not contain any business logic
// handles serialization nd deserialization by itself...

public class TodoController {
    private static List<Todo> todos;

    public TodoController(){
        todos = new ArrayList<>();
        todos.add(new Todo(1 , false , "New Todo created" , 100));
        todos.add(new Todo(2 , true , "New True Todo created" , 101));

    }

}
