package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Mentor_Certificate")
@Data
public class Mentor_Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_certificate_id")
    private Long mentor_certificate_id;

    @ManyToOne
    @JoinColumn(name = "certificate_id", nullable = false)
    private Certificate certificate;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    private Mentor mentor;

    @Column(name = "certificate_url")
    private String certificate_url;
}
