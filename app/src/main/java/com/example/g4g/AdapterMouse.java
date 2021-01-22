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

public class AdapterMouse extends RecyclerView.Adapter<AdapterMouse.ViewHolderMouse> {
    Context MouseContext;
    List<Mouse> mouseData;

    public AdapterMouse (Context MouseContext, List<Mouse> mouseData){
        this.MouseContext=MouseContext;
        this.mouseData=mouseData;
    }
    @NonNull
    @Override
    public ViewHolderMouse onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout;
        layout = LayoutInflater.from(MouseContext).inflate(R.layout.item_mouse,parent,false);
        return new ViewHolderMouse(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMouse holder, final int position) {
        holder.tv_mouse.setText(mouseData.get(position).titleMouse);
        holder.tv_des_mouse.setText(mouseData.get(position).deskripisMouse);
        holder.foto_mouse.setImageResource(mouseData.get(position).foto_Mouse);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent tampil = new Intent(MouseContext, TampilanMouse1.class);
                    MouseContext.startActivity(tampil);
                }
                else if (position == 1){
                    Intent tampil = new Intent(MouseContext, TampilanMouse2.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 2){
                    Intent tampil = new Intent(MouseContext, TampilanMouse3.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 3){
                    Intent tampil = new Intent(MouseContext, TampilanMouse4.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 4){
                    Intent tampil = new Intent(MouseContext, TampilanMouse5.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 5){
                    Intent tampil = new Intent(MouseContext, TampilanMouse6.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 6){
                    Intent tampil = new Intent(MouseContext, TampilanMouse7.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 7){
                    Intent tampil = new Intent(MouseContext, TampilanMouse8.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 8){
                    Intent tampil = new Intent(MouseContext, TampilanMouse9.class);
                    MouseContext.startActivity(tampil);
                }

                else if (position == 9){
                    Intent tampil = new Intent(MouseContext, TampilanMouse10.class);
                    MouseContext.startActivity(tampil);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mouseData.size();
    }

    public class ViewHolderMouse extends RecyclerView.ViewHolder {
        TextView tv_mouse, tv_des_mouse;
        ImageView foto_mouse;
        public ViewHolderMouse(View layout) {
            super(layout);
            tv_mouse = layout.findViewById(R.id.tv_mouse);
            tv_des_mouse=layout.findViewById(R.id.tv_des_mouse);
            foto_mouse=layout.findViewById(R.id.imageMouse);
        }
    }
}
