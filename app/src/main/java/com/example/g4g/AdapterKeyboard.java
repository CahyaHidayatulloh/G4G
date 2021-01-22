package com.example.g4g;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterKeyboard extends RecyclerView.Adapter<AdapterKeyboard.KeyboardViewHolder> {
    boolean isDark = false;
    Context KeyboardContext;
    List<keyboard> keyboardData;
    public AdapterKeyboard (Context KeyboardContext, List<keyboard> keyboardData, boolean isDark){
        this.KeyboardContext=KeyboardContext;
        this.keyboardData=keyboardData;
        this.isDark=isDark;
    }
    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public KeyboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout;
        layout = LayoutInflater.from(KeyboardContext).inflate(R.layout.item_keyboard,parent,false);
        return new KeyboardViewHolder(layout);

    }

    @Override
    public void onBindViewHolder(@NonNull final KeyboardViewHolder holder, final int position) {
        holder.tv_keyboard.setText(keyboardData.get(position).title_key);
        holder.tv_des_keyboard.setText(keyboardData.get(position).deskripsi_key);
        holder.imageKeyboard.setImageResource(keyboardData.get(position).foto_keyboard);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 1){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard2.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 2){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard3.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 3){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard4.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 4){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard5.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 5){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard6.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 6){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard7.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 7){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard8.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 8){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard9.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
                else if (position == 9){
                    Intent tampilankeyboard = new Intent(KeyboardContext, TampilanKeyboard10.class);
                    KeyboardContext.startActivity(tampilankeyboard);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return keyboardData.size();
    }

    public class KeyboardViewHolder extends RecyclerView.ViewHolder {
        TextView tv_keyboard,tv_des_keyboard,tampilan_keyboard,tampilan_des_keyboard;
        ImageView imageKeyboard,tampilangambarkey;

        public KeyboardViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_keyboard = itemView.findViewById(R.id.tv_keyboard);
            tv_des_keyboard = itemView.findViewById(R.id.tv_des_keyboard);
            imageKeyboard = itemView.findViewById(R.id.imageKeyboard);
            tampilan_keyboard = itemView.findViewById(R.id.judul_tampil_key);
            tampilan_des_keyboard = itemView.findViewById(R.id.des_tampil_key);
            tampilangambarkey = itemView.findViewById(R.id.gambar_tampil_key);
        }
    }

}
