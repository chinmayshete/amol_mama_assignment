package com.example.amol_assignment_warningmsg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConfirmPasswordActivity extends AppCompatActivity {

    private EditText enterPass, confirmPass;
    private Button confirm;
    AlertDialog.Builder alertbuilder3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_password);
        enterPass = (EditText) findViewById(R.id.editText_enterPassword);
        confirmPass = (EditText) findViewById(R.id.editText_confirmPassword);
        confirm = (Button) findViewById(R.id.button_confirm);
        alertbuilder3 = new AlertDialog.Builder(this);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String passwordInput = enterPass.getText().toString().trim();
                String ConfitmpasswordInput = confirmPass.getText().toString().trim();
                if (passwordInput.isEmpty()&&ConfitmpasswordInput.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Field can't be empty",Toast.LENGTH_SHORT).show();
                }
                else if (!passwordInput.equals(ConfitmpasswordInput)) {
                    alertbuilder3.setTitle("Warning").setMessage("Password Would Not be matched").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).create().show();
                    Toast.makeText(getApplicationContext(),"Warning Message",Toast.LENGTH_SHORT).show();

                }
                else {
                    alertbuilder3.setTitle("Warning").setMessage("Password Matched").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).create().show();
                    Toast.makeText(getApplicationContext(),"Warning Message",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}