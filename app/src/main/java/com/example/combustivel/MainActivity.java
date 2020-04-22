package com.example.combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.alcool_id);
        precoGasolina = findViewById(R.id.gasolina_id);
        resultado = findViewById(R.id.resultado_id);

    }

    public void calcularResultado(View view){
        /* Calcula se alcool/gasolina >=70%  e  se for recomenda uso da gasolina do contrario alcool*/

        Double alcool = Double.parseDouble(precoAlcool.getText().toString());
        Double gasolina = Double.parseDouble(precoGasolina.getText().toString());
        Double resultadoCalculo = alcool/gasolina;

        if(resultadoCalculo >= 0.7){
            resultado.setText("USE GASOLINA");
        }else{
            resultado.setText("USE ÁLCOOL");
        }




    }

}
