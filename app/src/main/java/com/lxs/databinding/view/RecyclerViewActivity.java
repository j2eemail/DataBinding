package com.lxs.databinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.lxs.databinding.R;
import com.lxs.databinding.adapter.RecyclerViewAdapter;
import com.lxs.databinding.databinding.RecyclerviewBinding;
import com.lxs.databinding.databinding.RecyclerviewItemBinding;
import com.lxs.databinding.model.ImageModel;
import com.lxs.databinding.model.RecyclerViewModel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/6.
 */

public class RecyclerViewActivity extends Activity implements RecyclerViewAdapter.AdapterCallback<RecyclerviewItemBinding> {

    private RecyclerviewBinding recyclerviewBinding;
    private ArrayList<RecyclerViewModel> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recyclerviewBinding = DataBindingUtil.setContentView(this, R.layout.recyclerview);
        recyclerviewBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        for (int i = 0; i < 10; i++) {
            RecyclerViewModel rvm = new RecyclerViewModel(i, "name" + i, new ImageModel());
            listData.add(rvm);
        }
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter<RecyclerViewModel, RecyclerviewItemBinding>(R.layout.recyclerview_item, listData, this);
        recyclerviewBinding.recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public void onBindViewHolder(final RecyclerviewItemBinding recyclerviewItemBinding, final int position) {
        recyclerviewItemBinding.setRecyclerViewModel(listData.get(position));
        recyclerviewItemBinding.itemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listData.get(position).setName("我被点击了！");
                recyclerviewItemBinding.itemTxt.setText("我被点击了！");
            }
        });
    }
}
