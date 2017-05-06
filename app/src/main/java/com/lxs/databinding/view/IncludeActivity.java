package com.lxs.databinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.lxs.databinding.R;
import com.lxs.databinding.databinding.IncludeQuoteBinding;
import com.lxs.databinding.model.IncludeModel;
import com.lxs.databinding.model.TitleModel;

/**
 * Created by Administrator on 2017/5/5.
 */

public class IncludeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IncludeQuoteBinding includeQuoteBinding = DataBindingUtil.setContentView(this, R.layout.include_quote);
        IncludeModel includeModel = new IncludeModel("正文内容");
        TitleModel titleModel = new TitleModel("左", "右", "中间");
        includeModel.setTitleModel(titleModel);
        includeQuoteBinding.setIncludeModel(includeModel);

    }


}
