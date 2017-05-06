package com.lxs.databinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.lxs.databinding.R;
import com.lxs.databinding.databinding.ImageBinding;
import com.lxs.databinding.model.ImageModel;

/**
 * Created by Administrator on 2017/5/6.
 */

public class ImageViewActivity extends Activity {

    ImageBinding imageBinding;
    ImageModel imageModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageBinding = DataBindingUtil.setContentView(this, R.layout.image);
        imageModel = new ImageModel();
        imageBinding.setImageModel(imageModel);
        imageBinding.setBtnListener(new BtnListener());
    }

    public class BtnListener {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn1:
                    imageModel.setUrl("");
                    imageModel.setResId(R.mipmap.avatar);
                    break;
                case R.id.btn2:
                    String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1494048416313&di=4f5dc8b663ea5b53dc37b79361d1ca8a&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F0178b755a7585932f875495e14b0ac.jpg";
                    imageModel.setUrl(url);
                    break;
            }
        }
    }
}
