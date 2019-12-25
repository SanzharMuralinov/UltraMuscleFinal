package com.example.ultramuscle;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;


import androidx.fragment.app.Fragment;

public class FragmentStartPage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_starting_page, container, false);

        Button buttonstart = (Button) view.findViewById(R.id.button_start);
        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SecondPage.class);
                startActivity(intent);

            }

        });

        Button contact = (Button) view.findViewById(R.id.button_start2);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), Contact.class);
                startActivity(intent2);
            }
        });

        return view;
    }
}
