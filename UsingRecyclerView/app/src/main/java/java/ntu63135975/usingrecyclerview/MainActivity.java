package java.ntu63135975.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewData = getDataForRecyclerView();
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecyclerView(){
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