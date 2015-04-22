package com.example.jnewel200.clickscounter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by jnewel200 on 4/22/2015.
 */
public class MainFragment extends Fragment{
    private int mIncrement = 0;
    final private String INCREMENT_STATE_KEY = "inc";
    private TextView mIncrementLabel;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        if(savedInstanceState != null && savedInstanceState.containsKey(INCREMENT_STATE_KEY)){
            mIncrement = savedInstanceState.getInt(INCREMENT_STATE_KEY);
        }
        mIncrementLabel = (TextView)rootView.findViewById(R.id.main_fragment_increment_label);
        mIncrementLabel.setText(Integer.toString(mIncrement));
        ImageButton btn = (ImageButton)rootView.findViewById(R.id.main_fragment_counter_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++mIncrement;
                mIncrementLabel.setText(Integer.toString(mIncrement));
            }
        });
        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(INCREMENT_STATE_KEY, mIncrement);
    }
}
