package com.cice.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="envios")
public class EntityEnvio {

	@Id
	@GeneratedValue
	private Long id;
	private String passWord;
	private String NombreUsuario;
	private String nombrePedido;
	private double pesoPedido;
	private String descriPedido;
	private int cantidadPedido;
	
	public EntityEnvio(Long id, String passWord, String nombreUsuario, String nombrePedido, double pesoPedido,
			String descriPedido, int cantidadPedido) {
		super();
		this.id = id;
		this.passWord = passWord;
		NombreUsuario = nombreUsuario;
		this.nombrePedido = nombrePedido;
		this.pesoPedido = pesoPedido;
		this.descriPedido = descriPedido;
		this.cantidadPedido = cantidadPedido;
	}
	
	
	public EntityEnvio() {
		
	}	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNombreUsuario() {
		return NombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}
	public String getNombrePedido() {
		return nombrePedido;
	}
	public void setNombrePedido(String nombrePedido) {
		this.nombrePedido = nombrePedido;
	}
	public double getPesoPedido() {
		return pesoPedido;
	}
	public void setPesoPedido(double pesoPedido) {
		this.pesoPedido = pesoPedido;
	}
	public String getDescriPedido() {
		return descriPedido;
	}
	public void setDescriPedido(String descriPedido) {
		this.descriPedido = descriPedido;
	}
	public int getCantidadPedido() {
		return cantidadPedido;
	}
	public void setCantidadPedido(int cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}
		
}
