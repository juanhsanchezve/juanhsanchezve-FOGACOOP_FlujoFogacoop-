package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BodyCicloGestionMoraPSDDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "idDominio")
	private java.lang.Integer idDominio;
	@org.kie.api.definition.type.Label(value = "idPlantilla")
	private java.lang.Integer idPlantilla;
	@org.kie.api.definition.type.Label(value = "conteoDias")
	private java.lang.Integer conteoDias;
	@org.kie.api.definition.type.Label(value = "tiempoEsperaSiguienteCiclo")
	private java.lang.String tiempoEsperaSiguienteCiclo;
	@org.kie.api.definition.type.Label(value = "conteoDespuesVencimientoPago")
	private java.lang.Integer conteoDespuesVencimientoPago;

	public BodyCicloGestionMoraPSDDTO() {
	}

	public java.lang.Integer getIdDominio() {
		return this.idDominio;
	}

	public void setIdDominio(java.lang.Integer idDominio) {
		this.idDominio = idDominio;
	}

	public java.lang.Integer getIdPlantilla() {
		return this.idPlantilla;
	}

	public void setIdPlantilla(java.lang.Integer idPlantilla) {
		this.idPlantilla = idPlantilla;
	}

	public java.lang.Integer getConteoDias() {
		return this.conteoDias;
	}

	public void setConteoDias(java.lang.Integer conteoDias) {
		this.conteoDias = conteoDias;
	}

	public java.lang.String getTiempoEsperaSiguienteCiclo() {
		return this.tiempoEsperaSiguienteCiclo;
	}

	public void setTiempoEsperaSiguienteCiclo(
			java.lang.String tiempoEsperaSiguienteCiclo) {
		this.tiempoEsperaSiguienteCiclo = tiempoEsperaSiguienteCiclo;
	}

	public java.lang.Integer getConteoDespuesVencimientoPago() {
		return this.conteoDespuesVencimientoPago;
	}

	public void setConteoDespuesVencimientoPago(
			java.lang.Integer conteoDespuesVencimientoPago) {
		this.conteoDespuesVencimientoPago = conteoDespuesVencimientoPago;
	}

	public BodyCicloGestionMoraPSDDTO(java.lang.Integer idDominio,
			java.lang.Integer idPlantilla, java.lang.Integer conteoDias,
			java.lang.String tiempoEsperaSiguienteCiclo,
			java.lang.Integer conteoDespuesVencimientoPago) {
		this.idDominio = idDominio;
		this.idPlantilla = idPlantilla;
		this.conteoDias = conteoDias;
		this.tiempoEsperaSiguienteCiclo = tiempoEsperaSiguienteCiclo;
		this.conteoDespuesVencimientoPago = conteoDespuesVencimientoPago;
	}

}