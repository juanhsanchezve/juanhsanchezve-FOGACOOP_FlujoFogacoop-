package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OwnerUserDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "user")
	private java.lang.String user;
	@org.kie.api.definition.type.Label(value = "password")
	private java.lang.String password;

	public OwnerUserDTO() {
	}

	public java.lang.String getUser() {
		return this.user;
	}

	public void setUser(java.lang.String user) {
		this.user = user;
	}

	public java.lang.String getPassword() {
		return this.password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public OwnerUserDTO(java.lang.String user, java.lang.String password) {
		this.user = user;
		this.password = password;
	}

}