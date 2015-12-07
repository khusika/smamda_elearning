package com.smamda.elearning.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.smamda.elearning.fragments.TabArtikelGuruFragment;
import com.smamda.elearning.fragments.TabArtikelSiswaFragment;

/**
 * Created by khusika on 16/12/15.
 */
public class ViewPagerArtikelAdapter extends FragmentPagerAdapter {

    public ViewPagerArtikelAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new TabArtikelGuruFragment();
            case 1:
                return new TabArtikelSiswaFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "GURU";
            case 1:
                return "SISWA";
        }
        return null;
    }
}
