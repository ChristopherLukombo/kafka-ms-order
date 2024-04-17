package com.course.kafka.api.request;

public class PromotionRequest {
	
	private String promotionCode;
	
	public PromotionRequest() {
	}

	public PromotionRequest(String promotionCode) {
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
		builder.append("PromotionRequest [promotionCode=");
		builder.append(promotionCode);
		builder.append("]");
		return builder.toString();
	}
	
	

}
