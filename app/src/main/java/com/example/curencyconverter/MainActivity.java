package com.example.curencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.others);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class );
        startActivity(intent);
    }

    void converterUsdToCedi() {

        EditText usd=(EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText ghcedi=(EditText) findViewById(R.id.ghcedi);
        ghcedi.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(usd.getText().toString());
        double result=u * 5.24;
        ghcedi.setText(String.valueOf(result));

    }

    void converterCediToUsd() {

        EditText usd=(EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText ghcedi=(EditText) findViewById(R.id.ghcedi);
        ghcedi.setInputType(InputType.TYPE_CLASS_NUMBER);

        double u=Integer.parseInt(ghcedi.getText().toString());
        double result=u / 5.24;
        usd.setText(String.valueOf(result));

    }

    public void click(View view) {

        converterUsdToCedi();
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);

    }

    public void click2(View view) {

        converterCediToUsd();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);

    }

    public  void reset (View view) {

        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText usd=(EditText) findViewById(R.id.usd);
        EditText ghcedi=(EditText) findViewById(R.id.ghcedi);
        usd.setText("");
        ghcedi.setText("");

    }

}
