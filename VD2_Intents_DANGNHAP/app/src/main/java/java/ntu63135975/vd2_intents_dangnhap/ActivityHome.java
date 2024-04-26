package java.ntu63135975.vd2_intents_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {

    TextView tvUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUserName = findViewById(R.id.tv_user_name);
        String name = getIntent().getStringExtra("username");
        tvUserName.setText(name);
    }
}