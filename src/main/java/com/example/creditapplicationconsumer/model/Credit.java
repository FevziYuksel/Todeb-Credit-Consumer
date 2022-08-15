package com.example.creditapplicationconsumer.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated

@Entity
@Table(name = "credit")
public class Credit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id", updatable = false, nullable = false)
    private Long id;


    @CreationTimestamp
    @JsonFormat( pattern = "dd-MM-yyyy" )
    @Column(name="approbation_date", updatable = false, nullable = false)
    private Date applicationDate;


    @Column(name = "credit_limit")
    private Double creditLimit;



}
