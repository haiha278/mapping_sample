package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Report")
@Data
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long report_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JoinColumn(name = "content")
    private String content;

    @JoinColumn(name = "created_date")
    private LocalDate created_date;

    @JoinColumn(name = "last_modified")
    private LocalDate last_modified;

}
