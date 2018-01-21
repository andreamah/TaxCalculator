package ca.blogspot.electrail.practice;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class MyFirstAndroidActivity extends Activity {
    TextView totalTextView;
    EditText percentageTxt;
    EditText numberTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_android);

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentageTxt = (EditText) findViewById(R.id.percentageText);
        numberTxt = (EditText) findViewById(R.id.numberTxt);

        Button calcBtn = (Button) findViewById (R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float percentagefirst = Float.parseFloat(percentageTxt.getText().toString());
                float percentage = 100 - percentagefirst;
                float num = Float.parseFloat(numberTxt.getText().toString());
                float dec = percentage / 100;
                float num2 = dec * num;
                float num3;
                num3 = (float)0.12 * num2;
                double total1 = num2 + num3;


                DecimalFormat precision = new DecimalFormat("0.00");
                String total = precision.format(total1);

                totalTextView.setText("$" +Float.toString(Float.parseFloat(total)));

            }

        });

    }

}
