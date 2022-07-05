package com.example.musicbookstoresantsg.interfaces;

import com.example.musicbookstoresantsg.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<ProductModel, Integer> {

}
