package com.proyecto.apartahotel.sispart.facturacion.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.proyecto.apartahotel.sispart.facturacion.entity.ItemFactura;
import com.proyecto.apartahotel.sispart.huesped.entity.Huesped;

public class FacturaDTO {

	@NotEmpty
	private String descripcion;

	private List<ItemFactura> itemFactura;

	@Column(name = "fecha_creacion", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy", timezone = "GMT-5")
	private Date fechaCreacion;

	@Column(name = "hora_creacion", nullable = false)
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = "HH:mm:ss")
	@JsonFormat(pattern = "HH:mm:ss", timezone = "GMT-5")
	private Date horaCreacion;

	@NotEmpty
	private Huesped huesped;

	public FacturaDTO() {

		this.itemFactura = new ArrayList<>();
	}

	public FacturaDTO(@NotEmpty String descripcion, List<ItemFactura> itemFactura, Date fechaCreacion,
			Date horaCreacion, @NotEmpty Huesped huesped) {

		this.descripcion = descripcion;
		this.itemFactura = itemFactura;
		this.fechaCreacion = fechaCreacion;
		this.horaCreacion = horaCreacion;
		this.huesped = huesped;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<ItemFactura> getItemFactura() {
		return itemFactura;
	}

	public void setItemFactura(List<ItemFactura> itemFactura) {
		this.itemFactura = itemFactura;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getHoraCreacion() {
		return horaCreacion;
	}

	public void setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = horaCreacion;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}

}
