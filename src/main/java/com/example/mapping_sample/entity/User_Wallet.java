package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "User_Wallet")
@Data
public class User_Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_wallet_id")
    private Long user_bank_account_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @Column(name = "last_update_date", nullable = false)
    private LocalDate last_update_date;
}
