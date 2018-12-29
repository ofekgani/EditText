package com.example.ofekg.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tvName, tvEmail, tvPhone;
    public EditText etName, etEmail, etPhone;
    public Button btName, btEmail, btPhone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = findViewById(R.id.txtViewName);
        tvEmail = findViewById(R.id.txtViewEmail);
        tvPhone = findViewById(R.id.txtViewPhone);
        etName = findViewById(R.id.TxtName);
        etEmail = findViewById(R.id.TxtEmail);
        etPhone = findViewById(R.id.TxtPhone);
        btName = findViewById(R.id.btnName);
        btEmail = findViewById(R.id.btnEmail);
        btPhone = findViewById(R.id.btnPhone);

    }



    public void goName(View view) {
        String Name = etName.getText().toString().trim();
        tvName.setText("Your Name: "+ Name);

        if(etName.length() > 20){
            etName.setError("Name too long");
        }
    }

    public void goEmail(View view) {
        String Email = etEmail.getText().toString();
        tvEmail.setText("Your Email: "+ Email);
    }

    public void goPhone(View view) {
        String Phone = etPhone.getText().toString();
        tvPhone.setText("Your Number phone: "+ Phone);
    }
}
