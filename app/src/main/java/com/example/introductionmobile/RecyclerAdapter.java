package com.example.introductionmobile;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<RocketModel> rocketModels;

    public RecyclerAdapter(ArrayList<RocketModel> rocketModels){
        this.rocketModels = rocketModels;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull RecyclerAdapter.ViewHolder viewHolder, int i) {

        RocketModel rocketModel = rocketModels.get(i);

        viewHolder.rocketName.setText(rocketModel.getRocketName());
        viewHolder.launchDate.setText(rocketModel.getLaunchDate());
        viewHolder.payload.setText(rocketModel.getPayload());

        if(rocketModel.isLaunchSuccess()){
            viewHolder.launchSuccess.setText("Launch Succeed");
        }else{
            viewHolder.launchSuccess.setText("Launch Failed");
        }

    }

    @Override
    public int getItemCount() {
        return rocketModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView rocketName;
        TextView launchDate;
        TextView launchSuccess;
        TextView payload;

        public ViewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
            super(itemView);
            rocketName = (TextView) itemView.findViewById(R.id.rocketName);
            launchDate = (TextView) itemView.findViewById(R.id.lauchDate);
            launchSuccess = (TextView) itemView.findViewById(R.id.lauchSuccess);
            payload = (TextView) itemView.findViewById(R.id.payload);
        }
    }
}
