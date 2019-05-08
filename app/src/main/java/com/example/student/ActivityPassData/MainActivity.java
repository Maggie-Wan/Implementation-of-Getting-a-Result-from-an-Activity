package com.example.student.ActivityPassData;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final int RequestCode=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Intent in=new Intent();
        in.setClass(this,Main2Activity.class);
        startActivityForResult(in,RequestCode);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RequestCode){
            if(resultCode==RESULT_OK){
                Toast.makeText(this,data.getStringExtra("2data"),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
