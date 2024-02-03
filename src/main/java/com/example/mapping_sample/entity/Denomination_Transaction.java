package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "denomination_transaction")
@Data
public class Denomination_Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "denomination_transaction_id")
    private Long denomination_transaction_id;

    @OneToOne
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "denomonation_id")
    private Denomination denomination;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
