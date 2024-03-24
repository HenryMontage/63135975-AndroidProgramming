package java.ntu_63135975.cau2_appbmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    TextView mbmidisplay,mbmicategory,mgender;
    Intent intent;

    ImageView mimageview;
    String mbmi;

    float intbmi;

    String height;
    String weight;

    float intheight,intweight;

    RelativeLayout mbackground;

    android.widget.Button mrecalculatebmi;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setElevation(0);

        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"white\"></font>"));
        getSupportActionBar().setTitle("Result");

        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#1E1D1D"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);


        intent=getIntent();
        mbmidisplay=findViewById(R.id.bmidisplay);

        mbmicategory = findViewById(R.id.bmicategory);

        mgender=findViewById(R.id.genderdisplay);
        mbackground=findViewById(R.id.contentlayout);
        mimageview=findViewById(R.id.imageview);

        height=intent.getStringExtra("height");
        weight=intent.getStringExtra("weight");


        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);

        intheight=intheight/100;
        intbmi=intweight/(intheight*intheight);


        mbmi=Float.toString(intbmi);

        if(intbmi<16)
        {
            mbmicategory.setText("Suy dinh dưỡng trung bình nặng");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.crosss);

        }
        else if(intbmi<16.9 && intbmi>16)
        {
            mbmicategory.setText("Suy dinh dưỡng trung bìnb");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);

        }
        else if(intbmi<18.4 && intbmi>17)
        {
            mbmicategory.setText("Suy dinh dưỡng nhẹ");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if(intbmi<24.9 && intbmi>18.5 )
        {
            mbmicategory.setText("Bình thường");
            mimageview.setImageResource(R.drawable.ok);

        }
        else if(intbmi <29.9 && intbmi>25)
        {
            mbmicategory.setText("Thừa cân");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if(intbmi<34.9 && intbmi>30)
        {
            mbmicategory.setText("Béo phì cấp độ I");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);
        }
        else
        {
            mbmicategory.setText("Béo phì cấp độ II");
            mbackground.setBackgroundColor(R.color.warn);
            mimageview.setImageResource(R.drawable.crosss);
        }

        mgender.setText(intent.getStringExtra("Giới tính"));
        mbmidisplay.setText(mbmi);


        mrecalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}