package com.niit.shoppingbackend.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY  )
	int id;
	float grandtotal;
	User user;
	//private Collection<CardItem> cardlist=new ArrayList<>();
	

}
