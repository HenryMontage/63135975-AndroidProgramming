package thi.KieuThaiTuan63135975.Dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class UnitConverterFragment extends Fragment {
    Spinner spinnerUnits;
    EditText editTextInput;
    Button buttonConvert;
    TextView textViewResult;
    public UnitConverterFragment() {
        // Required empty public constructor
    }

    public static UnitConverterFragment newInstance(String param1, String param2) {
        UnitConverterFragment fragment = new UnitConverterFragment();
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
        View view = inflater.inflate(R.layout.fragment_unit_converter, container, false);

        spinnerUnits = view.findViewById(R.id.spinner_units);
        editTextInput = view.findViewById(R.id.edittext_input);
        buttonConvert = view.findViewById(R.id.button_convert);
        textViewResult = view.findViewById(R.id.textview_result);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnits();
            }
        });

        return view;
    }
    public void convertUnits() {
        String input = editTextInput.getText().toString();
        if (input.isEmpty()) {
            textViewResult.setText("hãy nhập dữ liệu");
            return;
        }

        double value = Double.parseDouble(input);
        String selectedUnit = spinnerUnits.getSelectedItem().toString();
        double result = 0;

        switch (selectedUnit) {
            case "Km to m":
                result = value * 1000;
                break;
            case "Kg to g":
                result = value * 1000;
                break;
            case "Byte to Bit":
                result = value * 8;
                break;
        }

        textViewResult.setText(String.valueOf(result));
    }
}