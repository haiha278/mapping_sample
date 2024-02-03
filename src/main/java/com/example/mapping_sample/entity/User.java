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

    @Column(name = "rating")
    private Double rating;

    @Column(name = "experience")
    private double experience;

    @Column(name = "goal")
    private Double goal;

    @Column(name = "interest")
    private double interest;

    @Column(name = "date_created", nullable = false)
    private LocalDate date_created;

    @Column(name = "date_modified", nullable = false)
    private LocalDate date_modified;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Report> reports;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Mentor_Request> mentor_requests;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Course> courses;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<User_Certificate> user_certificate_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<User_Skill> user_skill_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Course_Request> course_request_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<User_Bank_Account> user_bank_account_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<User_Wallet> user_wallet_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Post> posts;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "mentor_id")
    private List<Support> mentor_support_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "mentee_id")
    private List<Support> mentee_support_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Denomination_Transaction> denomination_transaction_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user")
    private List<Withdrawal_Request> withdrawal_request_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user1")
    private List<Conversation> conversations_of_user_1;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user2")
    private List<Conversation> conversations_of_user_2;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Message> sen_tMessages;

    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Message> received_Messages;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user1")
    private List<Call_Session> call_session_of_user_1;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "user2")
    private List<Call_Session> call_session_of_user_2;
}
