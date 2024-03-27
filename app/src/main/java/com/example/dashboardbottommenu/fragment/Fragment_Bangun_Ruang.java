package com.example.dashboardbottommenu.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboardbottommenu.Item;
import com.example.dashboardbottommenu.MyAdapter;
import com.example.dashboardbottommenu.R;
import com.example.dashboardbottommenu.calculator1;
import com.example.dashboardbottommenu.calculator2;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Bangun_Ruang extends Fragment implements MyAdapter.OnItemClickListener{

    RecyclerView recyclerView;
    List<Item> listData;
    MyAdapter adapter;

    public Fragment_Bangun_Ruang() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bangun_ruang, container, false);
        recyclerView = rootView.findViewById(R.id.rvDataRuang);
        listData = new ArrayList<>();

        Item item1 = new Item();
        item1.setShape("Cube");
        item1.setImage("https://c4.wallpaperflare.com/wallpaper/732/170/347/hololive-nakiri-ayame-hd-wallpaper-preview.jpg");
        listData.add(item1);

        Item item2 = new Item();
        item2.setShape("Sphere");
        item2.setImage("https://c4.wallpaperflare.com/wallpaper/732/170/347/hololive-nakiri-ayame-hd-wallpaper-preview.jpg");
        listData.add(item2);

        adapter = new MyAdapter(getContext(), listData);
        adapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;

    }

    @Override
    public void onItemClick(int position) {
        if (position == 0) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator1.class);
            intent.putExtra("shape1", shape);
            startActivity(intent);
        } else if (position == 1) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator1.class);
            intent.putExtra("shape1", shape);
            startActivity(intent);
        } else {
            Toast.makeText(requireContext(), "Item clicked: " + position, Toast.LENGTH_SHORT).show();
        }
    }
}
