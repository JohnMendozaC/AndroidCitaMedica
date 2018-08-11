package com.compilado.johnm.citamedica2.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.compilado.johnm.citamedica2.R;
import com.compilado.johnm.citamedica2.persistence.vo.HistorialPaciente;
import com.compilado.johnm.citamedica2.persistence.vo.Medico;
import com.compilado.johnm.citamedica2.persistence.vo.Paciente;
import com.compilado.johnm.citamedica2.remote.APIServiceC;
import com.compilado.johnm.citamedica2.remote.ApiUtilsC;
import com.compilado.johnm.citamedica2.ui.injection.Injection;
import com.compilado.johnm.citamedica2.ui.viewmodel.HistorialPacienteViewModel;
import com.compilado.johnm.citamedica2.ui.viewmodel.MedicoViewModel;
import com.compilado.johnm.citamedica2.ui.viewmodel.PacienteViewModel;
import com.compilado.johnm.citamedica2.ui.viewmodelfactory.HistorialPacienteVMFactory;
import com.compilado.johnm.citamedica2.ui.viewmodelfactory.MedicoVMFactory;
import com.compilado.johnm.citamedica2.ui.viewmodelfactory.PacienteVMFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class SincronizarActivity extends AppCompatActivity {


    //Database
    private CompositeDisposable compositeDisposable;
    private PacienteVMFactory pacienteVMFactory;
    private PacienteViewModel pacienteViewModel;
    //HistorialPaciente
    private HistorialPacienteVMFactory pacienteHVMFactory;
    private HistorialPacienteViewModel pacienteHViewModel;
    //Medico
    private MedicoVMFactory medicoVMFactory;
    private MedicoViewModel medicoViewModel;


    //Datos Locales
    List<Paciente> datosPaciente;
    List<Medico> datosMedico;
    List<HistorialPaciente> datosHistorial;

    //Retrofit
    private APIServiceC mAPIService;
    private android.widget.EditText etTiempoSin;
    private android.widget.Button btnSincronizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sincronizar);
        this.btnSincronizar = (Button) findViewById(R.id.btnSincronizar);
        this.etTiempoSin = (EditText) findViewById(R.id.etTiempoSin);

        //Init
        mAPIService = ApiUtilsC.getAPIService();
        compositeDisposable = new CompositeDisposable();
        //Paciente
        pacienteVMFactory = Injection.providePacienteViewModelFactory(this);
        pacienteViewModel = ViewModelProviders.of(this, pacienteVMFactory)
                .get(PacienteViewModel.class);
        //HistorialPaciente
        pacienteHVMFactory = Injection.provideHistorialPacienteViewModelFactory(this);
        pacienteHViewModel = ViewModelProviders.of(this, pacienteHVMFactory)
                .get(HistorialPacienteViewModel.class);
        //Medico
        medicoVMFactory = Injection.provideMedicoViewModelFactory(this);
        medicoViewModel = ViewModelProviders.of(this, medicoVMFactory)
                .get(MedicoViewModel.class);
        //List
        datosPaciente = new ArrayList<>();
        datosMedico = new ArrayList<>();
        datosHistorial = new ArrayList<>();


    }

    public void descargarLocal() {
        pacienteHViewModel.getAllHistorialPacientes()
                .observe(this, new Observer<List<HistorialPaciente>>() {
                    @Override
                    public void onChanged(@Nullable List<HistorialPaciente> historialPacientes) {
                        datosHistorial.addAll(historialPacientes);
                    }
                });

        pacienteViewModel.getAllPacientes()
                .observe(this, new Observer<List<Paciente>>() {
                    @Override
                    public void onChanged(@Nullable final List<Paciente> pacientes) {
                        datosPaciente.addAll(pacientes);
                    }
                });

        medicoViewModel.getAllmedicos()
                .observe(this, new Observer<List<Medico>>() {
                    @Override
                    public void onChanged(@Nullable List<Medico> medicos) {
                        datosMedico.addAll(medicos);
                    }
                });

    }
}
