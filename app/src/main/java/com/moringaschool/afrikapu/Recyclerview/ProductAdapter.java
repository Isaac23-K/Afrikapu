package com.moringaschool.afrikapu.Recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.afrikapu.Model.Oders;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.productviewholder> {
    private ArrayList<Oders> oderList ;
    MenuAdapter.RecyclerViewClickListener listener;
    @Override
    public ProductAdapter.productviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.productviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class productviewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public productviewholder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
