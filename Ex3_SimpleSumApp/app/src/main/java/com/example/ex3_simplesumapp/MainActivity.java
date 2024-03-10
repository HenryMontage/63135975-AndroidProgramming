package com.example.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn Layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }

    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút tính
    public void XuLyCong(View view){
        //Tìm tham chiếu đến các điều khiển trên tệp XML, mapping sang java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        //Lấy dữ liệu về ở điều khiển số A
        String strA = editTextSoA.getText().toString(); //strA = "2"

        //Lấy dữ liệu về ở điều khiển số B
        String strB = editTextSoB.getText().toString(); //strB = "4"

        //Chuyển đổi dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA); //2
        int so_B = Integer.parseInt(strB); //4

        //Tính toán theo yêu cầu
        int tong = so_A + so_B; //6
        String strTong = String.valueOf(tong); //chuyển sang hệ chuổi; "6"

        //Hiển thị ra màn hình
        editTextKetQua.setText(strTong);
    }
}