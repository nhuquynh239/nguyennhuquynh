package com.example.NguyenNhuQuynh7954.entity;
import com.example.NguyenNhuQuynh7954.validator.annotation.ValidUserId;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name="author")
    private String author;
    @Column(name="price")
    private Double price;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    @ValidUserId
    private User user;


}