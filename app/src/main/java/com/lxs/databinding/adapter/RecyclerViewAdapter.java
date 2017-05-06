package com.lxs.databinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class RecyclerViewAdapter<M, N extends ViewDataBinding> extends RecyclerView.Adapter<RecyclerViewAdapter.BaseViewHolder> {

    @LayoutRes
    private int layout;
    private List<M> listData;
    private AdapterCallback<N> adapterCallback;

    public RecyclerViewAdapter(@LayoutRes int layout, List<M> listData, AdapterCallback<N> adapterCallback) {
        this.layout = layout;
        this.listData = listData;
        this.adapterCallback = adapterCallback;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new BaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        adapterCallback.onBindViewHolder((N) holder.getBinding(), position);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public static class BaseViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding viewDataBinding;

        public BaseViewHolder(View itemView) {
            super(itemView);
            viewDataBinding = DataBindingUtil.bind(itemView);
        }

        public ViewDataBinding getBinding() {
            return viewDataBinding;
        }
    }

    public interface AdapterCallback<N> {
        void onBindViewHolder(N n, int position);
    }
}