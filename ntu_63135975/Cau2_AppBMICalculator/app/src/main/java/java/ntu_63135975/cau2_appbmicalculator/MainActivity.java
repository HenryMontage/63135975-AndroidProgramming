package java.ntu_63135975.cau2_appbmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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


    }
}