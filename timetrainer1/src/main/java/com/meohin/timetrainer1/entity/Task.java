package com.meohin.timetrainer1.entity;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String subject;

    private String description;

    private String estimatedAt;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;
}
