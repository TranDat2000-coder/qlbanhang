package com.project.quanlybanhang.dto;

import lombok.Data;

@Data
public class ProductDTO extends BaseDTO{

	private String namePhone;
	
	private String image;
	
	private String shortDiscription; //Mô tả ngắn
	
	private String description;
	
	private Double price;
	
	private Double priceSale;
	
	private String screen; //Màn hình
	
	private String resolution; //Độ phân giải
	
	private String widescreen; //Màn hình rộng

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

//	public byte[] getImage(byte[] image) {
//		return image;
//	}
}
