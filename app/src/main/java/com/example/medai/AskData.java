package com.example.medai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AskData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_data);
    }

    public void sendNewData(View view){
        EditText sbp = (EditText) findViewById(R.id.editText2);
        EditText dbp = (EditText) findViewById(R.id.editText3);
        EditText hr = (EditText) findViewById(R.id.editText4);
        EditText ir = (EditText) findViewById(R.id.editText6);
        String sBP = sbp.getText().toString();
        String dBP = dbp.getText().toString();
        String hR = hr.getText().toString();
        String iR = ir.getText().toString();
    }
}
