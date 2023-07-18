package com.example.amol_assignment_warningmsg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button info;
    private Button pass_confirm;
    private Button warning;
    AlertDialog.Builder alertbuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button password = findViewById(R.id.pass_btn);
        info = findViewById(R.id.info_btn);
        pass_confirm = findViewById(R.id.ok_btn);
        warning = findViewById(R.id.warning_btn);
        alertbuilder = new AlertDialog.Builder(this);

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent1 = new Intent(getApplicationContext(), Password_Aleart_Activity.class );
                startActivity(intent1);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent2 = new Intent(getApplicationContext(), Information_Activity_.class);
                startActivity(intent2);
            }
        });

        pass_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), ConfirmPasswordActivity.class);
                startActivity(intent3);
            }
        });

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertbuilder.setTitle("Warning").setMessage("This is an warning message").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).create().show();
                Toast.makeText(getApplicationContext(),"Warning Message",Toast.LENGTH_SHORT).show();
            }
        });
    }

}