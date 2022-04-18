 package com.example.hw_6_kudaibergenov_mukai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    private TextView tv_entrance;
    private TextView hello;
    private TextView tv_execution;
    private TextView et_gmail;
    private TextView et_password;
    private TextView btn_to_come_in;
    private TextView forget_password;
    private TextView click_here;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_entrance = findViewById(R.id.tv_entrance);
        hello = findViewById(R.id.hello);
        tv_execution = findViewById(R.id.tv_execution);
        et_gmail = findViewById(R.id.et_gmail);
        et_password = findViewById(R.id.et_password);
        btn_to_come_in = findViewById(R.id.btn_to_come_in);
        forget_password = findViewById(R.id.forget_passw);
        click_here = findViewById(R.id.click_here);

        et_gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
            if(et_gmail.getText().toString().isEmpty()){
                btn_to_come_in.setBackgroundColor(Color.GRAY);
            }else{
                btn_to_come_in.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
            }
            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(et_password.getText().toString().isEmpty()){
                    btn_to_come_in.setBackgroundColor(Color.GRAY);
                }else{
                    btn_to_come_in.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });

        btn_to_come_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_gmail.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")){
                    tv_entrance.setVisibility(View.GONE);
                    tv_execution.setVisibility(View.GONE);
                    et_gmail.setVisibility(View.GONE);
                    et_password.setVisibility(View.GONE);
                    btn_to_come_in.setVisibility(View.GONE);
                    click_here.setVisibility(View.GONE);
                    forget_password.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}