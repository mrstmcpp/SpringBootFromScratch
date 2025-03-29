package org.mrstm.springboot.userpage;

import com.google.gson.annotations.SerializedName;

public class UserClass{

	@SerializedName("password")
	private String password;

	@SerializedName("address")
	private Address address;

	@SerializedName("phone")
	private String phone;

	@SerializedName("__v")
	private int v;

	@SerializedName("name")
	private Name name;

	@SerializedName("id")
	private int id;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	public String getPassword(){
		return password;
	}

	public Address getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public int getV(){
		return v;
	}

	public Name getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"UserClass{" + 
			"password = '" + password + '\'' + 
			",address = '" + address + '\'' + 
			",phone = '" + phone + '\'' + 
			",__v = '" + v + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}