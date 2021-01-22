package com.example.g4g;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterHeadset extends RecyclerView.Adapter<AdapterHeadset.HeadsetViewHolder> {
    Context HeadsetContext;
    List<headset> headsetData;

    public AdapterHeadset (Context HeadsetContext, List<headset> headsetData){
        this.HeadsetContext=HeadsetContext;
        this.headsetData=headsetData;

    }
    @NonNull
    @Override
    public HeadsetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout;
        layout = LayoutInflater.from(HeadsetContext).inflate(R.layout.item_headset, parent,false);
        return new HeadsetViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull HeadsetViewHolder holder, final int position) {
        holder.tv_Headset.setText(headsetData.get(position).title_headset);
        holder.tv_des_headset.setText(headsetData.get(position).deskripsi_headset);
        holder.foto_headset.setImageResource(headsetData.get(position).foto_headset);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset1.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 1){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset2.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 2){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset3.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 3){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset4.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 4){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset5.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 5){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset6.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 6){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset7.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 7){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset8.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 8){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset9.class);
                    HeadsetContext.startActivity(tampil);
                }
                else if (position == 9){
                    Intent tampil = new Intent(HeadsetContext, TampilanHeadset10.class);
                    HeadsetContext.startActivity(tampil);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return headsetData.size();
    }

    public class HeadsetViewHolder extends RecyclerView.ViewHolder {
        TextView tv_Headset, tv_des_headset;
        ImageView foto_headset;
        public HeadsetViewHolder(View layout) {
            super(layout);
            tv_Headset = layout.findViewById(R.id.tv_headset);
            tv_des_headset = layout.findViewById(R.id.tv_des_headset);
            foto_headset = layout.findViewById(R.id.imageHeadset);
        }
    }
}
