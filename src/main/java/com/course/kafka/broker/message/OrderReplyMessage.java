package com.course.kafka.broker.message;

public class OrderReplyMessage {

	private String replyMessage;

	public String getReplyMessage() {
		return replyMessage;
	}

	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderReplyMessage [replyMessage=");
		builder.append(replyMessage);
		builder.append(", getReplyMessage()=");
		builder.append(getReplyMessage());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
