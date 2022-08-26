package com.project.quanlybanhang.convert;

import java.util.Base64;

import org.springframework.stereotype.Component;

import com.project.quanlybanhang.dto.ProductDTO;
import com.project.quanlybanhang.entities.ProductsEntity;

@Component
public class ProductConvert {

	public ProductDTO toDTO(ProductsEntity entity){
		
		ProductDTO dto = new ProductDTO();
		if(entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setNamePhone(entity.getNamePhone());
		dto.setPrice(entity.getPrice());
		dto.setPriceSale(entity.getPriceSale());
		dto.setImage(entity.getImage());
		dto.setDescription(entity.getDescription());
		dto.setShortDiscription(entity.getShortDiscription());
		dto.setScreen(entity.getSystem());
		dto.setResolution(entity.getResolution());
		dto.setWidescreen(entity.getWidescreen());
		dto.setSystem(entity.getSystem());
		dto.setCpu(entity.getCpu());
		dto.setSpeedCpu(entity.getSpeedCpu());
		dto.setGpuGrapphics(entity.getGpuGrapphics());
		dto.setRam(entity.getRam());
		dto.setMemoryIn(entity.getMemoryIn());
		dto.setPhoneBook(entity.getPhoneBook());
		dto.setMobileNetwork(entity.getMobileNetwork());
		dto.setSim(entity.getSim());
		dto.setCharging(entity.getCharging());
		dto.setCapacityPin(entity.getCapacityPin());
		dto.setCategoryPin(entity.getCategoryPin());
		return dto;
		
	}
	
	public ProductsEntity toEntity(ProductDTO dto){
		
		ProductsEntity entity = new ProductsEntity();
		
		entity.setNamePhone(dto.getNamePhone());
		entity.setPrice(dto.getPrice());
		entity.setPriceSale(dto.getPriceSale());
		//entity.setImage(dto.getImage());
		entity.setDescription(dto.getDescription());
		entity.setShortDiscription(dto.getShortDiscription());
		entity.setScreen(dto.getScreen());
		entity.setResolution(dto.getResolution());
		entity.setWidescreen(dto.getWidescreen());
		entity.setSystem(dto.getSystem());
		entity.setCpu(dto.getCpu());
		entity.setSpeedCpu(dto.getSpeedCpu());
		entity.setGpuGrapphics(dto.getGpuGrapphics());
		entity.setRam(dto.getRam());
		entity.setMemoryIn(dto.getMemoryIn());
		entity.setPhoneBook(dto.getPhoneBook());
		entity.setMobileNetwork(dto.getMobileNetwork());
		entity.setSim(dto.getSim());
		entity.setCharging(dto.getCharging());
		entity.setCapacityPin(dto.getCapacityPin());
		entity.setCategoryPin(dto.getCategoryPin());
		
		return entity;
		
	}
}
