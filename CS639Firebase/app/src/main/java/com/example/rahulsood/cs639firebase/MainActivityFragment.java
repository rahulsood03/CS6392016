package com.example.rahulsood.cs639firebase;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.firebase.client.firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button btnSubmit;
    private EditText eID, eFn;
    private Firebase rootRef;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);


        btnSubmit = (Button) rootView.findViewById(R.id.button);
        eID = (EditText) rootView.findViewById(R.id.eID);
        eFn =(EditText) rootView.findViewById(R.id.eFn);
        rootRef = new Firebase ("https://cs639friebase.firebaseio.com");

        btnSubmit.setOnClickListener(new Button.OnClickListener() {


            @Override
            public void onClick(View view) {

                String id = eID.getText().toString().trim();
                String firstname = eFn.getText().toString().trim();
                Student student = new Student(id, firstname);

                rootRef.child("Student").push().setValue(student);


            }
        });

        return rootView;
    }
}
