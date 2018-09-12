package com.example.user.kotlinhelper;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDemoOne extends android.support.v4.app.Fragment {
    private android.widget.TextView txt;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);
        this.txt = (TextView) view.findViewById(R.id.txt);

        String name = getArguments().getString("name");
        txt.setText(name);
        return view;

    }
}
