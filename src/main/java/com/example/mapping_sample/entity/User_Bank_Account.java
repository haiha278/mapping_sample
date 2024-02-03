package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_Bank_Account")
@Data
public class User_Bank_Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_bank_account_id")
    private Long user_bank_account_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "bank_name", nullable = false)
    private String bank_name;

    @Column(name = "account_number", nullable = false)
    private String account_number;

    @Column(name = "qr_code_url", nullable = false)
    private String QR_code_url;

}
