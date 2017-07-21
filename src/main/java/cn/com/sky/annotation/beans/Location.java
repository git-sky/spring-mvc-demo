package cn.com.sky.annotation.beans;

public class Location {

	String city;
	String province;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", province=" + province + "]";
	}

}