package com.as.recyclerviewtype;

/**
 * -----------------------------
 * Created by zqf on 2019/1/10.
 * ---------------------------
 */
public class DataBean {
    //需要准备的数据
    private String imageUrl;
    private String text;
    private String pinText;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPinText() {
        return pinText;
    }

    public void setPinText(String pinText) {
        this.pinText = pinText;
    }

    public DataBean(String imageUrl, String text, String pinText) {
        this.imageUrl = imageUrl;
        this.text = text;
        this.pinText = pinText;
    }
}
