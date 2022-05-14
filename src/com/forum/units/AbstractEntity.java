package com.forum.units;

import java.util.Date;

import com.forum.util.Utility;

public abstract class AbstractEntity {

	private Date created;
	private long id;

	/**
	 *
	 * Write a method called getId that requires no parameters and
	 * returns the id of this Abstract entity
	 *
	 * @return the id of this Abstract entity
	 */
	// Please write code for the getId method here
	
	public long getId() {
		return this.id;
	}
	
	/**
	 *
	 * Write a method called setId that takes in a parameter and
	 * sets the id of this Abstract entity to the parameter.
	 *
	 * This method should return void.
	 *
	 * @param id: the id of this Abstract entity
	 */
	// Please write code for the setId method here
	
	void setId(long id) {
		this.id = id;
	}
	
	/**
	 *
	 * Write an abstract method called autoGenerateId.
	 *
	 * This method doesn't require any parameters and returns void
	 *
	 */
	// Please write code for the autoGenerateId abstract method here
	
	public abstract void autoGenerateId();


	public Date getCreated() {
		return created;
	}

	public void setCreated() {
		this.created = Utility.getCurrentDate();
	}
}
