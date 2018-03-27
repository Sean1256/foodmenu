package com.example.yb.foodmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view){
        CheckBox chk;
        String msg="";
        int[] id = {R.id.chk1,R.id.chk2,R.id.chk3,R.id.chk4};
        for (int i:id) {
            chk = (CheckBox)findViewById(i);
            if (chk.isChecked()) {
                msg +="\n"+chk.getText();
            }
        }
        if (msg.length() > 0) {
            msg = "你点购的餐点是：" + msg;
        } else {
            msg = "请点餐！";
        }
        ((TextView)findViewById(R.id.showOrder)).setText(msg);
    }

}
