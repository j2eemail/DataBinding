package com.lxs.databinding.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.lxs.databinding.R;
import com.lxs.databinding.databinding.ObservableBinding;
import com.lxs.databinding.model.ObservableModel;

/**
 * Created by Administrator on 2017/5/5.
 */

public class ObservableActivity extends Activity {

    private ObservableBinding observableBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        observableBinding = DataBindingUtil.setContentView(this, R.layout.observable);
        ObservableModel observableModel = new ObservableModel("txt", "txt1");
        observableBinding.setObservableModel(observableModel);
        observableBinding.setObservableListener(new ObservableListener());
    }

    public class ObservableListener {

        public void onClick(View view) {
            if (!TextUtils.isEmpty(observableBinding.ovservableEdit.getText())) {
                switch (view.getId()) {
                    case R.id.btn1:
                        observableBinding.ovservableTxt.setText(observableBinding.ovservableEdit.getText());
                        break;
                    case R.id.btn2:
                        observableBinding.ovservableTxt1.setText(observableBinding.ovservableEdit.getText());
                        break;
                    case R.id.btn3:
                        observableBinding.ovservableTxt.setText(observableBinding.ovservableEdit.getText());
                        observableBinding.ovservableTxt1.setText(observableBinding.ovservableEdit.getText());
                        break;
                }
            } else {
                Toast.makeText(getApplicationContext(), "请输入要修改成的内容", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
