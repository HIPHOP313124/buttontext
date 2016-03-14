package com.example.mac.buttontext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private int num = 1;
    private int money = 10;
    // private String error = "錯誤";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void submitorder(View v) {
        num++;
        money += 10;


        TextView number = (TextView) findViewById(R.id.textid);
        number.setText(String.valueOf(num));

        TextView number2 = (TextView) findViewById(R.id.moneynumber);

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.TAIWAN);


    number2.setText(String.valueOf(nf.format(money)));
}
    public void submitorder2(View v) {


if(num>0||money>0) {

    num--;
    money -= 10;
    TextView number = (TextView) findViewById(R.id.textid);


    number.setText(String.valueOf(num));


    TextView number2 = (TextView) findViewById(R.id.moneynumber);
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
    number2.setText(String.valueOf(nf.format(money)));

}else if (num<0||money<0){
    TextView number = (TextView) findViewById(R.id.textid);
    number.setText(String.valueOf(0));

    TextView number2 = (TextView) findViewById(R.id.moneynumber);

    number2.setText(String.valueOf(0));
}

    }


}

