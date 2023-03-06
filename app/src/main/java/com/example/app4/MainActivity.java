package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtVal1, txtVal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //txtVal1.setError("solo numeros");

        txtVal1=(EditText)findViewById(R.id.etvalor1);
        txtVal2=(EditText)findViewById(R.id.etvalor2);

        //txtVal1.setError("solo numeros");

    }
    public void sumar(View view){
        String val1String = txtVal1.getText().toString();
        String val2String = txtVal2.getText().toString();

        //txtVal1.setError("Ingrese valor 1");

        if(txtVal1.getText().toString().isEmpty()){//&&txtVal2.getText().toString().isEmpty()){

            //Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            txtVal1.setError("sin numero");
            //txtVal2.setError("sin numero");

        }else if(txtVal2.getText().toString().isEmpty()){

            txtVal2.setError("sin numero");

        }else {
            double val1int = Double.parseDouble(val1String);
            double val2int = Double.parseDouble(val2String);

            //txtVal1.setError("Ingrese valor 1");

            double resint = val1int + val2int;

            Toast.makeText(this, ""+resint, Toast.LENGTH_SHORT).show();
        }

        //double val1int = Integer.parseInt(val1String);
        //double val2int = Integer.parseInt(val2String);

        //txtVal1.setError("Ingrese valor 1");

        //double resint = val1int + val2int;

        //Toast.makeText(this, ""+resint, Toast.LENGTH_SHORT).show();

        }
    public void restar(View view){
        String val1String = txtVal1.getText().toString();
        String val2String = txtVal2.getText().toString();

        if(txtVal1.getText().toString().isEmpty()){//&&txtVal2.getText().toString().isEmpty()){

            //Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            txtVal1.setError("sin numero");
            //txtVal2.setError("sin numero");

        }else if(txtVal2.getText().toString().isEmpty()){

            txtVal2.setError("sin numero");

        }else {

            double val1int = Double.parseDouble(val1String);
            double val2int = Double.parseDouble(val2String);

            double resint = val1int - val2int;

            Toast.makeText(this, "" + resint, Toast.LENGTH_SHORT).show();
        }

    }
    public void multiplicar(View view){
        String val1String = txtVal1.getText().toString();
        String val2String = txtVal2.getText().toString();

        if(txtVal1.getText().toString().isEmpty()){//&&txtVal2.getText().toString().isEmpty()){

            //Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            txtVal1.setError("sin numero");
            //txtVal2.setError("sin numero");

        }else if(txtVal2.getText().toString().isEmpty()){

            txtVal2.setError("sin numero");

        }else {

            double val1int = Double.parseDouble(val1String);
            double val2int = Double.parseDouble(val2String);

            double resint = val1int * val2int;

            Toast.makeText(this, "" + resint, Toast.LENGTH_SHORT).show();
        }

    }
    public void dividir(View view){
        String val1String = txtVal1.getText().toString();
        String val2String = txtVal2.getText().toString();

        if(txtVal1.getText().toString().isEmpty()){//&&txtVal2.getText().toString().isEmpty()){

            //Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            txtVal1.setError("sin numero");
            //txtVal2.setError("sin numero");

        }else if(txtVal2.getText().toString().isEmpty()){

            txtVal2.setError("sin numero");

        }else {

            double val1int = Double.parseDouble(val1String);
            double val2int = Double.parseDouble(val2String);

            if (val2int!=0){

                double resint = val1int / val2int;
                Toast.makeText(this, "" + resint, Toast.LENGTH_SHORT).show();

            }else{ //if (val2int>0){

                Toast.makeText(this, "No se puede chavo", Toast.LENGTH_SHORT).show();
            }


        }

    }
}