package Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {
		Candidate candidate_1 = new Candidate();
		Candidate candidate_2 = new Candidate();
		
		candidate_1.setCandidate_firstname("sunil");
		candidate_1.setCandidate_lastname("gaokar");
		
		candidate_2.setCandidate_firstname("Akbar");
		candidate_2.setCandidate_lastname("Naik");
		
		
		CandidateDetails candidate_1_details = new CandidateDetails();
		CandidateDetails candidate_2_details = new CandidateDetails();
		
		candidate_1_details.setCandidate_total("10");
		candidate_2_details.setCandidate_total("12");
		

		candidate_1_details.setCandidate(candidate_1);
		candidate_2_details.setCandidate(candidate_2);
		
		
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(candidate_1_details);
		session.save(candidate_2_details);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}