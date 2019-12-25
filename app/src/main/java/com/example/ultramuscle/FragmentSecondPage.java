package com.example.ultramuscle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


import androidx.fragment.app.Fragment;

public class FragmentSecondPage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_second_page, container, false);

        ImageButton imageButtonBiceps = (ImageButton) view.findViewById(R.id.imageButtonBiceps);
        ImageButton imageButtonGrud = (ImageButton) view.findViewById(R.id.imageButtonGrud);
        ImageButton imageButtonNogi = (ImageButton) view.findViewById(R.id.imageButtonNogi);
        ImageButton imageButtonTriceps = (ImageButton) view.findViewById(R.id.imageButtonTriceps);
        ImageButton imageButtonPlechi = (ImageButton) view.findViewById(R.id.imageButtonPlechi);


        return view;
    }
}
