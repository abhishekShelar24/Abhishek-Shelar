package com.jspider.roxilartask.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspider.roxilartask.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	List<Product> fetchProductsByPrice(double price);

	@Query(value = "SELECT product FROM Product product WHERE product.title LIKE %:search%")
	List<Product> findProductsByTitleOrDescription(String search);

	@Query("SELECT p FROM Product p WHERE FUNCTION('MONTH',p.dateOfSale) = :month")
	List<Product> findProductsByMonth(int parseInt);

}
