package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Denomination")
@Data
public class Denomination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "denomination_id")
    private Long denomination_id;

    @Column(name = "value")
    private Double value;

    @Column(name = "amount")
    private Double amount;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "denomination")
    private List<Denomination_Transaction> denomination_transactions;

}
