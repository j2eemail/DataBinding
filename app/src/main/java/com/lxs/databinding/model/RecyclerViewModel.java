package com.lxs.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.lxs.databinding.BR;

/**
 * Created by Administrator on 2017/5/6.
 */

public class RecyclerViewModel extends BaseObservable {

    public RecyclerViewModel(int id, String name, ImageModel imageModel) {
        this.id = id;
        this.name = name;
        this.imageModel = imageModel;
    }

    private int id;
    private String name;
    private ImageModel imageModel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public ImageModel getImageModel() {
        return imageModel;
    }

    public void setImageModel(ImageModel imageModel) {
        this.imageModel = imageModel;
    }
}
