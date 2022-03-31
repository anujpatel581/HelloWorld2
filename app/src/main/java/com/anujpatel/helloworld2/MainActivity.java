package com.anujpatel.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText=findViewById(R.id.editTextTextPersonName);
        Button b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText.getText().toString();

                Toast.makeText(getApplicationContext(),"You guy's are Devils: "+name,Toast.LENGTH_LONG).show();





            }
        });


    }
}