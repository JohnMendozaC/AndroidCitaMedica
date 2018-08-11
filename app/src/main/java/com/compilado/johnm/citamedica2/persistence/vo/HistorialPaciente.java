package com.compilado.johnm.citamedica2.persistence.vo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.Date;

@Entity(tableName = "historial_paciente",
        primaryKeys = {"idmedicofk", "idpacientefk"},
        foreignKeys = {
                @ForeignKey(entity = Medico.class,
                        parentColumns = "idmedico",
                        childColumns = "idmedicofk"),
                @ForeignKey(entity = Paciente.class,
                        parentColumns = "idpaciente",
                        childColumns = "idpacientefk")
        }
)
public class HistorialPaciente  implements Serializable{

    @NonNull
    @ColumnInfo(name = "idmedicofk")
    public final Long idmedicofk;

    @NonNull
    @ColumnInfo(name = "idpacientefk")
    public final Long idpacientefk;

    @ColumnInfo(name = "is_tratamiento")
    private boolean is_tratamiento;

    @ColumnInfo(name = "val_cuotamod")
    private float val_cuotamod;

    @ColumnInfo(name = "fyhnuevacita")
    private String fyhnuevacita;

    @ColumnInfo(name = "aten_cita")
    private boolean aten_cita;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] firma;


    public HistorialPaciente(Long idmedicofk, Long idpacientefk) {
        this.idmedicofk = idmedicofk;
        this.idpacientefk = idpacientefk;
    }

    @Ignore
    public HistorialPaciente() {
        idmedicofk = 0L;
        idpacientefk = 0L;
    }

    @Ignore
    public HistorialPaciente(@NonNull Long idmedicofk, @NonNull Long idpacientefk, boolean is_tratamiento, float val_cuotamod, String fyhnuevacita, boolean aten_cita, byte[] firma) {
        this.idmedicofk = idmedicofk;
        this.idpacientefk = idpacientefk;
        this.is_tratamiento = is_tratamiento;
        this.val_cuotamod = val_cuotamod;
        this.fyhnuevacita = fyhnuevacita;
        this.aten_cita = aten_cita;
        this.firma = firma;
    }



    public Long getIdmedicofk() {
        return idmedicofk;
    }

    public Long getIdpacientefk() {
        return idpacientefk;
    }

    public boolean isIs_tratamiento() {
        return is_tratamiento;
    }

    public void setIs_tratamiento(boolean is_tratamiento) {
        this.is_tratamiento = is_tratamiento;
    }

    public float getVal_cuotamod() {
        return val_cuotamod;
    }

    public void setVal_cuotamod(float val_cuotamod) {
        this.val_cuotamod = val_cuotamod;
    }

    public String getFyhnuevacita() {
        return fyhnuevacita;
    }

    public void setFyhnuevacita(String fyhnuevacita) {
        this.fyhnuevacita = fyhnuevacita;
    }

    public boolean isAten_cita() {
        return aten_cita;
    }

    public void setAten_cita(boolean aten_cita) {
        this.aten_cita = aten_cita;
    }

    public byte[] getFirma() {
        return firma;
    }

    public void setFirma(byte[] firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        String historial = "Medicoid :" + idmedicofk +"Pacienteid :"+idpacientefk+
                "\nTratamiento: " + (is_tratamiento ? "si" : "no") +
                "\nValor cuota moderadora: " + val_cuotamod +
                "\nFecha y hora de nueva cita: " + fyhnuevacita +
                "\nAtendio a la cita: " + (aten_cita ? "si" : "no");

        return historial;
    }
}
