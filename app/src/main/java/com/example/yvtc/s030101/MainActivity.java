package com.example.yvtc.s030101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        TextView tv;
        tv = (TextView) findViewById(R.id.textView2);
        tv.setText("Hello World");
    }

    public void click2(View v)
    {
        TextView tv;
        tv = (TextView) findViewById(R.id.textView2);
        EditText ed;
        ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();
        tv.setText(str);

    }
}
