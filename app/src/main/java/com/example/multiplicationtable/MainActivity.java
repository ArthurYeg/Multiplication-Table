package com.example.multiplicationtable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button btn_click;
    TextView tv_table;
    EditText et_input;
    String result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_click = (Button) findViewById(R.id.btn_click);
        tv_table = (TextView) findViewById(R.id.tv_table);
        et_input = (EditText) findViewById(R.id.et_input);


        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "You clicked the button", Toast.LENGTH_SHORT).show();

                String number = et_input.getText().toString();

                int num = Integer.parseInt(number);
                result = " ";
                for (int i = 1; i <= 10; i++) {

                    result+=num+" "+"*"+i+" "+"="+" "+num*i+"\n\n";
                    tv_table.setText(result);
                }

            }

        });
    }

}