package com.iacsd.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Getter @Setter
@Entity
@Table(name="PRODUCT_CATEGORY")
public class ProductCategory extends BaseEntity{

	@Column(name="NAME")
	private String name;
	@Column(name="IS_DELETED")	
	private Boolean isDeleted;

	@PrePersist
	void setIsDeletedDefault(){
		this.isDeleted = false;
	}

}
