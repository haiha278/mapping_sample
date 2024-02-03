package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Mentor_Request")
@Data
public class Mentor_Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_request_id")
    private Long mentor_request_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "status")
    private boolean mentor_request_status;

    @Column(name = "feedback")
    private String mentor_request_feedback;

}
