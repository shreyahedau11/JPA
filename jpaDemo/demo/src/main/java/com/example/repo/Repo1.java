package com.example.repo;

import com.example.enity.Rating;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface Repo1 extends CrudRepository<Rating,Integer>{

}
