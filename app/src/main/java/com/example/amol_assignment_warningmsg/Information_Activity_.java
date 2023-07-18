package com.example.amol_assignment_warningmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Information_Activity_ extends AppCompatActivity {
    private TextView info;
    private Button display;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_activity_);
        info = (TextView) findViewById(R.id.textView_info);
        display = (Button) findViewById(R.id.button_display);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info_str = "Kerala Chief Minister Pinarayi Vijayan on Friday congratulated the Indian Space Research Organisation (ISRO) for the successful launch of the third lunar mission,'Chandrayaan-3' and termed it as 'historic triumph' for the nation.";
                info.setText(info_str);
            }
        });
    }
}