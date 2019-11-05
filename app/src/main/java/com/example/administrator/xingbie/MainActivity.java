package com.example.administrator.xingbie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup group;
    private Button  button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group = (RadioGroup)this.findViewById(R.id.sex);
        button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int len = group.getChildCount();
                String magString = "";
                for (int i = 0;i<len;i++){
                    RadioButton radioButton = (RadioButton)group.getChildAt(i);
                    if (radioButton.isChecked()){
                        magString = radioButton.getText().toString();
                        break;
                    }
                }
                Toast.makeText(MainActivity.this,magString,1).show();
            }
        });
    }
}
