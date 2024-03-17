package com.example.ex7_danhsachtinhthanh_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsTenTinhThanhVN; //Khai báo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hiển thị dữ liệu lên ListView
        //B1+: Cần phải có dữ liệu
        // ?? từ đâu có: từ cơ sở dữ liệu (SQL, noSQL, XML,...)
        // ở bài này, chúng ta hard-core dữ liệu trực tiếp
        // Cần biến phù hợp để chứa dữ liệu
        // Đã chuyển ra ngoài khai báo, ở trên
        dsTenTinhThanhVN = new ArrayList<>(); // Tạo thể hiện cụ thể, xin mới
        //Thêm dữ liệu ở đây (đúng ra, ta phải đọc từ 1 nguồn)
        //Nhưng ta hard-core(cho sẵn để demo)
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố HCM");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Nha Trang");
        //B2 Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN);
        //B3 Gắn vào điều khiển hiển thị ListView
        //3.1. Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2. Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3. Lắng nghe và xử lý sự kiện user tương tác
        // Gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }

    //Tạo bộ lắng nghe và xử lý sự kiện OnItemClick, đặt vào một biến
    //VD: BoLangNgheVaXL
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Code xử lý ở đây
            // i là vị trí phần tử vừa được click
            // ví dụ xử lý ở đây, là hiển thị màn hình một thông báo nhanh về vị trí của phần tử vừa chọn
            // VD khác, thay vì hiện vị trí thì ta hiện giá trị
            // Lấy giá trị của phần tử thứ i
            String strTenTinhChon = dsTenTinhThanhVN.get(i);

            Toast.makeText(MainActivity.this, strTenTinhChon,Toast.LENGTH_LONG).show();
        }
    };
}