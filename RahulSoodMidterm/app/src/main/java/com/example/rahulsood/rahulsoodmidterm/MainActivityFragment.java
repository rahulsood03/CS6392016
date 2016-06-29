package com.example.rahulsood.rahulsoodmidterm;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    View view;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        Button b = (Button) view.findViewById(R.id.button);
        b.setOnClickListener(this);

        return view;
//        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onClick(View v) {
        EditText txtValue = (EditText)view.findViewById(R.id.editText);

        Double Dollar = Double.valueOf(txtValue.getText().toString());
        double Francs=(Dollar*586.84);
        String s = "Dollar";
        Integer.valueOf(s).intValue();

        EditText newDollar= (EditText)view.findViewById(R.id.editText);
        newDollar.setText(Francs + "");
    }
}
