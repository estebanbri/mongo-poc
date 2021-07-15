package com.example.mongopoc.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User { // for mongo this will be a collection called user (collection custom name with @Document)

    @Id
    private Long id;

    private String name;

    private String surname;

}
