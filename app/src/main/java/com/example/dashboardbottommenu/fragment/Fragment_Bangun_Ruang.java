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
import com.example.dashboardbottommenu.calculator3;

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
        item1.setImage("https://cdn-icons-png.flaticon.com/512/73/73674.png");
        listData.add(item1);

        Item item2 = new Item();
        item2.setShape("Rectangle");
        item2.setImage("https://static.thenounproject.com/png/375209-200.png");
        listData.add(item2);

        Item item3 = new Item();
        item3.setShape("Cone");
        item3.setImage("https://static-00.iconduck.com/assets.00/cone-icon-2048x2046-7oncc3vw.png");
        listData.add(item3);

        Item item4 = new Item();
        item4.setShape("Sphere");
        item4.setImage("https://static.thenounproject.com/png/104196-200.png");
        listData.add(item4);

        adapter = new MyAdapter(getContext(), listData);
        adapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;

    }

    //Edit Gambar
    @Override
    public void onItemClick(int position) {
        if (position == 0) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator1.class);
            intent.putExtra("shape1", shape);
            String imageLink = listData.get(position).getImage();
            intent.putExtra("image1", imageLink);
            startActivity(intent);
        } else if (position == 1) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator3.class);
            intent.putExtra("shape3", shape);
            String imageLink = listData.get(position).getImage();
            intent.putExtra("image3", imageLink);
            startActivity(intent);
        } else if (position == 2) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator2.class);
            intent.putExtra("shape2", shape);
            String imageLink = listData.get(position).getImage();
            intent.putExtra("image2", imageLink);
            startActivity(intent);
        } else if (position == 3) {
            String shape = listData.get(position).getShape();
            Intent intent = new Intent(requireContext(), calculator1.class);
            intent.putExtra("shape1", shape);
            String imageLink = listData.get(position).getImage();
            intent.putExtra("image1", imageLink);
            startActivity(intent);
        } else {
            Toast.makeText(requireContext(), "Item clicked: " + position, Toast.LENGTH_SHORT).show();
        }
    }
}
