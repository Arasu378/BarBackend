package com.arasu;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
public class User implements Serializable {
	private static final long serialVersionUID=1L;
	@XmlElement(name="Id")

	private int id;
	@XmlElement(name="Name")

	private String name;
	@XmlElement(name="Location")

	private String location;
	@XmlElement(name="Mobile")

	private String mobile;
	@XmlElement(name="UserProfileId")

	public int userProfileId;
	@XmlElement(name="UserFirstName")

	public String userFirstName;
	@XmlElement(name="UserLastName")

	public String userLastName;
	@XmlElement(name="UserMobileNumber")

	public String userMobileNumber;
	@XmlElement(name="UserEmail")

	public String userEmail;
	@XmlElement(name="UserVenueName")

	public String userVenueName;
	@XmlElement(name="UserCountry")

	public String userCountry;
	@XmlElement(name="UserOftenInventory")

	public String userOftenInventory;
	@XmlElement(name="UserInventoryTime")

	public int userInventoryTime;
	@XmlElement(name="UserLastLogin")

	public String userLastLogin;
	@XmlElement(name="IsActive")

	public boolean isActive;
	@XmlElement(name="CreatedOn")

	public String createdOn;
	@XmlElement(name="ModifiedOn")

	public String modifiedOn;
	@XmlElement(name="Password")

	public String password;
	@XmlElement(name="UserRole")

	public String userRole;
	@XmlElement(name="ParentUserProfileId")
	public String parentUserProfileId;
	
	public User(){
		
	}

	public int getId() {
		return id;
	}

	public String getParentUserProfileId() {
		return parentUserProfileId;
	}

	public void setParentUserProfileId(String parentUserProfileId) {
		this.parentUserProfileId = parentUserProfileId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserVenueName() {
		return userVenueName;
	}

	public void setUserVenueName(String userVenueName) {
		this.userVenueName = userVenueName;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserOftenInventory() {
		return userOftenInventory;
	}

	public void setUserOftenInventory(String userOftenInventory) {
		this.userOftenInventory = userOftenInventory;
	}

	public int getUserInventoryTime() {
		return userInventoryTime;
	}

	public void setUserInventoryTime(int userInventoryTime) {
		this.userInventoryTime = userInventoryTime;
	}

	public String getUserLastLogin() {
		return userLastLogin;
	}

	public void setUserLastLogin(String userLastLogin) {
		this.userLastLogin = userLastLogin;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
