package com.smamda.elearning.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.smamda.elearning.fragments.TabBeritaInternasionalFragment;
import com.smamda.elearning.fragments.TabBeritaSmamdaFragment;
import com.smamda.elearning.fragments.TabBeritaNasionalFragment;
import com.smamda.elearning.fragments.TabBeritaEkskulFragment;

/**
 * Created by khusika on 07/12/15.
 */
public class ViewPagerBeritaAdapter extends FragmentPagerAdapter {

    public ViewPagerBeritaAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new TabBeritaSmamdaFragment();
            case 1:
                return new TabBeritaEkskulFragment();
            case 2:
                return new TabBeritaNasionalFragment();
            case 3:
                return new TabBeritaInternasionalFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "SMAMDA";
            case 1:
                return "EKSKUL";
            case 2:
                return "NASIONAL";
            case 3:
                return "INTERNASIONAL";
        }
        return null;
    }
}
