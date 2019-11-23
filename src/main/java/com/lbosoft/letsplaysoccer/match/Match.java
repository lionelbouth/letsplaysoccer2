package com.lbosoft.letsplaysoccer.match;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "MATCH")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATE")
    private LocalDateTime dateTime;

    @Column(name = "NUMBER_OF_PLAYERS")
    private Integer nbPlayers;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "REGISTRATION_LIMIT")
    private LocalDateTime registrationLimit;

    @Column(name = "MAX_FRIENDS_PER_USER")
    private int maxFriends;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    public Match() {
    }


}
