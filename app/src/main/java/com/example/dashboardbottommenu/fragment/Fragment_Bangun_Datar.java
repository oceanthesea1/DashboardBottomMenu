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

public class Fragment_Bangun_Datar extends Fragment implements MyAdapter.OnItemClickListener{

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
        recyclerView = rootView.findViewById(R.id.rvDataDatar);
        listData = new ArrayList<>();

        Item item1 = new Item();
        item1.setShape("Square");
        item1.setImage("https://cdn.icon-icons.com/icons2/562/PNG/512/rounded-corners-square_icon-icons.com_53894.png");
        listData.add(item1);

        Item item2 = new Item();
        item2.setShape("Rectangle");
        item2.setImage("https://uxwing.com/wp-content/themes/uxwing/download/arts-graphic-shapes/rectangle-line-icon.png");
        listData.add(item2);

        Item item3 = new Item();
        item3.setShape("Triangle");
        item3.setImage("https://cdn.icon-icons.com/icons2/2518/PNG/512/triangle_icon_151032.png");
        listData.add(item3);

        Item item4 = new Item();
        item4.setShape("Circle");
        item4.setImage("https://cdn.icon-icons.com/icons2/2518/PNG/512/circle_icon_151453.png");
        listData.add(item4);

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
            String imageLink = "https://cdn.icon-icons.com/icons2/562/PNG/512/rounded-corners-square_icon-icons.com_53894.png";
            intent.putExtra("image1", imageLink);
            startActivity(intent);
        } else if (position == 1) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator2.class);
            intent.putExtra("shape2", shape);
            String imageLink = "https://uxwing.com/wp-content/themes/uxwing/download/arts-graphic-shapes/rectangle-line-icon.png";
            intent.putExtra("image2", imageLink);
            startActivity(intent);
        } else if (position == 2) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator2.class);
            intent.putExtra("shape2", shape);
            String imageLink = "https://cdn.icon-icons.com/icons2/2518/PNG/512/triangle_icon_151032.png";
            intent.putExtra("image2", imageLink);
            startActivity(intent);
        } else if (position == 3) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator1.class);
            intent.putExtra("shape1", shape);
            String imageLink = "https://cdn.icon-icons.com/icons2/2518/PNG/512/circle_icon_151453.png";
            intent.putExtra("image1", imageLink);
            startActivity(intent);
        } else {
            Toast.makeText(requireContext(), "Item clicked: " + position, Toast.LENGTH_SHORT).show();
        }
    }
}
