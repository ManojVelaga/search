package com.hcl.search.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MenuItem {
    @Id
    @Column  
    
    private String id;
    @Column  
	private String bookame;
    @Column  
	private Long sellerId;
    @Column  
	private Long prodYear;
    @Column  
	private Double price;
    @Column  
	private String category;
    @Column  
	private Long quantity;
    @Column  
	private String bookFormat;
    @Column  
	private Long fileSize;
    
    public MenuItem() {}
    
	public MenuItem(String id, String bookame, Long sellerId, Long prodYear, Double price, String category,
			Long quantity, String bookFormat, Long fileSize) {
		super();
		this.id = id;
		this.bookame = bookame;
		this.sellerId = sellerId;
		this.prodYear = prodYear;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.bookFormat = bookFormat;
		this.fileSize = fileSize;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookame() {
		return bookame;
	}
	public void setBookame(String bookame) {
		this.bookame = bookame;
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
	public Long getProdYear() {
		return prodYear;
	}
	public void setProdYear(Long prodYear) {
		this.prodYear = prodYear;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getBookFormat() {
		return bookFormat;
	}
	public void setBookFormat(String bookFormat) {
		this.bookFormat = bookFormat;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
    
    
}
