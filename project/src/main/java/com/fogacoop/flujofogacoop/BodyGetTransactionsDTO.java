package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BodyGetTransactionsDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "ticketId")
	private java.lang.String ticketId;
	@org.kie.api.definition.type.Label(value = "trazabilityCode")
	private java.lang.String trazabilityCode;
	@org.kie.api.definition.type.Label(value = "tranState")
	private java.lang.String tranState;
	@org.kie.api.definition.type.Label(value = "returnCode")
	private java.lang.String returnCode;
	@org.kie.api.definition.type.Label(value = "transValue")
	private java.lang.String transValue;
	@org.kie.api.definition.type.Label(value = "payCurrency")
	private java.lang.String payCurrency;
	@org.kie.api.definition.type.Label(value = "fiCode")
	private java.lang.String fiCode;
	@org.kie.api.definition.type.Label(value = "bankName")
	private java.lang.String bankName;


	public java.lang.String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(java.lang.String ticketId) {
		this.ticketId = ticketId;
	}

	public java.lang.String getTrazabilityCode() {
		return this.trazabilityCode;
	}

	public void setTrazabilityCode(java.lang.String trazabilityCode) {
		this.trazabilityCode = trazabilityCode;
	}

	public java.lang.String getTranState() {
		return this.tranState;
	}

	public void setTranState(java.lang.String tranState) {
		this.tranState = tranState;
	}

	public java.lang.String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(java.lang.String returnCode) {
		this.returnCode = returnCode;
	}

	public java.lang.String getTransValue() {
		return this.transValue;
	}

	public void setTransValue(java.lang.String transValue) {
		this.transValue = transValue;
	}

	public java.lang.String getPayCurrency() {
		return this.payCurrency;
	}

	public void setPayCurrency(java.lang.String payCurrency) {
		this.payCurrency = payCurrency;
	}

	public java.lang.String getFiCode() {
		return this.fiCode;
	}

	public void setFiCode(java.lang.String fiCode) {
		this.fiCode = fiCode;
	}

	public java.lang.String getBankName() {
		return this.bankName;
	}

	public void setBankName(java.lang.String bankName) {
		this.bankName = bankName;
	}


    public BodyGetTransactionsDTO(java.lang.String ticketId,
			java.lang.String trazabilityCode, java.lang.String tranState,
			java.lang.String returnCode, java.lang.String transValue,
			java.lang.String payCurrency, java.lang.String fiCode,
			java.lang.String bankName) {
		this.ticketId = ticketId;
		this.trazabilityCode = trazabilityCode;
		this.tranState = tranState;
		this.returnCode = returnCode;
		this.transValue = transValue;
		this.payCurrency = payCurrency;
		this.fiCode = fiCode;
		this.bankName = bankName;
	}



}