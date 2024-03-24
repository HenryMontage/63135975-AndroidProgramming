package java.ntu_63135975.cau2_appbmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    android.widget.Button mrecalculatebmi;
    TextView mcurrentheight;
    TextView mcurrentage, mcurrentweight;
    ImageView mincrementage, mincrementweight, mdecrementweight, mdecrementage;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecalculatebmi = findViewById(R.id.calculatebmi);
        mrecalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BMIActivity.class);
                startActivity(intent);
            }
        });
    }
}