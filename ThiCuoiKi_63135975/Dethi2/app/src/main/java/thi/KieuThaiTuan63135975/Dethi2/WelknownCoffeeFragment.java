package thi.KieuThaiTuan63135975.Dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class WelknownCoffeeFragment extends Fragment {

    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;
    public WelknownCoffeeFragment() {
        // Required empty public constructor
    }

    public static WelknownCoffeeFragment newInstance(String param1, String param2) {
        WelknownCoffeeFragment fragment = new WelknownCoffeeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<LandScape>();
        list.add(new LandScape("xanhcf","Xanh Coffee, Đường Cây Gáo, Vĩnh Thạnh, Nha Trang"));
        list.add(new LandScape("cfforest","Cafe Rainforest , 79B Củ Chi, Vĩnh Hải, Nha Trang."));
        list.add(new LandScape("homstay","Tom’s coffee homestay , tổ 24, xóm Còi, đường 2/4, Vĩnh Hải, Nha Trang."));
        list.add(new LandScape("garden","Vihara Garden , 99 Nguyễn Thái Học, Vạn Thạnh, Nha Trang."));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_welknown_coffee, container, false);
        recyclerViewLandScape = viewCau3.findViewById(R.id.ryCau3);

        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);

        adapter = new LandScapeAdapter(viewCau3.getContext(), list);
        recyclerViewLandScape.setAdapter(adapter);

        return viewCau3;
    }
}