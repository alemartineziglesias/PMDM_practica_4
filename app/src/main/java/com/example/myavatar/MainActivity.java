package com.example.myavatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MetodosDialogos
{
    DialogoNombre dialogo;
    Button boton;
    String nombreResultado;
    String sexoResultado;
    String especieResultado;
    String profesionResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        boton = findViewById(R.id.button);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        dialogo = new DialogoNombre();
        dialogo.setCancelable(false);
        dialogo.show(getSupportFragmentManager(), getString(R.string.dialogoNombre));
    }

    @Override
    public void EnviarNombre(String nombre)
    {
        nombreResultado = nombre;
        DialogoSexo dialogo = new DialogoSexo();
        dialogo.setCancelable(false);
        dialogo.show(getSupportFragmentManager(), getString(R.string.dialogoSexo));
    }

    @Override
    public void EnviarSexo(String sexo)
    {
        sexoResultado = sexo;
        DialogoEspecie dialogo = new DialogoEspecie();
        dialogo.setCancelable(false);
        dialogo.show(getSupportFragmentManager(), getString(R.string.dialogoEspecie));
    }

    @Override
    public void EnviarEspecie(String especie)
    {
        especieResultado = especie;
        DialogoProfesion dialogo = new DialogoProfesion();
        dialogo.setCancelable(false);
        dialogo.show(getSupportFragmentManager(), getString(R.string.dialogoProfesion));
    }

    @Override
    public void EnviarProfesion(String profesion)
    {
        profesionResultado = profesion;
        Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
        intent.putExtra("nombre", nombreResultado);
        intent.putExtra("sexo", sexoResultado);
        intent.putExtra("especie", especieResultado);
        intent.putExtra("profesion", profesionResultado);
        startActivity(intent);
    }
}