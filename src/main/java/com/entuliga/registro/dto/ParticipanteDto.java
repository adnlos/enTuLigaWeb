package com.entuliga.registro.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TBL_PARTICIPANTE")
public class ParticipanteDto {
	
	private Integer idParticipante;
	private String nombreP;
	private String apellidoPaternoP;
	private String apellidoMaternoP;
	private Date fechaNacimientoP;
	private Integer idGeneroP;
	private String MailP;
	private String estadoP;
	private String usuarioP;
	private String passwordP;
	
	@Id
	@GeneratedValue
	@Column(name="ID_PARTICIPANTE")
	public Integer getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(Integer idParticipante) {
		this.idParticipante = idParticipante;
	}
	
	@Column (name ="NOMBRE_P")
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	
	@Column(name="APELLIDO_PATERNO_P")
	public String getApellidoPaternoP() {
		return apellidoPaternoP;
	}
	public void setApellidoPaternoP(String apellidoPaternoP) {
		this.apellidoPaternoP = apellidoPaternoP;
	}
	
	@Column(name="APELLIDO_MATERNO_P")
	public String getApellidoMaternoP() {
		return apellidoMaternoP;
	}
	public void setApellidoMaternoP(String apellidoMaternoP) {
		this.apellidoMaternoP = apellidoMaternoP;
	}
	
	@Column(name="FECHA_NACIMIENTO_P")
	public Date getFechaNacimientoP() {
		return fechaNacimientoP;
	}
	public void setFechaNacimientoP(Date fechaNacimientoP) {
		this.fechaNacimientoP = fechaNacimientoP;
	}
	
	@Column(name="MAIL_P")
	public String getMailP() {
		return MailP;
	}
	public void setMailP(String mailP) {
		MailP = mailP;
	}
	
	@Column(name="ESTADO_P")
	public String getEstadoP() {
		return estadoP;
	}
	public void setEstadoP(String estadoP) {
		this.estadoP = estadoP;
	}
	
	@Column(name="USUARIO")
	public String getUsuarioP() {
		return usuarioP;
	}
	public void setUsuarioP(String usuarioP) {
		this.usuarioP = usuarioP;
	}
	
	@Column(name="CONTRASENA")
	public String getPasswordP() {
		return passwordP;
	}
	public void setPasswordP(String passwordP) {
		this.passwordP = passwordP;
	}
	
	@Column(name="ID_GENERO")
	public Integer getIdGeneroP() {
		return idGeneroP;
	}
	public void setIdGeneroP(Integer idGeneroP) {
		this.idGeneroP = idGeneroP;
	}
}
