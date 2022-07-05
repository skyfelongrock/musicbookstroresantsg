package com.example.musicbookstoresantsg.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue
    private int productID;
    private String name;
    private String genre;
    private String releaseDate;
    private double basePrice;
}
