package com.example.ekranlogowania;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText Login;
    EditText Password;
    Button fajnyButton;

    TextView TwojLogin;
    TextView TwojeHaslo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            Login=findViewById(R.id.podajLogin);
            Password=findViewById(R.id.podajPassword);
            fajnyButton=findViewById(R.id.mojButton);
            TwojLogin=findViewById(R.id.pokazLogin);
            TwojeHaslo=findViewById(R.id.pokazPassword);

            fajnyButton.setOnClickListener(e->{
                String loginText=Login.getText().toString();
                TwojLogin.setText(loginText);

                String passowrdText=Password.getText().toString();
                TwojeHaslo.setText(passowrdText);
            });


            return insets;
        });
    }
}