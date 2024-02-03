package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Transaction")
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transaction_id;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "transaction_type")
    private String transaction_type;

    @Column(name = "time_stamp")
    private LocalDate transaction_time_stamp;

    @OneToOne(mappedBy = "transaction")
    private Denomination_Transaction denomination_transaction;

    @OneToOne(mappedBy = "transaction")
    private Support_Transaction support_transaction;

    @OneToOne(mappedBy = "transaction")
    private Course_Registration_Transaction course_registration_transaction;

    @OneToOne(mappedBy = "transaction")
    private Withdrawal_Request withdrawal_request;
}
