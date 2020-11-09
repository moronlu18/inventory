package com.moronlu18.inventory.iu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.moronlu18.inventory.R;

public class SignUpActivity extends AppCompatActivity {
    private String user;
    private String password;
    private String confirmPassword;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Se recoge el usuario
        TextInputEditText tieUser=findViewById(R.id.tieUser);
        user=tieUser.getText().toString();

        //se recoge la primera contraseña
        TextInputEditText tiePassword=findViewById(R.id.tiePassword);
        password=tiePassword.getText().toString();

        //se recoge la contraseña de confirmación
        TextInputEditText tieConfirmPassword=findViewById(R.id.tieConfirmPassword);
        confirmPassword=tieConfirmPassword.getText().toString();

        //se recoge el email
        TextInputEditText tieEmail=findViewById(R.id.tieEmail);
        email=tieEmail.getText().toString();


    }

    /**
     * Se ha dado de alta el usuario y pasamos a la pantalla Login
     */
    public void signUp(View view){
        Intent intent = new Intent(SignUpActivity.this, InventoryActivity.class);
        startActivity(intent);

    }

}