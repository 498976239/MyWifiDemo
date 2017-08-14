package com.ss.www.mywifidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_open;
    private Button btn_search;
    private Button btn_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn_open = (Button) findViewById(R.id.open_wifi);
        btn_search = (Button) findViewById(R.id.search_wifi);
        btn_close = (Button) findViewById(R.id.close_wifi);
    }
}
