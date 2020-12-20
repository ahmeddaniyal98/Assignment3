package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class quiz1 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_quiz1);

        LayoutInflater inflater = getLayoutInflater();

        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_quiz1, null, false);
        drawerLayout.addView(contentView, 0);

        Button startbutton=(Button)findViewById(R.id.button);
        final EditText nametext=(EditText)findViewById(R.id.editName);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nametext.getText().toString();
                Intent intent = new Intent(getApplicationContext(),quiz2.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });
    }
}