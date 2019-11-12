package com.example.webservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etCep = findViewById(R.id.editText);
        final TextView tvResposta = findViewById(R.id.tvMain_resposta);

        Button botao = findViewById(R.id.btnMain_buscarCep);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tem mais que 0 cars, não é igual a branco, tem 8 digitos
                if (etCep.getText().toString().length()>0 && !etCep.getText().toString().equals("") && etCep.getText().toString().length()== 8){
                    //criar uma classe e ela é responsável por fazer o consumo do webservice

                    HTTPService service = new HTTPService(etCep.getText().toString());
                    try {
                       CEP retorno =  service.execute().get();
                        tvResposta.setText(retorno.toString());
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
