package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequestAplicacionPagoDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String idPago;
	private java.lang.String nit;

	public RequestAplicacionPagoDTO() {
	}

	public java.lang.String getIdPago() {
		return this.idPago;
	}

	public void setIdPago(java.lang.String idPago) {
		this.idPago = idPago;
	}

	public java.lang.String getNit() {
		return this.nit;
	}

	public void setNit(java.lang.String nit) {
		this.nit = nit;
	}

	public RequestAplicacionPagoDTO(java.lang.String idPago,
			java.lang.String nit) {
		this.idPago = idPago;
		this.nit = nit;
	}

}