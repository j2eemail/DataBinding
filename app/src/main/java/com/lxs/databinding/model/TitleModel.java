package com.lxs.databinding.model;

/**
 * Created by Administrator on 2017/5/5.
 */

public class TitleModel {

    public TitleModel(String btn1,String btn2,String title){
        this.btn1 = btn1;
        this.btn2 = btn2;
        this.title = title;
    }

    private String btn1;
    private String btn2;
    private String title;

    public String getBtn1() {
        return btn1;
    }

    public void setBtn1(String btn1) {
        this.btn1 = btn1;
    }

    public String getBtn2() {
        return btn2;
    }

    public void setBtn2(String btn2) {
        this.btn2 = btn2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
