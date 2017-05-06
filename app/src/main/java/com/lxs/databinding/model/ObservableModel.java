package com.lxs.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.lxs.databinding.BR;
import java.util.Observable;

/**
 * Created by Administrator on 2017/5/5.
 */

public class ObservableModel extends BaseObservable {

    public ObservableModel(String txt, String txt1) {
        this.txt = txt;
        this.txt1 = txt1;
    }

    private String edit;
    private String txt;
    private String txt1;
    private boolean all;

    @Bindable
    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    @Bindable
    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
        notifyPropertyChanged(BR.txt);
    }

    @Bindable
    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
        notifyPropertyChanged(BR.txt1);
    }

    @Bindable
    public boolean isAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
        notifyChange();//刷新全部
    }
}
