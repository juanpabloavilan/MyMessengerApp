package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);

        TextView texto = findViewById(R.id.showMessage);

        //Recuperar el mensaje del intent
        Intent intent = getIntent();
        String valor = intent.getStringExtra(EXTRA_MESSAGE);
        texto.setText(valor);
    }
}