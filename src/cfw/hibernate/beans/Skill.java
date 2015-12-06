package cfw.hibernate.beans;

/**
 * @author Fangwei_Cai
 * @time since 2015年12月6日 上午11:02:01
 */
public class Skill {
	private String name;
	
	public Skill(){}
	
	public Skill(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skills [name=" + name + "]";
	}
	
	
}
