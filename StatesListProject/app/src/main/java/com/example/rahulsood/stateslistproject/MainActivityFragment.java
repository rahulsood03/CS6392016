package com.example.rahulsood.stateslistproject;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.content.Intent;
import android.view.LayoutInflater;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        final String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California",
                "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
                "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
                "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
                "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska",
                "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
                "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
                "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont",
                "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

        ArrayAdapter<String> statesAdapater = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                states);

        ListView lvStates = (ListView) v.findViewById(R.id.listView);
        lvStates.setAdapter(statesAdapater);

        lvStates.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 39){
                    Uri gmmIntentUri = Uri.parse("geo:34.000436, -81.032332 = Columbia,SC");
                    Intent intentMap = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(intentMap);
                }

                Toast.makeText(getContext(), states[i], Toast.LENGTH_LONG).show();

            }
        });
        return v;

//        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
