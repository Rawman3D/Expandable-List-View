package com.example.leapfrog.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView);

        //prepare the list
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list Adapter
        expListView.setAdapter(listAdapter);
    }

    //prepare the list data
    private void prepareListData(){
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        //Adding head data
        listDataHeader.add("Drinks");
        listDataHeader.add("Apetizers");
        listDataHeader.add("Main Course");
        listDataHeader.add("Desert");

        //adding child data
        List<String> drinks= new ArrayList<String>();
        drinks.add("Coca Cola");
        drinks.add("Pepsi");
        drinks.add("Dew");
        drinks.add("Fanta");
        drinks.add("Slice");
        drinks.add("Mirinda");

        List<String> apetizer = new ArrayList<String>();
        apetizer.add("Potato chips");
        apetizer.add("Papad");
        apetizer.add("Alu chilly");
        apetizer.add("Chiken Satai");
        apetizer.add("Chiken Chilly");
        apetizer.add("Chiken Tandoori");

        List<String> maincourse = new ArrayList<String>();
        maincourse.add("Thali veg");
        maincourse.add("Thali non-veg");
        maincourse.add("Bhat");
        maincourse.add("Dal");
        maincourse.add("Chicken Tikka");
        maincourse.add("Chicken Biryani");
        maincourse.add("Chicken gravy");
        maincourse.add("Chicken 69");
        maincourse.add("Mushroom Manchurian");
        maincourse.add("Gobi Manchurian");

        List<String> dessert = new ArrayList<String>();
        dessert.add("Ice-Cream");
        dessert.add("Chocolate fudge");
        dessert.add("Chocolate thaadai");

        listDataChild.put(listDataHeader.get(0),drinks);
        listDataChild.put(listDataHeader.get(1),apetizer);
        listDataChild.put(listDataHeader.get(2),maincourse);
        listDataChild.put(listDataHeader.get(3),dessert);





    }



}

