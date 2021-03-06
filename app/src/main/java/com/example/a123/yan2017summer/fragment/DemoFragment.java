package com.example.a123.yan2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.*;

import com.example.a123.yan2017summer.LaunchModeActivity;
import com.example.a123.yan2017summer.R;
import com.example.a123.yan2017summer.ViewPagerActivity;
import com.example.a123.yan2017summer.adapter.ListNormalAdapter;


public class DemoFragment extends Fragment {
    private final ArrayList <String> contentList;
    private final Context context;
    private ListView listView;

    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList <String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("A");
        contentList.add("C");
        contentList.add("D");
        contentList.add("LaunchMode");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");
        contentList.add("9Patch");



    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo,container,false);
        listView = (ListView) view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(),contentList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), LaunchModeActivity.class);
                        startActivity(intent6);
                        break;
                    default:
                }
            }
        });
        return view;
    }

}
