package thi.KieuThaiTuan63135975.Dethi2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyCVFragment extends Fragment {


    public MyCVFragment() {
        // Required empty public constructor
    }

    public static MyCVFragment newInstance(String param1, String param2) {
        MyCVFragment fragment = new MyCVFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_c_v, container, false);

        // Find the button and set an onClickListener
        Button buttonFacebook = view.findViewById(R.id.button_facebook);
        buttonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Facebook page
                openFacebookPage();
            }
        });

        return view;
    }
    private void openFacebookPage() {
        String facebookUrl = "https://www.facebook.com/thaituan.kieu/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
        startActivity(intent);
    }
}