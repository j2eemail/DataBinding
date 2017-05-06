package com.lxs.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.lxs.databinding.BR;

/**
 * Created by Administrator on 2017/5/6.
 */

public class ImageModel extends BaseObservable {

    private String url;
    private int resId;
    private int defaultImg;
    private int errorImg;

    @Bindable
    public String getUrl() {
        return url;
    }

    @Bindable
    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
        notifyPropertyChanged(BR.resId);
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }

    public int getErrorImg() {
        return errorImg;
    }

    public void setErrorImg(int errorImg) {
        this.errorImg = errorImg;
    }

    public int getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(int defaultImg) {
        this.defaultImg = defaultImg;
    }


}
