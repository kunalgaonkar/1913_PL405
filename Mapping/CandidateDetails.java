package Mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="CANDIDATEDETAILS")
public class CandidateDetails {
	
	@Id @GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator" , strategy="foreign" ,parameters ={@Parameter(value = "candidate" , name="property")})
	private int candidate_id;
	private String candidate_total;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}

	public String getCandidate_total() {
		return candidate_total;
	}

	public void setCandidate_total(String candidate_total) {
		this.candidate_total = candidate_total;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	
	
	
	
	
	
	
}