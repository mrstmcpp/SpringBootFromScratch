package org.mrstm.springboot.userpage;

import com.google.gson.annotations.SerializedName;

public class Name{

	@SerializedName("firstname")
	private String firstname;

	@SerializedName("lastname")
	private String lastname;

	public String getFirstname(){
		return firstname;
	}

	public String getLastname(){
		return lastname;
	}

	@Override
 	public String toString(){
		return 
			"Name{" + 
			"firstname = '" + firstname + '\'' + 
			",lastname = '" + lastname + '\'' + 
			"}";
		}
}