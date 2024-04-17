package com.course.kafka.api.response;

public class OrderResponse {

	private String orderNumber;

	public OrderResponse() {
	}

	public OrderResponse(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderResponse [orderNumber=");
		builder.append(orderNumber);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
