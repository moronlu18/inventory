package com.moronlu18.inventory.iu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.moronlu18.inventory.R;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * Método que inicia la Activity SignUp
     *
     * @param view
     */
    public void showSignUp(View view) {

        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    /**
     * Método que valida si el inicio de sesión es correcto
     */
    public void validateUser(View view) {
        Intent intent = new Intent(LoginActivity.this, InventoryActivity.class);
        startActivity(intent);
    }

}