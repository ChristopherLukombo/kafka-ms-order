package com.course.kafka.broker.message;

public class PromotionMessage {

	private String promotionCode;

	public PromotionMessage() {
	}

	public PromotionMessage(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PromotionMessage [promotionCode=");
		builder.append(promotionCode);
		builder.append("]");
		return builder.toString();
	}

}
