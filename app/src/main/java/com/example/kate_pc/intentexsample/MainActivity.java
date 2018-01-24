package com.example.kate_pc.intentexsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Summary summ;
    private Button btn_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.eText1);
        editText2 = (EditText) findViewById(R.id.eText2);
        try {
            summ.setA(Double.parseDouble(editText1.toString()));
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        try {
            summ.setB(Double.parseDouble(editText2.toString()));
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        btn_click = (Button) findViewById(R.id.btn_click);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplication(), LastActivity.class);
                intent.putExtra("summ", summ);
                startActivity(intent);
            }
        });

    }
}
