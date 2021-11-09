package com.example.uniform_invoice_lottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;

    int btn;

    public void r(){
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);

        b1.setText("2018 1,2月 發票");
        b2.setText("2018 3,4月 發票");
        b3.setText("2018 5,6月 發票");
        b4.setText("2018 7,8月 發票");
        b5.setText("2018 9,10月 發票");
        b6.setText("2018 11,12月 發票");
    }

    public void btn1(View view){
        r();
        b1.setText("✓ 2018 1,2月 發票");
        btn = 1;
    }

    public void btn2(View view){
        r();
        b2.setText("✓ 2018 3,4月 發票");
        btn = 2;
    }

    public void btn3(View view){
        r();
        b3.setText("✓ 2018 5,6月 發票");
        btn = 3;
    }

    public void btn4(View view){
        r();
        b4.setText("✓ 2018 7,8月 發票");
        btn = 4;
    }

    public void btn5(View view){
        r();
        b5.setText("✓ 2018 9,10月 發票");
        btn = 5;
    }

    public void btn6(View view){
        r();
        b6.setText("✓ 2018 11,12月 發票");
        btn = 6;
    }

    public void start(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        switch (btn){
            case 1:
                intent.putExtra("n1", 266);
                intent.putExtra("n2", 254);
                intent.putExtra("n3", 209);
                intent.putExtra("n4", 340);
                intent.putExtra("n5", 612);
                break;
            case 2:
                intent.putExtra("n1", 126);
                intent.putExtra("n2", 977);
                intent.putExtra("n3", 639);
                intent.putExtra("n4", 238);
                intent.putExtra("n5", 837);
                break;
            case 3:
                intent.putExtra("n1", 109);
                intent.putExtra("n2", 605);
                intent.putExtra("n3", 535);
                intent.putExtra("n4", 847);
                intent.putExtra("n5", 706);
                break;
            case 4:
                intent.putExtra("n1", 972);
                intent.putExtra("n2", 462);
                intent.putExtra("n3", 722);
                intent.putExtra("n4", 598);
                intent.putExtra("n5", 163);
                break;
            case 5:
                intent.putExtra("n1", 110);
                intent.putExtra("n2", 865);
                intent.putExtra("n3", 442);
                intent.putExtra("n4", 292);
                intent.putExtra("n5", 650);
                break;
            case 6:
                intent.putExtra("n1", 559);
                intent.putExtra("n2", 146);
                intent.putExtra("n3", 656);
                intent.putExtra("n4", 862);
                intent.putExtra("n5", 404);
                break;
        }

        if(btn == 0)
        {
            Toast.makeText(this, "請先選擇月份", Toast.LENGTH_SHORT).show();
        }
        else {
            startActivity(intent);
            this.finish();
        }

    }
}