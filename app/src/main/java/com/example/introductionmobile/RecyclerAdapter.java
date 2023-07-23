package com.example.introductionmobile;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class  RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<RocketModel> rocketModels;

    public RecyclerAdapter(ArrayList<RocketModel> rocketModels) {

        this.rocketModels = rocketModels;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        RocketModel rocketModel = rocketModels.get(position);

        holder.rocketName.setText(rocketModel.getRocketName());
        holder.launchDate.setText(rocketModel.getLaunchDate());
        holder.payload.setText(rocketModel.getPayload());

        if(rocketModel.isLaunchSuccess()){
            holder.launchSuccess.setText("Launch Succeed");
        }else{
            holder.launchSuccess.setText("Launch Failed");
        }

    }

    @Override
    public int getItemCount() {
        return rocketModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView rocketName;
        TextView launchDate;
        TextView launchSuccess;
        TextView payload;

        public ViewHolder(View itemView) {
            super(itemView);
            rocketName = (TextView) itemView.findViewById(R.id.rocketName);
            launchDate = (TextView) itemView.findViewById(R.id.lauchDate);
            launchSuccess = (TextView) itemView.findViewById(R.id.lauchSuccess);
            payload = (TextView) itemView.findViewById(R.id.payload);
        }
    }
}
