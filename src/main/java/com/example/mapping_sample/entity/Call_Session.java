package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Call_Session")
@Data
public class Call_Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "call_session_id")
    private Long call_session_id;

    @ManyToOne
    @JoinColumn(name = "user1_id")
    private User user1;

    @ManyToOne
    @JoinColumn(name = "user2_id")
    private User user2;

    @Column(name = "start_time")
    private LocalDate start_time;

    @Column(name = "end_time")
    private LocalDate end_time;

    @Column(name = "status")
    private boolean status;

    @OneToMany(mappedBy = "call_session", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<Call_History> call_history_List;
}
