package com.example.imath.ui.circle;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.example.imath.R;

public class CircleFragment extends Fragment {

    private CircleViewModel mViewModel;

    public static CircleFragment newInstance() {
        return new CircleFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // return inflater.inflate(R.layout.circle_fragment, container, false);
        View v = inflater.inflate(R.layout.circle_fragment, container, false);

        TabHost tabs = v.findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("pest1");
        spec.setContent(R.id.pest1);
        spec.setIndicator("Perímetro", getResources().getDrawable(R.drawable.ic_circle));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("pest2");
        spec.setContent(R.id.pest2);
        spec.setIndicator("Área", getResources().getDrawable(R.drawable.ic_circle));
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CircleViewModel.class);
        // TODO: Use the ViewModel
    }

}