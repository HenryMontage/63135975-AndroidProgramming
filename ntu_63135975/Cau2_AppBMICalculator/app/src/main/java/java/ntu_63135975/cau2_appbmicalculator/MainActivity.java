package java.ntu_63135975.cau2_appbmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ediWeight, ediFeet, ediInch;
    Button buttonBmiCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ediWeight = findViewById(R.id.ediWeight);
        ediFeet = findViewById(R.id.ediFeet);
        ediInch = findViewById(R.id.ediInch);
        buttonBmiCalculate = findViewById(R.id.buttonBmiCalculate);
        tvResult = findViewById(R.id.tvResult);
        buttonBmiCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sWeight = ediWeight.getText().toString();
                String sFeet = ediFeet.getText().toString();
                String sInch = ediInch.getText().toString();

                float weight = Float.parseFloat(sWeight);
                float feet = Float.parseFloat(sFeet);
                float inch = Float.parseFloat(sInch);

                float height = (float) (feet* 0.3048 + inch*0.0254);
                float bmiIndex = weight/ (height*height);
                tvResult.setText("Your BMI Index is: " + bmiIndex+"\n\nBMI Categories:\n" +
                        "Underweight = <18.5\n" +
                        "Normal weight = 18.5–24.9\n" +
                        "Overweight = 25–29.9\n" +
                        "Obesity = BMI of 30 or greater ");
            }
        });
    }
}