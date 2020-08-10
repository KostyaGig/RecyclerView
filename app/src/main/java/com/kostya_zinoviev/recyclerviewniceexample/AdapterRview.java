package com.kostya_zinoviev.recyclerviewniceexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRview extends RecyclerView.Adapter<AdapterRview.AdView> {
    ArrayList<Person> mArrayList;
    public AdapterRview(ArrayList<Person> ArrayList){
        mArrayList = ArrayList;
    }

    public class AdView extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mName;
        public TextView mSurname;
        public AdView(@NonNull View item){
            super(item);
            mImageView = itemView.findViewById(R.id.im);
            mName = itemView.findViewById(R.id.tv1);
            mSurname = itemView.findViewById(R.id.tv2);
        }
    }

    @NonNull
    @Override
    public AdView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_list,parent,false);
        AdView av = new AdView(v);
        return av;
    }

    @Override
    public void onBindViewHolder(@NonNull AdView holder, int position) {
        holder.mImageView.setImageResource(mArrayList.get(position).getmImageView());
        holder.mName.setText(mArrayList.get(position).getmName());
        holder.mSurname.setText(mArrayList.get(position).getmSurname());
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

}
