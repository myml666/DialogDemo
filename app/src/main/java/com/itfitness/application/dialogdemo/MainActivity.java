package com.itfitness.application.dialogdemo;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private int mWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WindowManager wm = (WindowManager) this
                .getSystemService(Context.WINDOW_SERVICE);
        mWidth = wm.getDefaultDisplay().getWidth();
    }
    public void onClick(View view){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setView(R.layout.dialog_test);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setLayout( mWidth/4*3, LinearLayout.LayoutParams.WRAP_CONTENT);
        alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }
}
