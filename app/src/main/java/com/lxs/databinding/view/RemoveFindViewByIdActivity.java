package com.lxs.databinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.lxs.databinding.R;
import com.lxs.databinding.databinding.RemoveFindViewByIdBinding;

/**
 * Created by Administrator on 2017/5/5.
 */

public class RemoveFindViewByIdActivity extends Activity {

    private RemoveFindViewByIdBinding idLayoutBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        idLayoutBinding = DataBindingUtil.setContentView(this, R.layout.remove_find_view_by_id);
        idLayoutBinding.idEdit.setText("我是输入框");
        idLayoutBinding.idTxt.setText("我的文本框");
        idLayoutBinding.idBtn.setText("我是按钮");
    }
}
