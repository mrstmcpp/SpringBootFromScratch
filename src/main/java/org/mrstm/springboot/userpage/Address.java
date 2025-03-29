package org.mrstm.springboot.userpage;

import com.google.gson.annotations.SerializedName;

public class Address{

	@SerializedName("zipcode")
	private String zipcode;

	@SerializedName("number")
	private int number;

	@SerializedName("city")
	private String city;

	@SerializedName("street")
	private String street;

	@SerializedName("geolocation")
	private Geolocation geolocation;

	public String getZipcode(){
		return zipcode;
	}

	public int getNumber(){
		return number;
	}

	public String getCity(){
		return city;
	}

	public String getStreet(){
		return street;
	}

	public Geolocation getGeolocation(){
		return geolocation;
	}

	@Override
 	public String toString(){
		return 
			"Address{" + 
			"zipcode = '" + zipcode + '\'' + 
			",number = '" + number + '\'' + 
			",city = '" + city + '\'' + 
			",street = '" + street + '\'' + 
			",geolocation = '" + geolocation + '\'' + 
			"}";
		}
}