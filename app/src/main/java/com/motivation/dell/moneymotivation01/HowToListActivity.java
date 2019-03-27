package com.motivation.dell.moneymotivation01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HowToListActivity extends AppCompatActivity {


    private List<EarningWay> earningWaysList;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_list);

        final ArrayList arrayList = new ArrayList();

        earningWaysList = new ArrayList<>();
        earningWaysList.add(new EarningWay("Fiverr", "Let's Share Top 15 Ways To Make Money On Fiverr...", R.drawable.money1));
        earningWaysList.add(new EarningWay("Freelancing", "How To Earn Money By Freelancing, Let's Discuss...", R.drawable.money5));
        earningWaysList.add(new EarningWay("YouTube", "Know How To Make Money Online By YouTube...", R.drawable.money2));
        earningWaysList.add(new EarningWay("Create and Sell How-To Courses", "Create Your Own Course on YouTube etc...", R.drawable.money10));
        earningWaysList.add(new EarningWay("Blogger", "Create Your Own Blog, Create Your Income...", R.drawable.money3));
        earningWaysList.add(new EarningWay("Wordpress", "One Easy But Technical Way To Earn Money...", R.drawable.money4));
        earningWaysList.add(new EarningWay("Affiliate Marketing", "A Great Way of Creating Passive Income...", R.drawable.money6));
        earningWaysList.add(new EarningWay("Graphics Design", "Do You Love Graphic Designing?...", R.drawable.money7));
        earningWaysList.add(new EarningWay("Online tutor", "Be an Online Tutor by Teaching Online...", R.drawable.money8));
        earningWaysList.add(new EarningWay("Data entry", "Data Entry is an Easy but Challenging Way...", R.drawable.money9));
        earningWaysList.add(new EarningWay("E-commerce", "A Great Technical Way to Earn Money Online...", R.drawable.money11));
        earningWaysList.add(new EarningWay("Develop Apps", "Why not Create Apps like this One?...", R.drawable.money12));
        earningWaysList.add(new EarningWay("Invest in YourSelf!", "The Best Investment is the One in Youself...", R.drawable.money13));
        earningWaysList.add(new EarningWay("Drive For Uber", "Have a Car? Why not Drive Uber...", R.drawable.money14));
        earningWaysList.add(new EarningWay("Develop Courses On Udemy", "Do You Know? Udemy is One of Best Ways...", R.drawable.money15));

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(this, earningWaysList);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
