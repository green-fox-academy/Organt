package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;
@Repository
public interface TodoRepo  extends CrudRepository<Todo, Long> {
    List<Todo> findAll();
    List<Todo> findAllAndOrderById();

//    List<Todo> findAllByTitleAndOrOrderById();
//    List<Todo> findAllByAndOrOrderById();
//    List<Todo> findAllByTitleAndOrOrderById();


}
