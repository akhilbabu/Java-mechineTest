package com.mechinetest.javamechinetest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author cerin.cx
 * @since  Aug 9, 2018
 * @version 1.0
 */
@Entity
public class Questions
{

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="question")
	private String question;
	
	@Column(name="status")
	private String status;

	/**
	 * @return the id
	 */
	public Integer getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}

	/**
	 * @return the question
	 */
	public String getQuestion()
	{
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question)
	{
		this.question = question;
	}

	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	
}
