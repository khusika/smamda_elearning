package com.smamda.elearning.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smamda.elearning.R;

/**
 * Created by khusika on 16/12/15.
 */
public class TabArtikelGuruFragment extends Fragment {


    public TabArtikelGuruFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_artikel_guru, container, false);
    }


}
