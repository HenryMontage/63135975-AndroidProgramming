package java.ntu63135975.ex8_examlist;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.ActionBarDrawerToggle;
import androidx.recyclerview.widget.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.prolificinteractive
        .materialcalendarview
        .MaterialCalendarView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exam extends AppCompatActivity
        implements NavigationView
        .OnNavigationItemSelectedListener {

    ImageGalleryAdapter2 adapter;
    RecyclerView recyclerView;
    ClickListiner listiner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Toolbar toolbar
                = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        List<examData> list = new ArrayList<>();
        list = getData();

        recyclerView
                = (RecyclerView)findViewById(
                R.id.recyclerView);
        listiner = new ClickListiner() {
            @Override
            public void click(int index){
                Toast.makeTexT(this,"clicked item index is "+index,Toast.LENGTH_LONG).show();
            }
        };
        adapter
                = new ImageGalleryAdapter2(
                list, getApplication(),listiner);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(exam.this));
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    // Sample data for RecyclerView
    private List<examData> getData()
    {
        List<examData> list = new ArrayList<>();
        list.add(new examData("First Exam",
                "May 23, 2015",
                "Best Of Luck"));
        list.add(new examData("Second Exam",
                "June 09, 2015",
                "b of l"));
        list.add(new examData("My Test Exam",
                "April 27, 2017",
                "This is testing exam .."));

        return list;
    }
}