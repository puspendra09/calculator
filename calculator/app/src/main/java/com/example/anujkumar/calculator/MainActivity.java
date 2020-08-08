package com.example.anujkumar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bm,bd,be,bdot,bc;
    TextView tv;
    int k=0;
    String op1,op2,op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bplus=findViewById(R.id.bplus);
        bminus=findViewById(R.id.bminus);
        bm=findViewById(R.id.bm);
        bd=findViewById(R.id.bd);
        be=findViewById(R.id.be);
        bdot=findViewById(R.id.bdot);
        tv=findViewById(R.id.tv);
        bc=findViewById(R.id.bc);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bplus.setOnClickListener(this);
        bminus.setOnClickListener(this);
        bm.setOnClickListener(this);
        bd.setOnClickListener(this);
        be.setOnClickListener(this);
        bdot.setOnClickListener(this);
        bc.setOnClickListener(this);


    }
    void calc()
    {

        float x,y,z;
        x=Float.parseFloat(op1);
        y=Float.parseFloat(op2);
        if (op.equals("+"))
            z=x+y;
        else if (op.equals("-"))
            z=x-y;
        else if (op.equals("*"))
            z=x*y;
        else
            z=x/y;
        String txt=""+z;
        tv.setText(txt);
    }


    @Override
    public void onClick(View v) {
        Button b=(Button)v;
        if (b==b0||b==b1||b==b2||b==b3||b==b4||b==b5||b==b6||b==b7||b==b8||b==b9||b==bc)
        {
            if (k==0)
            {
                tv.setText(b.getText().toString());
                k=1;
            }
            else
            {
                String s=tv.getText().toString();
                s=s+b.getText().toString();
                tv.setText(s);
            }
        }

        if(b==bplus||b==bminus||b==bm||b==bd)
        {
            if(op!=null)
            {
                op2=tv.getText().toString();
                calc();
            }
            op1=tv.getText().toString();
            op=b.getText().toString();
            k=0;
        }
        if (b==be)
        {
            op2=tv.getText().toString();
            calc();
        }
        if(b==bc)
        {
            tv.setText("");
        }

    }
}
