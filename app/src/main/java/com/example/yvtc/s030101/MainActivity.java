package com.example.yvtc.s030101;

import android.content.Intent;
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

    public void click3(View v)
    {
        EditText ed1,ed2;
        int a,b;
        ed1= (EditText) findViewById(R.id.editText2);
        ed2= (EditText) findViewById(R.id.editText3);

        a= Integer.valueOf(ed1.getText().toString());
        b= Integer.valueOf(ed2.getText().toString());
        TextView tv =(TextView) findViewById(R.id.textView4);
        tv.setText(String.valueOf(a+b));
    }

    public void click4(View v)
    {
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(it);
    }

}
