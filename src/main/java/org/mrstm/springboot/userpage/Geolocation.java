package org.mrstm.springboot.userpage;

import com.google.gson.annotations.SerializedName;

public class Geolocation{

	@SerializedName("lat")
	private String lat;

	@SerializedName("long")
	private String jsonMemberLong;

	public String getLat(){
		return lat;
	}

	public String getJsonMemberLong(){
		return jsonMemberLong;
	}

	@Override
 	public String toString(){
		return 
			"Geolocation{" + 
			"lat = '" + lat + '\'' + 
			",long = '" + jsonMemberLong + '\'' + 
			"}";
		}
}