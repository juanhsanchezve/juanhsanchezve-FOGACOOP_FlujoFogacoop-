package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class RecaudoDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("nit")
	private java.lang.String nit;

	@org.kie.api.definition.type.Description("DTO que contiene los datos básicos  para continuar el flujo del proceso")
	@org.kie.api.definition.type.Label("fechaCorte")
	private java.lang.String fechaCorte;

	@org.kie.api.definition.type.Description("DTO que contiene la decision inicial del recaudo")
	@org.kie.api.definition.type.Label("decisionInicialRecaudo")
	private java.lang.String decisionInicialRecaudo;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "tokenAutenticatedBusiness")
	private com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness;

	public RecaudoDTO() {
	}

	public java.lang.String getNit() {
		return this.nit;
	}

	public void setNit(java.lang.String nit) {
		this.nit = nit;
	}

	public java.lang.String getFechaCorte() {
		return this.fechaCorte;
	}

	public void setFechaCorte(java.lang.String fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public java.lang.String getDecisionInicialRecaudo() {
		return this.decisionInicialRecaudo;
	}

	public void setDecisionInicialRecaudo(
			java.lang.String decisionInicialRecaudo) {
		this.decisionInicialRecaudo = decisionInicialRecaudo;
	}

	public com.fogacoop.flujofogacoop.TokenDTO getTokenAutenticatedBusiness() {
		return this.tokenAutenticatedBusiness;
	}

	public void setTokenAutenticatedBusiness(
			com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness) {
		this.tokenAutenticatedBusiness = tokenAutenticatedBusiness;
	}

	public RecaudoDTO(java.lang.String nit, java.lang.String fechaCorte,
			java.lang.String decisionInicialRecaudo,
			com.fogacoop.flujofogacoop.TokenDTO tokenAutenticatedBusiness) {
		this.nit = nit;
		this.fechaCorte = fechaCorte;
		this.decisionInicialRecaudo = decisionInicialRecaudo;
		this.tokenAutenticatedBusiness = tokenAutenticatedBusiness;
	}

}