package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Call_History")
@Data
public class Call_History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "call_history_id")
    private Long call_history_id;

    @ManyToOne
    @JoinColumn(name = "call_session_id")
    private Call_Session call_session;

    @Column(name = "rating")
    private Double rating;
}
