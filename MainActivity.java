package br.edu.ifsp.dmos5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText editFahrenheit;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFahrenheit = findViewById(R.id.fahrenheit);
        textResultado = findViewById(R.id.resultado);
    }

    public void converter(View view){
        double tempConvertida = Double.parseDouble(editFahrenheit.getText().toString());
        double resultado = ((tempConvertida - 32)/1.8);
        textResultado.setText(resultado + " ºC");

    }
}