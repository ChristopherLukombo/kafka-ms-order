package com.course.kafka.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue
	private int orderId;
	
	@Column
	private String orderNumber;
	
	@Column
	private String orderLocation;
	
	@Column
	private LocalDateTime orderDateTime;
	
	@Column
	private String creditCardNumber;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> items;
	
	

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderId=");
		builder.append(orderId);
		builder.append(", orderNumber=");
		builder.append(orderNumber);
		builder.append(", orderLocation=");
		builder.append(orderLocation);
		builder.append(", orderDateTime=");
		builder.append(orderDateTime);
		builder.append(", creditCardNumber=");
		builder.append(creditCardNumber);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}

}
