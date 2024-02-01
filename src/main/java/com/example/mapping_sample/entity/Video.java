package com.example.mapping_sample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Video")
@Data
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id")
    private Long video_id;

    @Column(name = "video_title")
    private String video_title;

    @Column(name = "video_url")
    private String video_url;

    @Column(name = "order_in_course")
    private Integer order_in_course;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
