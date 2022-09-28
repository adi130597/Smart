package com.iacsd.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter @Setter
@Entity
@Table(name="PRODUCT")
public class Product extends BaseEntity {
	@Column(name="NAME")
	private String name;
	@Column(name="CODE")
	private String code;
	@ManyToOne
	@JoinColumn(name="PROD_CAT_ID")
	private ProductCategory productCategory;
	@Column(name="MIN_QTY")
	private Long minimumQuantity;
	@Column(name = "UNIT")
	@Enumerated(EnumType.STRING)
	private Unit unit;
	@Column(name="avl_quantity")
	private Long availableQuantity;
	@Column(name = "CREATED_ON")
	private Instant createdOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
}
