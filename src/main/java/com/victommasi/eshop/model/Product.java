package com.victommasi.eshop.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;

import com.victommasi.eshop.model.util.Category;
import com.victommasi.eshop.model.util.Condition;
import com.victommasi.eshop.model.util.Size;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer id;
	
	@NotBlank
	@Column(name="product_name")
	private String name;
	
	@NotBlank
	@Column(name="product_description")
	private String description;
	
	@NotNull(message = "Price cannot be null")
	@DecimalMin(value = "0.01", message = "Price cannot be less than 0,01")
	@DecimalMax(value = "9999999.99", message = "Price cannot be more than 9.999.999,99")
	@NumberFormat(pattern = "#,##0.00")
	@Column(name="product_price")
	private BigDecimal price;
	
	@NotBlank
	@Column(name="product_manufacturer")
	private String manufacturer;
	
	@NotNull
	@Column(name="product_stock")
	private int stock;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="product_category")
	private Category category;
	
	@NotNull(message="Product must have condition")
	@Enumerated(EnumType.STRING)
	@Column(name="product_condition")
	private Condition condition;
	
	@NotNull(message="Product must have a size")
	@Enumerated(EnumType.STRING)
	@Column(name="product_size")
	private Size size;

	
	public Product(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}