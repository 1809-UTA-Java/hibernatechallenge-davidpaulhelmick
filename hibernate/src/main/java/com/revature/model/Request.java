package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REQUESTS")
public class Request {
	@Id
	@Column(name="REQUEST_ID")
	int id;
	
	@Column(name = "AMOUNT")
	double amount;
	
	@Column(name = "STATUS")
	String status;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="REQUESTER")
	Employee requester;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getRequester() {
		return requester;
	}

	public void setRequester(Employee requester) {
		this.requester = requester;
	}
}
