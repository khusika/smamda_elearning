package com.smamda.elearning.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.smamda.elearning.R;
import com.smamda.elearning.activities.MainActivity;
import com.smamda.elearning.adapters.RecyclerAdapter;
import com.smamda.elearning.models.CardItemModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by khusika on 07/12/15.
 */
public class FragmentPengumuman extends Fragment {

    private List<CardItemModel> cardItems = new ArrayList<>(30);
    private MainActivity appCompatActivity;
    private Toolbar toolbar;
    private RecyclerView recyclerView;

    int[] photos={R.drawable.brand1, R.drawable.brand2, R.drawable.brand3, R.drawable.brand4};
    KenBurnsView imageView;

    public FragmentPengumuman() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        appCompatActivity = (MainActivity)activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pengumuman, container, false);

        imageView =(KenBurnsView)view.findViewById(R.id.header_picture);

        toolbar = (Toolbar)view.findViewById(R.id.toolbar);

        setupToolbar();

        ((CollapsingToolbarLayout)view.findViewById(R.id.collapsing_toolbar)).setTitle(
                getString(R.string.pengumuman_fragment_title));

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        setupRecyclerView();

        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i=0;
            public void run() {
                // change images randomly
                Random ran=new Random();
                int i=ran.nextInt(photos.length);
                //set image resources
                imageView.setImageResource(photos[i]);
                i++;
                if(i>photos.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 7000);  //for interval...
            }
        };
        handler.postDelayed(runnable, 7000); //for initial delay..



        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        appCompatActivity.setupNavigationDrawer(toolbar);
    }

    private void setupToolbar(){
        toolbar.setTitle("");
        appCompatActivity.setSupportActionBar(toolbar);
    }

    private void setupRecyclerView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(appCompatActivity));
        recyclerView.setHasFixedSize(true);
        initializeCardItemList();
        recyclerView.setAdapter(new RecyclerAdapter(cardItems));
    }

    private void initializeCardItemList(){
        CardItemModel cardItemModel;
        String[] cardTitles = getResources().getStringArray(R.array.card_titles);
        String[] cardContents = getResources().getStringArray(R.array.card_contents);
        final int length = cardTitles.length;
        for(int i=0;i<length;i++){
            cardItemModel = new CardItemModel(cardTitles[i],cardContents[i]);
            cardItems.add(cardItemModel);
        }
    }
}
