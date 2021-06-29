package Mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATE")

public class Candidate {
	
	@Id @GeneratedValue
	private int candidate_id;
	private String candidate_firstname;
	private String candidate_lastname;
	
	public int getCandidate_id() {
		return candidate_id;
	}
	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}
	public String getCandidate_firstname() {
		return candidate_firstname;
	}
	public void setCandidate_firstname(String candidate_firstname) {
		this.candidate_firstname = candidate_firstname;
	}
	public String getCandidate_lastname() {
		return candidate_lastname;
	}
	public void setCandidate_lastname(String candidate_lastname) {
		this.candidate_lastname = candidate_lastname;
	}
	
	


}