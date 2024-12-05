package com.example.myavatar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class ActivityResultados extends AppCompatActivity
{
    TextView resultadoNombre;
    TextView resultadoVida;
    TextView resultadoMagia;
    TextView resultadoFuerza;
    TextView resultadoVelocidad;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultados);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        avatar = findViewById(R.id.imageViewAvatar);
        resultadoNombre = findViewById(R.id.textViewNombre);
        resultadoVida = findViewById(R.id.textViewVida);
        resultadoMagia = findViewById(R.id.textViewMagia);
        resultadoFuerza = findViewById(R.id.textViewFuerza);
        resultadoVelocidad = findViewById(R.id.textViewVelocidad);
        Bundle extras =getIntent().getExtras();
        Random random = new Random();
        String nombre = extras.getString("nombre");
        String resultadoSexo = extras.getString("sexo");
        String resultadoEspecie = extras.getString("especie");
        String resultadoProfesion = extras.getString("profesion");
        String[] sexo = getResources().getStringArray(R.array.sexo);
        String[] especie = getResources().getStringArray(R.array.especie);
        String[] profesion = getResources().getStringArray(R.array.profesion);
        if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.elfohombrearquero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.elfomujerarquero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.elfohombreguerrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.elfomujerguerrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.elfohombremago);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.elfomujermago);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.elfohombreherrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.elfomujerherrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[4]))
        {
            avatar.setImageResource(R.drawable.elfohombreminero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[0]) && resultadoProfesion.equals(profesion[4]))
        {
            avatar.setImageResource(R.drawable.elfomujerminero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.enanohombrearquero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.enanomujerarquero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.enanohombreguerrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.enanomujerguerrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.enanohombremago);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.enanomujermago);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.enanohombreherrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.enanomujerherrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[4]))
        {
            avatar.setImageResource(R.drawable.enanohombreminero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[1]) && resultadoProfesion.equals(profesion[4]))
        {
            avatar.setImageResource(R.drawable.enanomujerminero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.hobbithombrearquero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.hobbitmujerarquero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.hobbithombreguerrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.hobbitmujerguerrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.hobbithombremago);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.hobbitmujermago);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.hobbithombreherrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.hobbitmujerherrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[4]))
        {
            avatar.setImageResource(R.drawable.hobbithombreminero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[2]) && resultadoProfesion.equals(profesion[4]))
        {
            avatar.setImageResource(R.drawable.hobbitmujerminero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.humanohombrearquero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[0]))
        {
            avatar.setImageResource(R.drawable.humanomujerarquero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.humanohombreguerrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[1]))
        {
            avatar.setImageResource(R.drawable.humanomujerguerrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.humanohombremago);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[2]))
        {
            avatar.setImageResource(R.drawable.humanomujermago);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.humanohombreherrero);
        }
        else if(resultadoSexo.equals(sexo[1]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[3]))
        {
            avatar.setImageResource(R.drawable.humanomujerherrero);
        }
        else if(resultadoSexo.equals(sexo[0]) && resultadoEspecie.equals(especie[3]) && resultadoProfesion.equals(profesion[4]))
        {
            avatar.setImageResource(R.drawable.humanohombreminero);
        }
        else
        {
            avatar.setImageResource(R.drawable.humanomujerminero);
        }
        resultadoNombre.setText(getString(R.string.resultadoNombre) + " " + nombre);
        resultadoVida.setText(getString(R.string.resultadoVida) + " " + random.nextInt(100));
        resultadoMagia.setText(getString(R.string.resultadoMagia) + " " + random.nextInt(10));
        resultadoFuerza.setText(getString(R.string.resultadoFuerza) + " " + random.nextInt(20));
        resultadoVelocidad.setText(getString(R.string.resultadoVelocidad) + " " + random.nextInt(5));
    }
}