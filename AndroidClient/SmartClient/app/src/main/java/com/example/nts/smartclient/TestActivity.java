package com.example.nts.smartclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    //TextView btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        /*btn_start = (TextView)findViewById(R.id.start);
        btn_start .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //do something
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ChessBoard.class);
                startActivity(intent);
            }
        });*/

    }
}
