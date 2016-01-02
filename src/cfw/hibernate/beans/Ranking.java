package cfw.hibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 上午11:02:09
 */
//@Entity
public class Ranking {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column
	private Person subject;
	
	//@Column
	private Person observer;
	
	//@Column
	private Skill skill;
	
	@Column
	private Integer rank;
	
	public Ranking(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getSubject() {
		return subject;
	}

	public void setSubject(Person subject) {
		this.subject = subject;
	}

	public Person getObserver() {
		return observer;
	}

	public void setObserver(Person observer) {
		this.observer = observer;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Ranking [id=" + id + ", subject=" + subject + ", observer="
				+ observer + ", skill=" + skill + ", rank=" + rank + "]";
	}

	
}
