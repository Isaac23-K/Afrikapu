package com.moringaschool.afrikapu.Recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuUserAdapter extends RecyclerView.Adapter<MenuUserAdapter.MenuUserViewHolder> {
    @NonNull
    @Override
    public MenuUserAdapter.MenuUserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuUserAdapter.MenuUserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MenuUserViewHolder extends RecyclerView.ViewHolder {
        public MenuUserViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
