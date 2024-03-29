package com.test.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user",schema = "public")
public class User {

    @Id
    private Integer id;
    private String userName;
}
