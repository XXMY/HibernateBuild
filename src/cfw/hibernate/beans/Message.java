package cfw.hibernate.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @AUTHOR Cfw
 * @DATE 2015年11月29日 上午9:24:46
 */
@Entity
public class Message {
	@Id
	private int id;
	private String message;
	
	public Message(){
		super();
	}
	
	public Message(String message){
		this.message = message;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}