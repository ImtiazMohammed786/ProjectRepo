package com.ge.far.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Imtiaz
 *
 */
@Entity
@Table(name = "USER")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	
	/**
	 * Default Constructor
	 */
	public User() {

	}

	/**
	 * @param name
	 * @param number
	 * 
	 *            Parametrized Constructor
	 */
	public User(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return id;
	}

	public void setUserId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
