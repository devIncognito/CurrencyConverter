package com.example.curencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

    void converterEuroToPound() {

        EditText currency1=(EditText) findViewById(R.id.currency1);
        currency1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText currency2=(EditText) findViewById(R.id.currency2);
        currency2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(currency1.getText().toString());
        double result=u*0.86;
        currency2.setText(String.valueOf(result));

    }

    void converterPoundToEuro() {

        EditText currency1=(EditText) findViewById(R.id.currency1);
        currency1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText currency2=(EditText) findViewById(R.id.currency2);
        currency2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(currency2.getText().toString());
        double result=u/0.86;
        currency1.setText(String.valueOf(result));

    }

    public void click4(View view) {

        converterEuroToPound();
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);

    }

    public void click5(View view) {

        converterPoundToEuro();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);

    }

    void converterYenToSwissFranc() {

        EditText currency1=(EditText) findViewById(R.id.currency1);
        currency1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText currency2=(EditText) findViewById(R.id.currency2);
        currency2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(currency1.getText().toString());
        double result=u*0.0090;
        currency2.setText(String.valueOf(result));

    }

    void converterSwissFrancToYen() {

        EditText currency1=(EditText) findViewById(R.id.currency1);
        currency1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText currency2=(EditText) findViewById(R.id.currency2);
        currency2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(currency2.getText().toString());
        double result=u/0.0090;
        currency1.setText(String.valueOf(result));

    }

    public void click6(View view) {

        converterYenToSwissFranc();
        Button b3=(Button) findViewById(R.id.submit3);
        b3.setEnabled(false);

    }

    public void click7(View view) {

        converterSwissFrancToYen();
        Button b4=(Button) findViewById(R.id.submit4);
        b4.setEnabled(false);

    }

    void converterCanadianDollarToIndianRupee() {

        EditText currency1=(EditText) findViewById(R.id.currency1);
        currency1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText currency2=(EditText) findViewById(R.id.currency2);
        currency2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(currency1.getText().toString());
        double result=u*51.50;
        currency2.setText(String.valueOf(result));

    }

    void converterIndianRupeeToCanadianDollar() {

        EditText currency1=(EditText) findViewById(R.id.currency1);
        currency1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText currency2=(EditText) findViewById(R.id.currency2);
        currency2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(currency2.getText().toString());
        double result=u/51.50;
        currency1.setText(String.valueOf(result));

    }

    public void click8(View view) {

        converterCanadianDollarToIndianRupee();
        Button b5=(Button) findViewById(R.id.submit5);
        b5.setEnabled(false);

    }

    public void click9(View view) {

        converterIndianRupeeToCanadianDollar();
        Button b6=(Button) findViewById(R.id.submit6);
        b6.setEnabled(false);

    }

    public  void reset (View view) {

        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        Button b3=(Button) findViewById(R.id.submit3);
        b3.setEnabled(true);
        Button b4=(Button) findViewById(R.id.submit4);
        b4.setEnabled(true);
        Button b5=(Button) findViewById(R.id.submit5);
        b5.setEnabled(true);
        Button b6=(Button) findViewById(R.id.submit6);
        b6.setEnabled(true);
        EditText currency1=(EditText) findViewById(R.id.currency1);
        EditText currency2=(EditText) findViewById(R.id.currency2);
        currency1.setText("");
        currency2.setText("");

    }
}
