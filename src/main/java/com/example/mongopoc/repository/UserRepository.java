package com.example.mongopoc.repository;

import com.example.mongopoc.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
