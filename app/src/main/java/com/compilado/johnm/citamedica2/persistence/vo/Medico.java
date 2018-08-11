package com.compilado.johnm.citamedica2.persistence.vo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.UUID;

import io.reactivex.annotations.NonNull;

@Entity(tableName = "medico")
public class Medico {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idmedico")
    private Long idmedico;

    @ColumnInfo(name = "cod_tarjetapro")
    private String cod_tarjetapro;

    @ColumnInfo(name = "especialidad")
    private String especialidad;

    @ColumnInfo(name = "año_experiencia")
    private float año_experiencia;

    @ColumnInfo(name = "consultorio")
    private String consultorio;

    @ColumnInfo(name = "aten_domicilio")
    private boolean aten_domicilio;


    public Medico() {

    }

    @Ignore
    public Medico(String cod_tarjetapro, String especialidad, float año_experiencia, String consultorio, boolean aten_domicilio) {
        this.cod_tarjetapro = cod_tarjetapro;
        this.especialidad = especialidad;
        this.año_experiencia = año_experiencia;
        this.consultorio = consultorio;
        this.aten_domicilio = aten_domicilio;
    }

    @NonNull
    public Long getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(@NonNull Long idmedico) {
        this.idmedico = idmedico;
    }

    public String getCod_tarjetapro() {
        return cod_tarjetapro;
    }

    public void setCod_tarjetapro(String cod_tarjetapro) {
        this.cod_tarjetapro = cod_tarjetapro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getAño_experiencia() {
        return año_experiencia;
    }

    public void setAño_experiencia(float año_experiencia) {
        this.año_experiencia = año_experiencia;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public boolean isAten_domicilio() {
        return aten_domicilio;
    }

    public void setAten_domicilio(boolean aten_domicilio) {
        this.aten_domicilio = aten_domicilio;
    }

    @Override
    public String toString() {
        String medico = "ID medico: "+ idmedico+
                "\nCodigo tarjeta profecional: "+cod_tarjetapro+
                "\nEspecialidad: "+especialidad+
                "\nAños experiencia: "+año_experiencia+
                "\nConsultorio: "+consultorio+
                "\nAtencion a domicilio: "+((aten_domicilio)? "si" : "no");
        return medico;
    }
}
