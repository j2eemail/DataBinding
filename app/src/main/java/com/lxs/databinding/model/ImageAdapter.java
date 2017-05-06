package com.lxs.databinding.model;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2017/5/6.
 */

public class ImageAdapter {
    @BindingAdapter(value = {"url", "resId", "defaultImg", "errorImg"}, requireAll = false)
    public static void setImageView(ImageView imageView, String url, int resId, int defaultImg, int errorImg) {
        if (TextUtils.isEmpty(url)) {
            Picasso.with(imageView.getContext())
                    .load(resId != 0 ? resId : defaultImg)//网络图片
                    .into(imageView);
        } else {
            Picasso.with(imageView.getContext())
                    .load(url)//网络图片
                    .placeholder(defaultImg)//加载过程中的图片显示
                    .error(errorImg)
                    .into(imageView);
        }
    }
}
