package com.compilado.johnm.citamedica2.remote.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MedicoPojo {

    @SerializedName("idmedico")
    @Expose
    private Integer idmedico;
    @SerializedName("codTarjetapro")
    @Expose
    private String codTarjetapro;
    @SerializedName("especialidad")
    @Expose
    private String especialidad;
    @SerializedName("a\u00f1oExperiencia")
    @Expose
    private Double aOExperiencia;
    @SerializedName("consultorio")
    @Expose
    private String consultorio;
    @SerializedName("atenDomicilio")
    @Expose
    private Boolean atenDomicilio;

    public Integer getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(Integer idmedico) {
        this.idmedico = idmedico;
    }

    public String getCodTarjetapro() {
        return codTarjetapro;
    }

    public void setCodTarjetapro(String codTarjetapro) {
        this.codTarjetapro = codTarjetapro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getAOExperiencia() {
        return aOExperiencia;
    }

    public void setAOExperiencia(Double aOExperiencia) {
        this.aOExperiencia = aOExperiencia;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Boolean getAtenDomicilio() {
        return atenDomicilio;
    }

    public void setAtenDomicilio(Boolean atenDomicilio) {
        this.atenDomicilio = atenDomicilio;
    }

}
