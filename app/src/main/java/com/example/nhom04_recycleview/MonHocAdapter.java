package com.example.nhom04_recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonHocAdapter  extends RecyclerView.Adapter<MonHocAdapter.ViewHolder> {
    private List<MonHoc> lstMonHoc;
    public MonHocAdapter(List<MonHoc> lstMonHoccs){
        lstMonHoc = lstMonHoccs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View monhocView = inflater.inflate(R.layout.item_monhoc, parent, false);
        ViewHolder viewHolder = new ViewHolder(monhocView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MonHoc temp = lstMonHoc.get(position);

        holder.txtMonHoc.setText(temp.MaHP + "-" + temp.TenHP);
        holder.txtTenGV.setText(temp.TenGV);
        Context context = holder.imgView.getContext();
        int imageId = context.getResources().getIdentifier(temp.TenHinh, "minmap", context.getPackageName());
        if(imageId !=0)
            holder.imgView.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return lstMonHoc.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView txtMonHoc;
        TextView txtTenGV;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            imgView = (ImageView) itemView.findViewById(R.id.imgMonHoc);
            txtMonHoc = (TextView) itemView.findViewById(R.id.txtHocPhan);
            txtTenGV = (TextView) itemView.findViewById(R.id.txtGiaoVien);
        }
    }
}
