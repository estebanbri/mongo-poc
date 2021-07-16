package com.example.mongopoc.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // optional annotation
@Data
public class User {

    @Id
    private String id;

    private String name;

    private String surname;

    private Address address;

}
