package com.victommasi.eshop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.victommasi.eshop.model.util.Category;
import com.victommasi.eshop.model.util.Condition;
import com.victommasi.eshop.model.util.Size;

@Entity
@Table(name="product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1169566876159921825L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer id;
	
	@NotBlank(message="Name cannot be blank")
	@Column(name="product_name")
	@javax.validation.constraints.Size (max=50, message="Name cannot have more than 50 characters.")
	private String name;
	
	@NotBlank(message="Product must have a description")
	@Column(name="product_description")
	@javax.validation.constraints.Size (max=250, message="Description cannot have more than 250 characters.")
	private String description;
	
	@NotNull(message = "Price cannot be null")
	@DecimalMin(value = "0.01", message = "Price cannot be less than 0,01")
	@DecimalMax(value = "9999999.99", message = "Price cannot be more than 9.999.999,99")
	@Column(name="product_price")
	private BigDecimal price;
	
	@NotBlank(message="Product must have a manufacturer")
	@Column(name="product_manufacturer")
	@javax.validation.constraints.Size (max=50, message="Manufacturer cannot have more than 50 characters.")
	private String manufacturer;
	
	@NotNull
	@DecimalMin(value = "0", message = "Stock cannot be less than 0")
	@DecimalMax(value = "999", message = "Stock cannot be more than 999")
	@Column(name="product_stock")
	private int stock;
	
	@NotNull(message="Product must have category")
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
	
	@Lob
	@Column(name="product_image")
	private byte[] image;
	
	@OneToMany(mappedBy="product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CartItem> cartItems;
	
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
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
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
