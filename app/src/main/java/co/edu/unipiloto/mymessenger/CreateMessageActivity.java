package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        //Instanciar el boton
        Button sendButton = (Button) findViewById(R.id.enviar);
        EditText editText = (EditText) findViewById(R.id.message);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateMessageActivity.this, RecieveMessageActivity.class);
                intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE, editText.getText().toString());
                startActivity(intent);
            }
        });
    }


}