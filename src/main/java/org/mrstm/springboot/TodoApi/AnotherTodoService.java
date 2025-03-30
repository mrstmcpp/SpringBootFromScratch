package org.mrstm.springboot.TodoApi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//multiple classes using same interface .... how spring will know which to use
@Service("anothertodoservice")
@Primary
public class AnotherTodoService implements TodoService {
    public String doSomething() {
        return "again doing something";
    }
}
