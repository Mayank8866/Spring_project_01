 package com.Spring01;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "orders")
public class Order{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String product;

   @ManyToOne
   @JoinColumn(name="user-id")
    private User user;
}