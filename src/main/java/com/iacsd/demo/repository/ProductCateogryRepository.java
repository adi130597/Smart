package com.iacsd.demo.repository;

import com.iacsd.demo.model.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductCateogryRepository extends CrudRepository<ProductCategory, Long> {

	List<ProductCategory> findByIsDeletedFalse();
	
	Page<ProductCategory> findAll(Pageable pageable);
	
	ProductCategory findByUid(String uid);
	
	@Query("SELECT COUNT(pc)>0 from ProductCategory pc where pc.name =:productCategoryName")
	Boolean isProductCategoryNameExist(@Param("productCategoryName") String productCategoryName);
	
}
