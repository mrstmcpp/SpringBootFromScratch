package org.mrstm.springboot.TodoApi;


import org.springframework.stereotype.Service;

@Service("loosetodoservice") //this works due to @Component thing inside of service...
public class LooseTodoService implements TodoService{
    @TimeMonitor
    public String doSomething() {
        for(int i = 0; i < 1999999999 ; i++){

        }
        return "Doing something";
    }
}
