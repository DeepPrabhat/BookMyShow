package com.app.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Table(name = "USER_TABLE")
@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id// primary key
    private Long userId;

    @Column(name = "USER_NAME")
    private String name;

    @Column(name = "USER_AGE")
    private Integer age;

    @Column(name = "USER_CONTACT")
    private String number;

    public enum Gender {
        MALE,
        FEMALE
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @OneToMany()
    @JoinColumn(name = "booking_id" , referencedColumnName = "ID")
    private List<Booking> bookingList;

}
