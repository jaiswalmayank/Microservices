package com.quick.carpool.billing.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Invoice {

	@Id
	private Long id;

	@Column(name = "order_id")
	private Long orderId;

	@Column(name = "customer_Id")
	private String customerId;

	@Column(name = "amount")
	private BigInteger amount;

	@Column(name = "when_logged")
	private Date whenLogged;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public BigInteger getAmount() {
		return amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public Date getWhenLogged() {
		return whenLogged;
	}

	public void setWhenLogged(Date whenLogged) {
		this.whenLogged = whenLogged;
	}
}
