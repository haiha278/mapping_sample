package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Mentee")
@Data
public class Mentee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentee_id")
    private Long mentor_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "goal")
    private Double goal;

    @Column(name = "interest")
    private double interest;
}
