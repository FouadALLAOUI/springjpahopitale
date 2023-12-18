package com.example.springjpahopitale.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank  //@NotEmpty @NotNull
    @Size(min = 4, max = 20)
    private  String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNessance;
    private boolean malade;
    @Min(10)
    private int score;
}
