package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Support")
@Data
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "support_id")
    private Long support_id;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = true)
    private User mentor_id;

    @ManyToOne
    @JoinColumn(name = "mentee_id", nullable = true)
    private User mentee_id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = true)
    private Post post_id;

    @Column(name = "status")
    private String support_status;

    @Column(name = "completion_date")
    private LocalDate completion_date;

    @Column(name = "created_date")
    private LocalDate support_created_date;

    @Column(name = "price")
    private Double price;

    @Column(name = "feedback")
    private String support_feedback;

    @Column(name = "rating")
    private Double rating;

    @OneToOne(mappedBy = "support")
    private Support_Transaction support_transaction;
}
