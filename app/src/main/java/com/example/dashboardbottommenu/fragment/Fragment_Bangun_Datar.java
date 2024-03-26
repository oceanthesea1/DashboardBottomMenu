package com.example.dashboardbottommenu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboardbottommenu.Item;
import com.example.dashboardbottommenu.MyAdapter;
import com.example.dashboardbottommenu.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Bangun_Datar extends Fragment {

    RecyclerView recyclerView;
    List<Item> listData;
    MyAdapter adapter;

    public Fragment_Bangun_Datar() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bangun_datar, container, false);
        recyclerView = rootView.findViewById(R.id.rvData);
        listData = new ArrayList<>();

        Item item1 = new Item();
        item1.setShape("Square");
        item1.setImage("https://c4.wallpaperflare.com/wallpaper/732/170/347/hololive-nakiri-ayame-hd-wallpaper-preview.jpg");
        listData.add(item1);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new MyAdapter(getContext(), listData);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
