package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_WORK")
public class WorkDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name = "WORKNAME", length = 50, nullable = true)
	public String workName;
	@Column(name = "STARTINGDATE", nullable = true)
	public String startingDate;
	@Column(name = "ENDINGDATE", nullable = true)
	public String endingDate;
	@Column(name = "STATUS", length = 10, nullable = true)
	public String status;
	
	public WorkDto() {

	}

	public WorkDto(int id, String workName, String startingDate, String endingDate, String status) {
		this.id = id;
		endingDate = workName;
		endingDate = startingDate;
		startingDate = endingDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWorkName() {
		return endingDate;
	}
	public void setWorkName(String workName) {
		endingDate = workName;
	}
	public String getStartingDate() {
		return endingDate;
	}
	public void setStartingDate(String startingDate) {
		endingDate = startingDate;
	}
	public String getEndingDate() {
		return startingDate;
	}
	public void setEndingDate(String endingDate) {
		startingDate = endingDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
