package com.younes.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.younes.repository.ProductRepository;
import com.younes.service.ProductService;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<String> search(String keyword) {
		return productRepository.search(keyword);
	}

}
