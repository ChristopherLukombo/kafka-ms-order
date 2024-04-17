package com.course.kafka.api.request;

import java.util.List;

public class OrderRequest {

	private String orderLocation;
	
	private String creditCardNumber;
	
	private List<OrderItemRequest> items;
	
	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public List<OrderItemRequest> getItems() {
		return items;
	}

	public void setItems(List<OrderItemRequest> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderRequest [orderLocation=");
		builder.append(orderLocation);
		builder.append(", creditCardNumber=");
		builder.append(creditCardNumber);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}
}
