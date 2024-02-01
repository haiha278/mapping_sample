package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Mentor_Skill")
@Data
public class Mentor_Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_skill_id")
    private Long user_skill_id;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    private Mentor mentor;
}
