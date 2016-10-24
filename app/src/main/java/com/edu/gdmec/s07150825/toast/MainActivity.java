package com.edu.gdmec.s07150825.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast t=Toast.makeText(this,"学过了",Toast.LENGTH_SHORT);
        t.show();
    }

    public void b2(View v){
        //LayoutInflater lf=getLayoutInflater();
        //LayoutInflater lf=LayoutInflater.from(this);
        LayoutInflater lf= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vroot=lf.inflate(R.layout.toastroot,null);
        LinearLayout ll= (LinearLayout) vroot.findViewById(R.id.rootlayout);
        lf.inflate(R.layout.rootinfo,ll);
        Toast toast=new Toast(this);
        toast.setView(vroot);
        toast.show();
    }

    public void b3(View v){
        Toast toast =Toast.makeText(this,"四叶草-Java",Toast.LENGTH_LONG);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView img=new ImageView(this);
        img.setImageResource(R.drawable.four);
        View toastView=toast.getView();
        ll.addView(img);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }

}
