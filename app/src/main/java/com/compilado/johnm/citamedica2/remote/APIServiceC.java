package com.compilado.johnm.citamedica2.remote;


import com.compilado.johnm.citamedica2.remote.pojo.HistorialPojo;
import com.compilado.johnm.citamedica2.remote.pojo.MedicoPojo;
import com.compilado.johnm.citamedica2.remote.pojo.PacientePojo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface APIServiceC {

    //Crear UsuarioC
    @Headers("Content-Type: application/json")
    @POST("paciente")
    Call<PacientePojo> createPaciente(@Body PacientePojo paciente);


    //Crear UsuarioC
    @Headers("Content-Type: application/json")
    @POST("medico")
    Call<MedicoPojo> createMedico(@Body MedicoPojo medico);


    @Headers("Content-Type: application/json")
    @POST("historialpaciente")
    Call<HistorialPojo> createHistorial(@Body HistorialPojo historial);

}
