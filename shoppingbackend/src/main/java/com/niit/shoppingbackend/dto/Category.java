package com.niit.shoppingbackend.dto;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Category implements Serializable{
	private static final long serialVersionUID=67781L;
	/*private field*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY  )
	private int id;
	@NotNull(message="name is required")
	@Size(min=1,max=50)
	private String name;
	@NotNull(message="name is required")
	@Size(min=1,max=50)
	private String desc;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//multipart
	@Transient
	@JsonIgnore
	private MultipartFile files;

	public MultipartFile getFiles() {
		return files;
	}
	public void setFiles(MultipartFile files) {
		this.files = files;
	}
	@Column(name="image_url")
	private String imageURL;
	@Column(name="is_active")
	private boolean active=true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	
	
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", desc=" + desc + ", imageURL=" + imageURL + ", active="
				+ active + "]";
	}
	

}
