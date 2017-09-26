package com.cocoon.jay.linewrapradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> dataList = new ArrayList<>();
        dataList.add("好几个字");
        dataList.add("好几个字好几个字");
        dataList.add("好几个字好几");
        dataList.add("好几个字好几个字好几个字");
        dataList.add("好几个字好几个字好几个字好几个字");
        dataList.add("好几个");
        dataList.add("好几个字好几个字");
        dataList.add("好几个");
        dataList.add("好几个字");
        dataList.add("好几个字");
        dataList.add("好几个字");

        final LineBreakLayout lineBreakLayout =  (LineBreakLayout) findViewById(R.id.lineBreakLayout);
        lineBreakLayout.setLables(dataList, false);

        lineBreakLayout.setOnCertainButtonClickListener(new LineBreakLayout.OnCertainButtonClickListener() {
            @Override
            public void onCertainButtonClick(String tag) {
                Toast.makeText(MainActivity.this, tag, Toast.LENGTH_LONG).show();
            }
        });



    }
}
