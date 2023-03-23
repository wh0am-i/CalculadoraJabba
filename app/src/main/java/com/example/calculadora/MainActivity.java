package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView resultado, contaAnterior;
    int[] Ids = {R.id.raiz, R.id.potencia, R.id.CE, R.id.C, R.id.sete, R.id.oito, R.id.nove, R.id.multi, R.id.quatro, R.id.cinco, R.id.seis, R.id.sub, R.id.um, R.id.dois, R.id.tres, R.id.soma, R.id.mudaSinal, R.id.zero, R.id.virgula, R.id.divisao, R.id.calcular};
    int[] nums = {R.id.zero, R.id.um, R.id.dois, R.id.tres, R.id.quatro, R.id.cinco, R.id.seis, R.id.sete, R.id.oito, R.id.nove}; //só pra diferenciar os números
    Button[] botoes = new Button[21];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        for (int i = 0; i <= 20; i++) {
            botoes[i] = findViewById(Ids[i]);
            for (int x = 0; x <= nums.length; x++) {
                if (Ids[i] == nums[x]) {
                    botoes[i].setOnClickListener(new View.OnClickListener() { //cria um listener para click
                        @Override
                        public void onClick(View view) { //chama o método
                            numeros(nums[x]);
                        }
                    });
                } else {
                    botoes[i].setOnClickListener(new View.OnClickListener() { //cria um listener para click
                        @Override
                        public void onClick(View view) { //chama o método
                            ((botoes[i]).toString()) ();
                        }
                    });
                }
            }
        }
    }

    public void numeros(int num) {

    }

    public void raiz() {
    }

    public void potencia() {
    }

    public void CE() {
    }

    public void C() {
    }

    public void multi() {
    }

    public void sub() {
    }

    public void soma() {
    }

    public void mudaSinal() {
    }

    public void virgula() {
    }

    public void divisao() {

    }

}