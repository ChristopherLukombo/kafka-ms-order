package com.course.kafka.broker.message;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderMessage {

	private String orderLocation;
	
	private String orderNumber;
	
	private String creditCard;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime orderDateTime;
	
	private String itemName;
	
	private int price;
	
	private int quantity;

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderMessage [orderLocation=");
		builder.append(orderLocation);
		builder.append(", orderNumber=");
		builder.append(orderNumber);
		builder.append(", creditCard=");
		builder.append(creditCard);
		builder.append(", orderDateTime=");
		builder.append(orderDateTime);
		builder.append(", itemName=");
		builder.append(itemName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}
}
