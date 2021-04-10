//package com.moringa.covidtracker.Adapter;
//
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.moringa.covidtracker.R;
//import com.moringa.covidtracker.models.CountriesResponse;
//import com.moringa.covidtracker.util.ItemTouchHelperViewHolder;
//import com.squareup.picasso.Picasso;
//
//import java.util.ArrayList;
//
//public class FirebaseCovidViewHolder  extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {
//
//    View mView;
//    Context mContext;
//
//
//    public FirebaseCovidViewHolder(@NonNull View itemView) {
//        super(itemView);
//        mView = itemView;
//        mContext = itemView.getContext();
//        itemView.setOnClickListener(this);
//    }
//
//
//    public void bind(CountriesResponse countriesResponse) {
//
//        TextView nameTextView = (TextView) mView.findViewById(R.id.tvCountryName);
//        TextView categoryTextView = (TextView) mView.findViewById(R.id.action_search);
//        TextView ratingTextView = (TextView) mView.findViewById(R.id.tvCountryName);
//
//
//
//
//    }
//
////    @Override
////    public void onClick(View view) {
////        final ArrayList<CountriesResponse> countriesResponses = new ArrayList<>();
//////        DatabaseReference ref = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_RESTAURANTS);
//////        ref.addListenerForSingleValueEvent(new ValueEventListener() {
////
////
////    }
//
//    @Override
//    public void onItemSelected() {
//        Log.d("Animation", "onItemSelected");
//        // we will add animations here
//    }
//
//    @Override
//    public void onItemClear() {
//        Log.d("Animation", "onItemClear");
//        // we will add animations here
//    }
//
//}
