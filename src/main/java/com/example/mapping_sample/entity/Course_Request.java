package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Course_Request")
@Data
public class Course_Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_request_id")
    private Long course_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "course_name", nullable = false)
    private String course_name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "status", nullable = false)
    private boolean course_request_status;

    @Column(name = "feedback")
    private String course_request_feedback;

    @Column(name = "demo_source", nullable = false)
    private String demo_source;
}
