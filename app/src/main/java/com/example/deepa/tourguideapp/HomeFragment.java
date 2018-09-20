package com.example.deepa.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class HomeFragment extends Fragment {

    ArrayList<Attraction> Attractions;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
       //  Create a list of Attractions
       final ArrayList<Attraction> Attractions = new ArrayList<Attraction>();
        Attractions.add(new Attraction(R.string.talented));
        Attractions.add(new Attraction(R.string.underCroft));
        Attractions.add(new Attraction(R.string.pintOfScience));
        Attractions.add(new Attraction(R.string.freeFamily));
        Attractions.add(new Attraction(R.string.biggestWeekend));
        Attractions.add(new Attraction(R.string.coventry600));
       //  Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
      //  adapter knows how to create list items for each item in the list.
      AttractionAdapter adapter = new AttractionAdapter(getActivity(), Attractions, R.color.category_home);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
       ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
       listView.setAdapter(adapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    int Clickedlist = Attractions.get(i).getName();
    String ClickedValue=getString(Clickedlist);
    Intent intent = new Intent(getActivity(), SecondActivity.class);
    intent.putExtra("AttractionReference", ClickedValue);
    startActivity(intent);
       }
      });
        return rootView;
        }
@Override
public void onStop() {
      super.onStop();

        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.

        }
        }