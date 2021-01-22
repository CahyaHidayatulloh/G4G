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

public class AdapterMousepad extends RecyclerView.Adapter<AdapterMousepad.KeyboardViewHolder> {
    Context MousepadContext;
    List<Mousepad> mousepadData;

    public AdapterMousepad (Context MousepadContext, List<Mousepad> mousepadData){
        this.MousepadContext=MousepadContext;
        this.mousepadData=mousepadData;
    }
    @NonNull
    @Override
    public KeyboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout;
        layout = LayoutInflater.from(MousepadContext).inflate(R.layout.item_mousepad,parent,false);
        return new KeyboardViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull KeyboardViewHolder holder, final int position) {
        holder.mousepad.setText(mousepadData.get(position).titleMousepad);
        holder.des_mousepad.setText(mousepadData.get(position).des_mousepad);
        holder.gambarmousepad.setImageResource(mousepadData.get(position).foto_mousepad);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad1.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 1){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad2.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 2){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad3.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 3){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad4.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 4){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad5.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 5){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad6.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 6){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad7.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 7){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad8.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 8){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad9.class);
                    MousepadContext.startActivity(tampil);
                }

                else if (position == 9){
                    Intent tampil = new Intent(MousepadContext, TampilanMousepad10.class);
                    MousepadContext.startActivity(tampil);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mousepadData.size();
    }

    public class KeyboardViewHolder extends RecyclerView.ViewHolder {
        TextView mousepad, des_mousepad;
        ImageView gambarmousepad;
        public KeyboardViewHolder(View layout) {
            super(layout);
            mousepad = layout.findViewById(R.id.tv_Mousepad);
            des_mousepad = layout.findViewById(R.id.tv_des_mousepad);
            gambarmousepad = layout.findViewById(R.id.imageMousepad);
        }
    }
}
