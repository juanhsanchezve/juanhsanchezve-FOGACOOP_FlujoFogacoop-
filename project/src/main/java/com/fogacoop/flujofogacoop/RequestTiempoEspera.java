package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequestTiempoEspera implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("cicloActual")
	private java.lang.Integer cicloActual;
	@org.kie.api.definition.type.Label("tiempoEspecifico")
	private java.lang.Integer tiempoEspecifico;

	@org.kie.api.definition.type.Label("fechaEspecificaFin")
	private java.lang.String fechaEspecificaFin;

	@org.kie.api.definition.type.Label("fechaEspecificaInicio")
	private java.lang.String fechaEspecificaInicio;

	@org.kie.api.definition.type.Label(value = "tokenAutenticatedBusiness")
	private com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness;

	public RequestTiempoEspera() {
	}

	public java.lang.Integer getCicloActual() {
		return this.cicloActual;
	}

	public void setCicloActual(java.lang.Integer cicloActual) {
		this.cicloActual = cicloActual;
	}

	public java.lang.Integer getTiempoEspecifico() {
		return this.tiempoEspecifico;
	}

	public void setTiempoEspecifico(java.lang.Integer tiempoEspecifico) {
		this.tiempoEspecifico = tiempoEspecifico;
	}

	public java.lang.String getFechaEspecificaFin() {
		return this.fechaEspecificaFin;
	}

	public void setFechaEspecificaFin(java.lang.String fechaEspecificaFin) {
		this.fechaEspecificaFin = fechaEspecificaFin;
	}

	public java.lang.String getFechaEspecificaInicio() {
		return this.fechaEspecificaInicio;
	}

	public void setFechaEspecificaInicio(java.lang.String fechaEspecificaInicio) {
		this.fechaEspecificaInicio = fechaEspecificaInicio;
	}

	public com.fogacoop.flujofogacoop.TokenDTO getTokenAutenticatedBusiness() {
		return this.tokenAutenticatedBusiness;
	}

	public void setTokenAutenticatedBusiness(
			com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness) {
		this.tokenAutenticatedBusiness = tokenAutenticatedBusiness;
	}

	public RequestTiempoEspera(java.lang.Integer cicloActual,
			java.lang.Integer tiempoEspecifico,
			java.lang.String fechaEspecificaFin,
			java.lang.String fechaEspecificaInicio,
			com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness) {
		this.cicloActual = cicloActual;
		this.tiempoEspecifico = tiempoEspecifico;
		this.fechaEspecificaFin = fechaEspecificaFin;
		this.fechaEspecificaInicio = fechaEspecificaInicio;
		this.tokenAutenticatedBusiness = tokenAutenticatedBusiness;
	}

}