package com.moringaschool.afrikapu.Recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    @NonNull
    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }


    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
