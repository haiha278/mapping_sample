package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Certificate")
@Data
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_id")
    private Long certificate_id;

    @Column(name = "certificate_name", nullable = false)
    private String certificate_name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "certificate")
    private List<Mentor_Certificate> user_certificates;
}
