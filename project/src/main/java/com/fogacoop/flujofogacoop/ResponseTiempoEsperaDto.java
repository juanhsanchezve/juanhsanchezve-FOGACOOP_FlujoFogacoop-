package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResponseTiempoEsperaDto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "body")
	private com.fogacoop.flujofogacoop.BodyTiempoEspera body;
	@org.kie.api.definition.type.Label(value = "status")
	private java.lang.String status;
	@org.kie.api.definition.type.Label(value = "timeResponse")
	private java.lang.String timeResponse;
	@org.kie.api.definition.type.Label(value = "message")
	private java.lang.String message;
	@org.kie.api.definition.type.Label(value = "path")
	private java.lang.String path;
	@org.kie.api.definition.type.Label(value = "transactionState")
	private java.lang.String transactionState;

	public ResponseTiempoEsperaDto() {
	}

	public com.fogacoop.flujofogacoop.BodyTiempoEspera getBody() {
		return this.body;
	}

	public void setBody(com.fogacoop.flujofogacoop.BodyTiempoEspera body) {
		this.body = body;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getTimeResponse() {
		return this.timeResponse;
	}

	public void setTimeResponse(java.lang.String timeResponse) {
		this.timeResponse = timeResponse;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getPath() {
		return this.path;
	}

	public void setPath(java.lang.String path) {
		this.path = path;
	}

	public java.lang.String getTransactionState() {
		return this.transactionState;
	}

	public void setTransactionState(java.lang.String transactionState) {
		this.transactionState = transactionState;
	}

	public ResponseTiempoEsperaDto(
			com.fogacoop.flujofogacoop.BodyTiempoEspera body,
			java.lang.String status, java.lang.String timeResponse,
			java.lang.String message, java.lang.String path,
			java.lang.String transactionState) {
		this.body = body;
		this.status = status;
		this.timeResponse = timeResponse;
		this.message = message;
		this.path = path;
		this.transactionState = transactionState;
	}

}
