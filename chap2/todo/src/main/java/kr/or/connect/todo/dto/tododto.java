package kr.or.connect.todo.dto;

public class tododto {
	private Integer todoId;
	private String todoTitle;
	private String todoName;
	private Integer sequence;
	private String type;
	private String regdate;
	
	public tododto(Integer todoId, String todoTitle, String todoName, Integer sequence, String type, String regdate) {
		super();
		this.todoId = todoId;
		this.todoTitle = todoTitle;
		this.todoName = todoName;
		this.sequence = sequence;
		this.type = type;
		this.regdate = regdate;
	}

	public Integer getId() {
		return todoId;
	}
	
	public String getTitle() {
		return todoTitle;
	}
	
	public String getName() {
		return todoName;
	}
	
	public Integer getSequence() {
		return sequence;
	}
	
	public String getType() {
		return type;
	}
	
	public String getRegDate() {
		return regdate;
	}

	public void setId(Integer todoId) {
		this.todoId = todoId;
	}

	public void setTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public void setName(String todoName) {
		this.todoName = todoName;
	}
	
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setTime(String regdate) {
		this.regdate = regdate;
	}

//	@Override
//	public String toString() {
//		return "Todo [ Id = " + todoId + ", Title = " + todoTitle + ", Name = " + todoName + ", Sequence = " + sequence + ", Type = " + type + ", Datetime = " + regdate + "]";
//	}
}
