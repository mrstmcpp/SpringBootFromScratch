package org.mrstm.springboot.jpaLearning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository will work with or wihtout it... as it is handled by JpaRepository
public interface TodoRepository extends JpaRepository<Todo, Long> {


    //JpaRepository provides basic crud operations for entities...
//    By extending JpaRepository, TodoRepository automatically gets commonly used database operations without requiring any implementation:
//    findAll(): Retrieve all Todo entities.
//    findById(Long id): Retrieve a Todo entity by its ID.
//            save(Todo todo): Save or update a Todo entity.
//    deleteById(Long id): Delete a Todo entity by its ID.
//    And many more!

}
