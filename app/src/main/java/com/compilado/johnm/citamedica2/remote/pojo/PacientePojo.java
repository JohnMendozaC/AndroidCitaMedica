package com.compilado.johnm.citamedica2.remote.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PacientePojo {

    @SerializedName("idpaciente")
    @Expose
    private Integer idpaciente;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("apellidos")
    @Expose
    private String apellidos;
    @SerializedName("fechaNacimiento")
    @Expose
    private Integer fechaNacimiento;
    @SerializedName("identificacion")
    @Expose
    private String identificacion;

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


}


