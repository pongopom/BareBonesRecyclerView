package com.example.android.barebonesrv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    //TODO: POINT.19 In the Activity class create a variable for the DataSource (DONE)
    private static Person[] dataSource = FakeDataSource.dataSource();

    //TODO: POINT.20 In the Activity create a variable for the  adapter and one for the recyclerView (DONE)
    PersonRecyclerViewAdapter viewAdapter;
    RecyclerView personRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: POINT.21 In the Activity onCreate method set the recyclerView variable to recyclerView XML using findViewById (DONE)
        personRecycleView = findViewById(R.id.ma_rv_person);
        //TODO: POINT.22 In the Activity onCreate method create a new layoutManager and set it on the recyclerView (DONE)
        personRecycleView.setLayoutManager(new LinearLayoutManager(this));
        //TODO: POINT.23 In the Activity onCreate method SetHasfixedSize = true on the recyclerView (DONE
        personRecycleView.setHasFixedSize(true);
        //TODO: POINT.24 In the Activity onCreate method set the adapter variable to a new instance of your adapter class passing in the dataSource (DONE)
        viewAdapter = new PersonRecyclerViewAdapter(dataSource);
        //TODO: POINT.25 In the Activity onCreate method set the adapter on the recyclerView (DONE)
        personRecycleView.setAdapter(viewAdapter);
    }
}
