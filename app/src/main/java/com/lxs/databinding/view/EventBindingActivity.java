package com.lxs.databinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lxs.databinding.R;
import com.lxs.databinding.databinding.EventBindingBinding;
import com.lxs.databinding.model.UIModel;

/**
 * Created by Administrator on 2017/5/5.
 */

public class EventBindingActivity extends Activity {

    private EventBindingBinding eventBindingBinding;
    private UIModel uiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eventBindingBinding = DataBindingUtil.setContentView(this, R.layout.event_binding);
        uiModel = new UIModel(1, "测试");
        eventBindingBinding.setUiModel(uiModel);
        eventBindingBinding.setEventListenerImpl(new EventListenerImpl());
    }

    public class EventListenerImpl {

        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), ((Button) view).getText(), Toast.LENGTH_LONG).show();
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            uiModel.setName(s.toString());
            eventBindingBinding.setUiModel(uiModel);//全部更新
//            eventBindingBinding.eventTxt.setText(s.toString());//单独更新
        }

        public void getModel(UIModel uiModel) {
            Toast.makeText(getApplicationContext(), uiModel.getName(), Toast.LENGTH_LONG).show();
        }
    }
}
