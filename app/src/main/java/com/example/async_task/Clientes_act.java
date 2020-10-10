package com.example.async_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Planes;

public class Clientes_act extends AppCompatActivity {
    private Spinner sp1, sp2;
    private TextView txt;
    private EditText text;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        sp1 = (Spinner) findViewById(R.id.spinCliente);
        sp2 = (Spinner) findViewById(R.id.spinPlanes);
        text = (EditText) findViewById(R.id.plano);
        txt = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.btn);

        ArrayList<String> listaClientes = (ArrayList<String>) getIntent().getSerializableExtra("listaClientes");
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaClientes);
        sp1.setAdapter(adapt);

        ArrayList<String> listaPlanes = (ArrayList<String>) getIntent().getSerializableExtra("listaPlanes");
        ArrayAdapter<String> adapt2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaPlanes);
        sp2.setAdapter(adapt2);
    }


    public void Calcular(View v) {
        String cliente = sp1.getSelectedItem().toString();
        String plan = sp2.getSelectedItem().toString();
        Planes costo = new Planes();

        int monto= Integer.parseInt(text.getText().toString());

        if (cliente.equals("Pepe")) {
            switch (plan) {
                case "Norte":
                    txt.setText("El costo del plan es $" + costo.getNorte());
                    break;
                case "Cordillera":
                    txt.setText("El costo del plan es $" + costo.getCordillera());
                    break;
                case "Costa":
                    txt.setText("El costo del plan es $" + costo.getCosta());
                    break;
                case "Sur":
                    txt.setText("El costo del plan es $" + costo.getSur());
                    break;
                default:
                    txt.setText("No ingresaste ningun plan");
                    break;
            }
        } else if (cliente.equals("Pancho")) {
            switch (plan) {
                case "Norte":
                    txt.setText("El costo del plan es $" + costo.getNorte());
                    break;
                case "Cordillera":
                    txt.setText("El costo del plan es $" + costo.getCordillera());
                    break;
                case "Costa":
                    txt.setText("El costo del plan es $" + costo.getCosta());
                    break;
                case "Sur":
                    txt.setText("El costo del plan es $" + costo.getSur());
                    break;
                default:
                    txt.setText("No ingresaste ningun plan");
                    break;
            }
        } else if (cliente.equals("Adrian")) {
            switch (plan) {
                case "Norte":
                    txt.setText("El costo del plan es $" + costo.getNorte());
                    break;
                case "Cordillera":
                    txt.setText("El costo del plan es $" + costo.getCordillera());
                    break;
                case "Costa":
                    txt.setText("El costo del plan es $" + costo.getCosta());
                    break;
                case "Sur":
                    txt.setText("El costo del plan es $" + costo.getSur());
                    break;
                default:
                    txt.setText("No ingresaste ningun plan");
                    break;
            }
        } else {
            txt.setText("No ingresaste ningun cliente");
        }
    }
}