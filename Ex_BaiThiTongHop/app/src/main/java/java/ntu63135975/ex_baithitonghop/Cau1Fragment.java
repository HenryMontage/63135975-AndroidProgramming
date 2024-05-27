package java.ntu63135975.ex_baithitonghop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1Fragment extends Fragment {
    Button buttonCong;
    EditText editTextSo1,  editTextSo2;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        //Tìm điều khiển trong này
        buttonCong = viewCau1.findViewById(R.id.btnTinhTong);
        editTextSo1 = viewCau1.findViewById(R.id.editTextSoA);
        editTextSo2 = viewCau1.findViewById(R.id.editTextSoB);
        buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float so1 =Float.parseFloat(editTextSo1.getText().toString());
                float so2 =Float.parseFloat(editTextSo2.getText().toString());
                float tong=so1+so2;
                TextView textViewKQ = viewCau1.findViewById(R.id.textViewKetQua);
                textViewKQ.setText(String.valueOf(tong));
            }
        });
//            @Override
//            public void onClick(View v) {
//                String duLieuM = editText_M.getText().toString();
//                String duLieuKM = editText_KM.getText().toString();
//                //
//                if (!duLieuM.isEmpty()) // user có nhập dữ liệu met, cần đổi sang km
//                {
//                    Toast.makeText(viewCau1.getContext(),"m -> km",Toast.LENGTH_SHORT).show();
//                }
//                else // đổi từ km sang met
//                {
//                    Toast.makeText(viewCau1.getContext(),"km -> m",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        return viewCau1;

    }
}