package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView resultado, contaAnterior;
    int[] Ids = {R.id.raiz, R.id.potencia, R.id.CE, R.id.C, R.id.sete, R.id.oito, R.id.nove, R.id.multi, R.id.quatro, R.id.cinco, R.id.seis, R.id.sub, R.id.um, R.id.dois, R.id.tres, R.id.soma, R.id.mudaSinal, R.id.zero, R.id.virgula, R.id.divisao, R.id.calcular};
    Button[] botoes = new Button[21];
    String texto;
    String atualOpera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        resultado = findViewById(R.id.resultado);
        texto = resultado.getText().toString();
        atualOpera = "";
        contaAnterior = findViewById(R.id.contaAnterior);
        for (int i = 0; i <= 20; i++) {
            botoes[i] = findViewById(Ids[i]);
            int finalI = i;
            if ((Ids[i] == (R.id.CE)) || (Ids[i] == (R.id.C)) || (Ids[i] == (R.id.mudaSinal))) {
                botoes[i].setOnClickListener(new View.OnClickListener() { //cria umlistener para click
                    @Override
                    public void onClick(View view) { //chama o método
                        operacao(botoes[finalI]);
                    }
                });
            } else {
                botoes[i].setOnClickListener(new View.OnClickListener() { //cria um listener para click
                    @Override
                    public void onClick(View view) { //chama o método
                        caracteres(botoes[finalI]);
                    }
                });
            }
        }
        botoes[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });
    }

    public void caracteres(Button carac) {
        if (texto.equals("0")) {
            texto = (carac.getText().toString());
            resultado.setText(texto);
        } else if (carac.getText().toString().equals("+") || carac.getText().toString().equals("-") || carac.getText().toString().equals("x") || carac.getText().toString().equals(":")) {
            atualOpera = carac.getText().toString();
        }
        else {
            if ((!carac.getText().toString().equals("+") || !carac.getText().toString().equals("-") || !carac.getText().toString().equals("x")|| !carac.getText().toString().equals(":"))&& atualOpera != "") {
                int textoValue = Integer.parseInt(texto);
                if (atualOpera.equals("+")) {
                    textoValue = Integer.parseInt(texto)+Integer.parseInt(carac.getText().toString());
                    atualOpera = "";
                    resultado.setText(textoValue+"");
                }
                else if (atualOpera.equals("-")) {
                    textoValue = textoValue-Integer.parseInt(carac.getText().toString());
                    atualOpera = "";
                    resultado.setText(textoValue+"");
                }
                else if (atualOpera.equals("x")) {
                    textoValue = textoValue*Integer.parseInt(carac.getText().toString());
                    atualOpera = "";
                    resultado.setText(textoValue+"");
                }
                else if (atualOpera.equals(":")) {
                    textoValue = textoValue/Integer.parseInt(carac.getText().toString());
                    atualOpera = "";
                    resultado.setText(textoValue+"");
                }
            } else if (texto.length() <= 15) {
                texto += (carac.getText().toString());
                resultado.setText(texto);
            }
        }

    }

    public void operacao(Button opera) {
        if (opera.getText().toString().equals("CE")) {
            contaAnterior.setText(resultado.getText().toString());
            texto = "0";
            resultado.setText(texto);
        }

    }

    public void calcular() {
    }

    public void raiz() {
    }

    public void potencia() {
    }


    public void C() {
    }

    public void mudaSinal() {
    }

    public void virgula() {
    }


}