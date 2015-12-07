package com.smamda.elearning.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smamda.elearning.activities.MainActivity;
import com.smamda.elearning.R;

/**
 * Created by khusika on 07/12/15.
 */
public class FragmentProfil extends Fragment {


    private MainActivity mainActivity;
    private Toolbar toolbar;


    public FragmentProfil() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        mainActivity = (MainActivity)activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profil, container, false);

        toolbar = (Toolbar)view.findViewById(R.id.about_toolbar);

        setupToolbar();

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mainActivity.setupNavigationDrawer(toolbar);
    }

    private void setupToolbar(){
        toolbar.setTitle(getString(R.string.profil_fragment_title));
        mainActivity.setSupportActionBar(toolbar);
    }


}