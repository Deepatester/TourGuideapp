package com.example.deepa.tourguideapp;

/**
 * Created by deepa on 22/04/2018.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    final int PAGE_COUNT = 4;

    public SimpleFragmentPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;

    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2){
            return new PlacesFragment();
        } else {
            return new AccomadationFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position){

        if (position == 0) {
            return mContext.getString(R.string.category_home);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food);
        } else if (position == 2) {
            return mContext.getString(R.string.category_places);
        } else {
            return mContext.getString(R.string.category_accommodation);
        }
    }

   }
