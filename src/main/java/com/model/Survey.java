package com.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "survey")
@Data
public class Survey{

    @Id
    private String id;

    private String title;
    private String description;
    private int year;
}
