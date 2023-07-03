package com.example.sample.cases.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cases")
@Getter
@NoArgsConstructor
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String name;

    private LocalDateTime createdAt;
}
