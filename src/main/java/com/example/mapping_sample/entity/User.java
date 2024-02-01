package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "password")
    private String pass_word;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private boolean status;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "date_of_birth")
    private LocalDate day_of_birth;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "email")
    private String email;

    @Column(name = "education_level")
    private String education_level;

    @Column(name = "date_created", nullable = false)
    private LocalDate date_created;

    @Column(name = "date_modified", nullable = false)
    private LocalDate date_modified;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToOne (mappedBy = "user", cascade = CascadeType.MERGE)
    private Mentor mentor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Report> reports;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Mentor_Request> mentor_requests;

}
