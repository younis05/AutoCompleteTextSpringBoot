package com.younes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.younes.model.Product;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

	@Query("SELECT name FROM Product where name like %:keyword%")
	public List<String> search(@Param("keyword") String keyword);

}
