package com.example.fptclubapp.AppAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fptclubapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class DepCertListAdapter extends RecyclerView.Adapter<DepCertListAdapter.MyViewHolder> {
    ArrayList<String> certifsEtDips;

    class MyViewHolder  extends RecyclerView.ViewHolder {
          private View view;

               public MyViewHolder(View  view) {
                   super(view);
                    this.view = view;
                    }
    }

    public DepCertListAdapter(ArrayList<String> certifsEtDips) {
         this.certifsEtDips = new ArrayList<String>();
         this.certifsEtDips.addAll(certifsEtDips);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.certifdiplomcustomlistitem,parent,false);
        return (new MyViewHolder(v));
    }

    public void addItem(String e) {
        this.certifsEtDips.add(e);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        View itemv = holder.itemView;
        TextView txt = itemv.findViewById(R.id.txtcertdip);
        FloatingActionButton btndelete = itemv.findViewById(R.id.btndeletecert);
        String itemtext = certifsEtDips.get(position);
        txt.setText(itemtext, TextView.BufferType.EDITABLE);

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                certifsEtDips.remove(certifsEtDips.get(position));

                notifyItemRemoved(position);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return (this.certifsEtDips.size());
    }
}
