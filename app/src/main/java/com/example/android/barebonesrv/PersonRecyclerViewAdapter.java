package com.example.android.barebonesrv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by peterpomlett on 25/11/2017.
 */

//TODO: POINT.5 Create a separate class that extends RecyclerView.Adapter<MyAdapter.MyViewHolder> (DONE)

public class PersonRecyclerViewAdapter extends RecyclerView.Adapter<PersonRecyclerViewAdapter.PersonViewHolder> {
    //TODO: POINT.11 In the Adaptor class create a variable for the DataSource (DONE)
    private Person[] dataSource;

    //TODO: POINT.12 In the Adaptor class create a constructor that has a parameter of DataSource and set the variable of DataSource to the parameter (DONE)
    public PersonRecyclerViewAdapter(Person[] dataSource) {
        this.dataSource = dataSource;
    }

    //TODO: POINT.13 In the Adaptor class create a setter for the Datasource variable and call notifyDataSetChanged within the setter to refresh recyclerView (DONE)
    // UNUSED uncomment it you need to refresh recyclerView data
  /*  public void setDataSource(Person[] dataSource) {
        this.dataSource = dataSource;
        notifyDataSetChanged();
    }*/

    //TODO: POINT.14 In the Adaptor class override onCreateViewHolder(ViewGroup parent, int viewType) (DONE)
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO: POINT.15 in the onCreateViewHolder method get view by using View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.forcast_list_item, parent, false);. Then return new MyViewHolder(v); (DONE)
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new PersonViewHolder(v);
    }


    //TODO: POINT.18 In the Adaptor class override the onBindViewholder method and call holder.bind(position); (DONE)
    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.bind(position);
    }


    //TODO: POINT.16 in the Adaptor class override the getItemCount method (DONE)
    @Override
    public int getItemCount() {
        //TODO: POINT.17 In the getItemCount method check the dataSource for null if not return its length (DONE)
        if (dataSource == null) {
            return 0;
        }
        return dataSource.length;
    }

    // TODO: POINT.6 Create a class that that extends  RecyclerView.Viewholder and add it as an inner class of the Adapter class (DONE)
    public class PersonViewHolder extends RecyclerView.ViewHolder {

        //TODO: POINT.7 In the viewHolder class create variables for the item views (DONE)
        TextView firstNameTextView;
        TextView secondNameTextView;
        TextView favoriteProgramingLanguage;

        //TODO: POINT.8 Create a viewHolder constructor that takes view as a parameter (DONE)
        public PersonViewHolder(View itemView) {
            //TODO: POINT.9 In the viewHolder constructor call super then bind the item views variables to the item xml.something like (Cast)view.findViewById(R.id.my_id); (DONE)
            super(itemView);
            firstNameTextView = (TextView) itemView.findViewById(R.id.rvi_tv_first_name);
            secondNameTextView = (TextView) itemView.findViewById(R.id.rvi_tv_second_name);
            favoriteProgramingLanguage = (TextView) itemView.findViewById(R.id.rvi_programing_language);
        }

        //TODO: POINT.10 in the viewHolder create a method called void bind(int listIndex) {// Set the itemViews values to the values of the object at listIndex} (DONE)
        public void bind(int listIndex) {
            Person person = dataSource[listIndex];
            firstNameTextView.setText(person.getFirstName());
            secondNameTextView.setText(person.getSecondName());
            favoriteProgramingLanguage.setText(person.getFavoriteProgramingLanguage());
        }

    }













}
