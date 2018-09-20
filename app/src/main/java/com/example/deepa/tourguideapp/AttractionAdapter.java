package com.example.deepa.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by deepa on 23/04/2018.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction>

    {
        private Attraction AttractionName;
        private int mColorResourceId;
     public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceId)
     {
         super(context, 0, attractions);
         mColorResourceId = colorResourceId;
     }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            AttractionName=(Attraction) getItem(position);
            if(convertView==null)
            {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tem, parent, false);
            }
            TextView txt_name=(TextView)convertView.findViewById(R.id.name_text_view);
            txt_name.setText(AttractionName.getName());

            return convertView;
        }
}
