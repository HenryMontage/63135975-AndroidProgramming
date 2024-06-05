package thi.KieuThaiTuan63135975.Dethi2;

import static android.content.Context.MODE_PRIVATE;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SubjectsFragment extends Fragment {
    public SubjectsFragment() {
        // Required empty public constructor
    }
    public static SubjectsFragment newInstance(String param1, String param2) {
        SubjectsFragment fragment = new SubjectsFragment();
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
//        SQLiteDatabase db = getActivity().openOrCreateDatabase("Subjects.db", // tên file = tên DB
//                                                    MODE_PRIVATE,  // giới hạn truy cập
//                                                     null          // con trỏ bản ghi
//                                                 );
//        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS SUBJECTS;";
//
//        String sqlTaoBang = "CREATE TABLE SUBJECTS( id integer PRIMARY KEY, " +
//                                                "MaMonHoc text, " +
//                                                "TenMon text);";
//        db.execSQL(sqlXoaBangNeuDaCo);
//        db.execSQL(sqlTaoBang);
//        String sqlThem1 = "INSERT INTO SUBJECTS VALUES(1, 'SOT321', 'Java');";
//        String sqlThem2 = "INSERT INTO SUBJECTS VALUES(2, 'POI123', 'Lập trình hướng đối tượng');";
//        String sqlThem3 = "INSERT INTO SUBJECTS VALUES(3, 'LOL091', 'Ngôn ngữ học thuật');";
//        String sqlThem4 = "INSERT INTO SUBJECTS VALUES(4, 'IOP091', 'Toán rời rạc');";
//        String sqlThem5 = "INSERT INTO SUBJECTS VALUES(5, 'COP123', 'Quản lý dự án');";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//        db.execSQL(sqlThem3);
//        db.execSQL(sqlThem4);
//        db.execSQL(sqlThem5);
//        db.close();
        SQLiteDatabase db = getActivity().openOrCreateDatabase("Subjects.db", // tên file = tên DB
                MODE_PRIVATE,  // giới hạn truy cập
                null          // con trỏ bản ghi
        );
        String sqlSelect ="Select * from SUBJECTS;";
        Cursor cs = db.rawQuery(sqlSelect,null);
        cs.moveToFirst();
        ArrayList<Subject> dsMon = new ArrayList<Subject>();
        while (cs.moveToNext())
        {
            int idTenMon = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String MaMon = cs.getString(1);
            String TenMon = cs.getString(2);
            Subject b = new Subject(idTenMon ,MaMon, TenMon);
            dsMon.add(b);
        }

        ArrayList<String> dsTM = new ArrayList<String>();
        for (int i=0; i<dsMon.size(); i++ )
            dsTM.add(dsMon.get(i).getTenMon());

        // Hiển thị lên đk ListView
        View viewCau4 = inflater.inflate(R.layout.fragment_subjects, container, false);
        ListView listViewMH = viewCau4.findViewById(R.id.lvMH);
        ArrayAdapter<String> adapterTM = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                dsTM
        );
        listViewMH.setAdapter(adapterTM);
        // Lắng nghe và xử lý
        //listViewTenSach.setOnItemClickListener(((parent, view, position, id) -> ));

        // Inflate the layout for this fragment
        return viewCau4;
    }
}