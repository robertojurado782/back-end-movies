package co.edu.iudigital.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gender")
public class Gender implements Serializable{
	
	@Id
	@Column(name="gender_id")
	private int gender_Id;
	private String name;
	/**
	 * @return the gender_Id
	 */
	public int getGender_Id() {
		return gender_Id;
	}
	/**
	 * @param gender_Id the gender_Id to set
	 */
	public void setGender_Id(int gender_Id) {
		this.gender_Id = gender_Id;
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

}
