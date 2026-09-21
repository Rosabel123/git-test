package com.xxs.jpa.springdatajpa.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")//对应哪张表
public class User {
    @Id//这是主键
    @Column(name = "id")//数据库中的id,对应属性中的id
    @GeneratedValue(strategy = GenerationType.AUTO)//主键自增策略
    int id;
    @Column(name = "username")
    String username;
    @Column(name = "password")
    String password;
}
