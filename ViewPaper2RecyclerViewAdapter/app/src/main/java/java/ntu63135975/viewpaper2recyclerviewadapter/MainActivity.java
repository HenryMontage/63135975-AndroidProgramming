package java.ntu63135975.viewpaper2recyclerviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPagerData;
    ViewPager2 viewPager2Land;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPagerData = getDataForViewPager();
        viewPager2Land = findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(this, viewPagerData);
        viewPager2Land.setAdapter(landScapeAdapter);

        //Bổ sung hiệu ứng chuyển trang tài liệu
        viewPager2Land.setPageTransformer(new ZoomOutPageTransformer());
        //
        
        viewPager2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
    ArrayList<LandScape> getDataForViewPager(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("eiffel","Tháp Eiffel (Pháp)");
        LandScape landScape2 = new LandScape("langhcm","Lăng Bác Hồ Chí Minh (Việt Nam)");
        LandScape landScape3 = new LandScape("nuiphusi","Núi Phú Sĩ (Nhật Bản)");
        LandScape landScape4 = new LandScape("vanlytruongthanh","Vạn Lý Trường Thành (Trung Quốc)");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(landScape2);
        dsDuLieu.add(landScape3);
        dsDuLieu.add(landScape4);
        return dsDuLieu;
    }
}