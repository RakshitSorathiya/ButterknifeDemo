package demo.android.butterknifedemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by ln-149 on 10/2/17.
 */

public class AdapterDis extends RecyclerView.Adapter<AdapterDis.MyViewHolder> {

    ArrayList<String> dislist;

    public AdapterDis(Context context, ArrayList<String> dislist) {

        this.dislist = dislist;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lv_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.iv_dis.setImageDrawable(holder.iv_img);
            holder.tv_dis.setText(dislist.get(0));

    }

    @Override
    public int getItemCount() {
        return dislist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_dis)
        TextView tv_dis;
        @BindView(R.id.iv_dis)
        ImageView iv_dis;

        @BindDrawable(R.drawable.iv_img)
        Drawable iv_img;

        public MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

}
