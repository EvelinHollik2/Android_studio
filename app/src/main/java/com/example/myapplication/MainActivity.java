package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;
TextView txtUzenet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        button.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                String nev = editText.getText().toString();
                txtUzenet.setText("Szia " + nev + "!");
            };
        });
    };
    void init(){
        editText = (EditText) findViewById(R.id.inputName);
        button = (Button) findViewById(R.id.btnUdvozol);
        txtUzenet = (TextView) findViewById(R.id.txtUzenet);
    }
}
