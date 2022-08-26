package com.project.quanlybanhang.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class ProductsEntity extends BaseEntity {

	@Column(name = "namephone", length = 40)
	private String namePhone;
	
	@Column(name = "image")
	private String image;
	
	private String shortDiscription; //Mô tả ngắn
	
	private String description;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "pricesale")
	private Double priceSale;
	
	private String screen;
	
	private String resolution; //Độ phân giải
	
	private String widescreen; //Màn hình rộng
	
	@Column(name = "systems", length = 100)
	private String system; //Hệ điều hành
	
	private String cpu;
	
	private String speedCpu; //Tốc độ CPU
	
	private String gpuGrapphics; //Chip đồ họa
	
	private Integer ram;
	
	private Integer memoryIn; //Bộ nhớ trong
	
	private String phoneBook; //Danh bạ
	
	private String mobileNetwork; //Mạng di động
	
	private String sim;
	
	private String charging; //Cổng kết nối / sạc
	
	private Integer capacityPin; //Dung lượng pin
	
	private String categoryPin; //Loại pin
}
