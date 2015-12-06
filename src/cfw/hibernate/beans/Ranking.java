package cfw.hibernate.beans;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 上午11:02:09
 */
public class Ranking {
	private Person subject;
	
	private Person observer;
	
	private Skill skill;
	
	private Integer rank;
	
	public Ranking(){}

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
		return "Ranking [subject=" + subject + ", observer=" + observer
				+ ", skill=" + skill + ", rank=" + rank + "]";
	}
	
	
	
}
