package com.example.jnewel200.clickscounter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by jnewel200 on 4/22/2015.
 */
public class MainFragment extends Fragment{
    private int mIncrement = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ImageButton btn = (ImageButton)rootView.findViewById(R.id.main_activity_counter_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++mIncrement;
                Toast.makeText(getActivity(),"Increment count: " + mIncrement, Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
