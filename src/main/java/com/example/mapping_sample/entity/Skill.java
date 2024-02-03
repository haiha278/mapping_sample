package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Skill")
@Data
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skill_id;

    @Column(name = "skill_name", nullable = false)
    private String skill_name;

    @Column(name = "skill_description", nullable = true)
    private String skill_description;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "skill")
    private List<User_Skill> user_skills;
}
