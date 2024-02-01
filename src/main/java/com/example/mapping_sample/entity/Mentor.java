package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Mentor")
@Data
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_id")
    private Long mentor_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "mentor")
    private List<Mentor_Skill> mentor_skill_List;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "mentor")
    private List<Mentor_Certificate> mentor_certificate_List;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "experience")
    private double experience;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "mentor")
    private List<Course> courses;
}
