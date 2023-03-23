package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView resultado, contaAnterior;
    String[] nomesIds = {"soma", "sub", "multi", "raiz",};
    Button[] botoes = new Button[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        for (int i = 0; i < 4; i++) {
            int id = getResources().getIdentifier(nomesIds[i], "id", getPackageName());
            botoes[i] = findViewById(id);
        }
    }
}