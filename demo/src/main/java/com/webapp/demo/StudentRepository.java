package com.webapp.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends  MongoRepository<data,String>{
    
}
