package com.ibm.bts.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Bug {
	@Id
	private String id;
	@NotNull
	@NotBlank
	private String description;
	@NotNull
	private String status;
	@NotNull
	private Date date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		String[] statusArray = { "New", "Assigned", "Open", "Fixed", "Pending Retest", "Retest", "Reopen", "Verified",
				"Closed", "Rejected", "Duplicate", "Deferred", "Not a Bug" };
		for (String bugStatus : statusArray) {
			if (bugStatus.equals(status)) {
				this.status = status;
			}
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}