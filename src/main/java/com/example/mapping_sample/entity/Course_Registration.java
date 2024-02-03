package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Course_Registration")
@Data
public class Course_Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_registration_id")
    private Long course_registration_transaction_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "date_registrated")
    private LocalDate date_registrated;

    @Column(name = "feed_back")
    private String feed_back;

    @OneToOne(mappedBy = "course_registration")
    private Course_Registration_Transaction course_registration_transaction;
}
