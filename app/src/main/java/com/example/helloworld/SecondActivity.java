package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtusername,txtpassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        txtusername=findViewById(R.id.txtusername);
        txtpassword=findViewById(R.id.txtpassword);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String Strusername=bundle.getString("username");
            String Strpassword=bundle.getString("password");

            txtusername.setText(Strusername);
            txtpassword.setText(Strpassword);


        }
    }
}
