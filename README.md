# BareBonesRecyclerView
Step by step guide to build a RecyclerView
(RecyclerView Cheat Sheet)
1. Add recyclerView support to dependencies in the build gradle.
2. Add a recyclerView xml with an id to the activity layout xml.
3. Create a layout resource xml file for the recyclerView item and give it an id.
4. Add any TextViews or the views you may need to the item xml and give them id’s.
5. Create a separate class that extends RecyclerView.Adapter<MyAdapter.MyViewHolder> 
6. Create a class that that extends  RecyclerView.Viewholder and add it as an inner class of the Adapter class.
7. In the viewHolder class create variables for the item views .
8. Create a viewHolder constructor that takes view as a parameter.
9. In the viewHolder constructor call super then bind the item views variables to the item xml.something like (Cast)view.findViewById(R.id.my_id);.
10. in the viewHolder create a method called void bind(int listIndex) {// Set the itemViews values to the values of the object at listIndex}
11. In the Adaptor class create a variable for the DataSource.
12. In the Adaptor class create a constructor that has a parameter of DataSource and set the variable of DataSource to the parameter.
13. In the Adaptor class create a setter for the Datasource variable and call notifyDataSetChanged within the setter to refresh recyclerView.
14. In the Adaptor class override onCreateViewHolder(ViewGroup parent, int viewType).
15. in the onCreateViewHolder method get view by using View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.forcast_list_item, parent, false);. Then return new MyViewHolder(v);.
16. in the Adaptor class override the getItemCount  method.
17. In the getItemCount method check the dataSource for null if not return its length.
18. In the Adaptor class override the onBindViewholder method and call holder.bind(position);
19. In the Activity class create a variable for the DataSource. Don’t forget to initialise it at some point .
20. In the Activity create a variable for the  adapter and one for the recyclerView.
21. In the Activity onCreate method set the recyclerView variable to recyclerView XML using findViewById.
22. In the Activity onCreate method create a new layoutManager and set it on the recyclerView. 
23. In the Activity onCreate method SetHasfixedSize = true on the recyclerView.
24. In the Activity onCreate method set the adapter variable to a new instance of your adapter class passing in the dataSource.
25. In the Activity onCreate method set the adapter on the recyclerView. 
