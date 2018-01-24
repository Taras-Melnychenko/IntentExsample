package com.example.kate_pc.intentexsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kate-PC on 24.01.2018.
 */

public class LastActivity extends AppCompatActivity {

    private TextView txt_Result;
    private Button btn_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Summary summ = getIntent().getParcelableExtra("summary");
        txt_Result = (TextView) findViewById(R.id.txt_lastActivity) ;


        txt_Result.setText(summ.Summ(summ.getA(), summ.getB()));
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
