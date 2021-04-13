package com.cibertec.semana3.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {


    private int id;

    private String name;

    private String username;

    private String email;

    private String title;
}

