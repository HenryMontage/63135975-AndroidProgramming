package com.example.ex5_addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tìm view
        TimView();
        //Gắn các bộ lắng nghe
        nutCong.setOnClickListener(bolangnghe_XuLyCong);
        nutTru.setOnClickListener(bolangnghe_XuLyTru);
        nutNhan.setOnClickListener(bolangnghe_XuLyNhan);
        //nutChia.setOnClickListener(bolangnghe_XuLyChia);
        //Ví dụ bộ lắng nghe ẩn danh
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code xử lý cộng ở đây
                //1. Lấy số 1
                String strSo1 = editTextA.getText().toString();
                String strSo2 = editTextB.getText().toString();
                //2. Chuyển thành số để tính toán
                double soA = Double.parseDouble(strSo1);
                double soB = Double.parseDouble(strSo2);
                //3. Tính toán
                double tong = soA / soB;
                //4. Xuất
                String strKQ = String.valueOf(tong);
                editTextKQ.setText(strKQ);
            }
        });
    }
    //Tạo bộ lắng nghe và xử lý sự kiện
    View.OnClickListener bolangnghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Code xử lý cộng ở đây
            //1. Lấy số 1
            String strSo1 = editTextA.getText().toString();
            String strSo2 = editTextB.getText().toString();
            //2. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //3. Tính toán
            double tong = soA + soB;
            //4. Xuất
            String strKQ = String.valueOf(tong);
            editTextKQ.setText(strKQ);
        }
    };
    View.OnClickListener bolangnghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Code xử lý cộng ở đây
            //1. Lấy số 1
            String strSo1 = editTextA.getText().toString();
            String strSo2 = editTextB.getText().toString();
            //2. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //3. Tính toán
            double tong = soA - soB;
            //4. Xuất
            String strKQ = String.valueOf(tong);
            editTextKQ.setText(strKQ);
        }
    };
    View.OnClickListener bolangnghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Code xử lý cộng ở đây
            //1. Lấy số 1
            String strSo1 = editTextA.getText().toString();
            String strSo2 = editTextB.getText().toString();
            //2. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //3. Tính toán
            double tong = soA * soB;
            //4. Xuất
            String strKQ = String.valueOf(tong);
            editTextKQ.setText(strKQ);
        }
    };
    void TimView(){
        editTextA = (EditText)findViewById(R.id.edtA);
        editTextB = (EditText)findViewById(R.id.edtB);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);
    }
    //Khai báo các đối tượng tương ứng với các điều khiển (view) cần thao tác
    EditText editTextA;
    EditText editTextB;
    Button nutCong, nutTru, nutNhan, nutChia;
    EditText editTextKQ;
}