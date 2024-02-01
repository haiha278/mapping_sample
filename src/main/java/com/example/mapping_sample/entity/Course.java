package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Course")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long course_id;

    @Column(name = "course_name", nullable = false)
    private String course_name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "status")
    private boolean status;

    @Column(name = "created_date", nullable = false)
    private LocalDate created_date;

    @Column(name = "rating", nullable = false)
    private Double rating;

    @Column(name = "numbers_of_lesson", nullable = false)
    private Integer numbers_of_lesson;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "course")
    private List<Video> videos;

}
