package java.ntu63135975.ex_baithitonghop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Cau3Fragment extends Fragment {
    //Khai báo biến cần thiết
    //1. Khai báo biến toàn cục
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    //2. Khai báo các biến đại diện cho các view tương tác
    RecyclerView recyclerViewLandScape;


    public Cau3Fragment() {
        // Required empty public constructor
    }

    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3. Chuẩn bị dữ liệu cho List
        list = new ArrayList<LandScape>();
        list.add(new LandScape("eiffel","Tháp Eiffel (Pháp)"));
        list.add(new LandScape("langhcm","Lăng Bác Hồ Chí Minh (Việt Nam)"));
        list.add(new LandScape("nuiphusi","Núi Phú Sĩ (Nhật Bản)"));
        list.add(new LandScape("vanlytruongthanh","Vạn Lý Trường Thành (Trung Quốc)"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        //4. Tìm điều khiển RycycleView
        recyclerViewLandScape = viewCau3.findViewById(R.id.ryCau3);
        //5. Tạo layout manager để đặt bố cục cho Recycler

        //Dang 1 Doc
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);

        //Dang 2 Ngang
        //RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(viewCau3.getContext(), LinearLayoutManager.HORIZONTAL,    false);
        //recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal);

        //Dang 3 Grid
        //RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(viewCau3.getContext(), 2);
        //recyclerViewLandScape.setLayoutManager(layoutGrid);

        //6. Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(viewCau3.getContext(), list);
        //7. Gắn adapter vào Recycler
        recyclerViewLandScape.setAdapter(adapter);

        return viewCau3;
    }
}