package com.example.filmindonesia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {

    String data1[], data2[];
    int images[];
    Context context;

    public AdapterData(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        holder.game_steam_txt.setText(data1[position]);
        holder.deskripsi_txt.setText(data2[position]);
        holder.image_img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class HolderData extends RecyclerView.ViewHolder {

        TextView game_steam_txt, deskripsi_txt;
        ImageView image_img;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            game_steam_txt = itemView.findViewById(R.id.judul_txt);
            deskripsi_txt = itemView.findViewById(R.id.deskripsi_txt);
            image_img = itemView.findViewById(R.id.image_img);
        }
    }
}
