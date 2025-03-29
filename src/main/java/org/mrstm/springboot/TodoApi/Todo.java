package org.mrstm.springboot.TodoApi;

public class Todo{
	private Long id;
	private boolean completed;
	private String title;
	private int userId;

	public Todo(Long id , boolean completed , String title , int userId ){
		this.id = id;
		this.completed = completed;
		this.title = title;
		this.userId = userId;
	}
	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return id;
	}

	public void setCompleted(boolean completed){
		this.completed = completed;
	}

	public boolean isCompleted(){
		return completed;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}


	@Override
 	public String toString(){
		return 
			"Todo{" + 
			"id = '" + id + '\'' + 
			",completed = '" + completed + '\'' + 
			",title = '" + title + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}
