package br.ufjf.dcc196.iancouto.exemplo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicaBotaoMensagem(View orige){
        TextView textViewMessage = findViewById(R.id.textViewMessage);
        String text = textViewMessage.getText().toString();

        TextView editTextNome = findViewById(R.id.editTextNome);
        TextView editTextStarter = findViewById(R.id.editTextStarterName);

        String nome = editTextNome.getText().toString();
        String starter = editTextStarter.getText().toString();
        String mensagem = String.format("Olá treinador %s! Seu starter é %s!",
                nome,
                starter);
        textViewMessage.setText(mensagem);
    }
}