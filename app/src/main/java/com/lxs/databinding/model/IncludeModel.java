package com.lxs.databinding.model;

/**
 * Created by Administrator on 2017/5/5.
 */

public class IncludeModel {

    public IncludeModel(String content){
        this.content = content;
    }

    private TitleModel titleModel;
    private String content;

    public TitleModel getTitleModel() {
        return titleModel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitleModel(TitleModel titleModel) {
        this.titleModel = titleModel;
    }


}
