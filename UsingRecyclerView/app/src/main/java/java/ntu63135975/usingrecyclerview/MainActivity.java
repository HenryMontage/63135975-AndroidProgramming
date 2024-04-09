package java.ntu63135975.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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

        //Dang 1 Doc
        //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        //recyclerViewLandscape.setLayoutManager(layoutLinear);

        //Dang 2 Ngang
        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,    false);
        recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);

        //Dang 3 Grid
        //RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        //recyclerViewLandscape.setLayoutManager(layoutGrid);

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