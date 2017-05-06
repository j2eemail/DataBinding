package com.lxs.databinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.lxs.databinding.BR;
import com.lxs.databinding.R;
import com.lxs.databinding.databinding.UiBindingBinding;
import com.lxs.databinding.model.UIModel;

/**
 * Created by Administrator on 2017/5/5.
 */

public class UIBindingActivity extends Activity {

    private UiBindingBinding uiBindingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        uiBindingBinding = DataBindingUtil.setContentView(this, R.layout.ui_binding);
        UIModel uiModel = new UIModel(1, "测试");
        uiBindingBinding.setUiModel(uiModel);
//        uiBindingBinding.setVariable(BR.uiModel,uiModel); 同上

    }
}
