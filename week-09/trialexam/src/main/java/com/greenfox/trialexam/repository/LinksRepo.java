package com.greenfox.trialexam.repository;

import com.greenfox.trialexam.model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinksRepo extends CrudRepository<Link, Long> {
    @Override
    List<Link> findAll();
    Link findByAlias(String alias);
    Link findAnyById(Long id);
}
