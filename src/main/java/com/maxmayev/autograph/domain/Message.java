package com.maxmayev.autograph.domain;


import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DynamicInsert
@DynamicUpdate
@ToString
public class Message {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name = "AUTONUMBER")
    private String autoNumber;
    @Column(name = "MESSTEXT")
    private String messText;

}
