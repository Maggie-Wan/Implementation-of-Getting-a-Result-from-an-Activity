package com.example.student.ActivityPassData;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void ok(View view) {
        EditText text=(EditText)findViewById(R.id.text);
        String str=text.getText().toString();
        Intent in=new Intent();
        in.putExtra("2data",str);
        setResult(RESULT_OK,in);
        finish();


    }
}
