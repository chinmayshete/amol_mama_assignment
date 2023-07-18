package com.example.amol_assignment_warningmsg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Password_Aleart_Activity extends AppCompatActivity {
    private EditText password;
    private Button check;
    AlertDialog.Builder alertbuilder1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_aleart);

        password = (EditText) findViewById(R.id.editTextTextPassword);
        check = (Button) findViewById(R.id.buttonCheck);
        alertbuilder1 = new AlertDialog.Builder(this);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.equals(password.getText().toString(), "@qwerty123#")){
                    Toast.makeText(Password_Aleart_Activity.this,"Your entered password: "
                            +password.getText().toString()+" is correct.",Toast.LENGTH_SHORT).show();

            }
                else{
                    alertbuilder1.setTitle("Warning").setMessage("You entered wrong password!!!!!")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            }).create().show();

                }



            }
        });

    }
}