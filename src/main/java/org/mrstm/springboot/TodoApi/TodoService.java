package org.mrstm.springboot.TodoApi;

public interface TodoService {
    public String doSomething();
}


//to implement dependency inversion principle => class should not depend upon concrete classes(i.e. this interface) rather than it should depend upon the abstrations(LooseTodoService) of it....


//but what if number of classes implementing same interface...
//how spring will know which one to use ....
//it is handled by @Primeary annotation...