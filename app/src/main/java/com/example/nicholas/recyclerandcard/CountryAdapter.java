package com.example.nicholas.recyclerandcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nicholas on 3/13/18.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{


    ArrayList<Country> arrayList = new ArrayList<Country>();
    Context context;
    CountryAdapter(Context ct ,ArrayList<Country> arrayList){
        this.context=ct;
        this.arrayList=arrayList;
    }
    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,null);
        CountryViewHolder countryViewHolder = new CountryViewHolder(view);
        return countryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

        Country country = arrayList.get( position);
        holder.name.setText(country.getName());
        holder.desc.setText(country.getDesc());
        holder.image.setImageResource(country.getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static  class CountryViewHolder extends RecyclerView.ViewHolder{

        TextView name ,desc;
        ImageView image;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            name= (TextView) itemView.findViewById(R.id.countryname);
            desc = (TextView) itemView.findViewById(R.id.countrydesc);
            image= (ImageView) itemView.findViewById(R.id.countryimage);
        }
    }
}
