/**
 * 
 */
package com.jpms.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="User")
public class User {
	
	
	@Id
	@GeneratedValue
	@Column(name="USERID")
	public Integer userId;
	
	@Column(name="NAME")
	public String name;
	
	@Column(name="ADDRESS")
	public String address;
	
	@Column(name="SALARY")
	public String salary;

	User() {
		
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public User(Integer userId, String name, String address, String salary) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	

}
