package com.lesson_three.eiko.lesson4_submissioon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eiko on 11/14/2016.
 */
public class Fragment_Adapter extends FragmentPagerAdapter {
    private Context mcontext;

    public Fragment_Adapter(FragmentManager fragment_manager,
                            Context context) {
        super(fragment_manager);
        mcontext = context; //do not forget to initialise.
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Event();
        } else if (position == 1) {
            return new Museum();
        } else if (position == 2) {
            return new Restaurant();
        } else {
            return new Theme_Park();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mcontext.getString(R.string.categoryEvent);
        } else if (position == 1) {
            return mcontext.getString(R.string.categoryMuseum);
        } else if (position == 2) {
            return mcontext.getString(R.string.categoryRestaurant);
        } else
            return mcontext.getString(R.string.categoryThemePark);
    }
}
