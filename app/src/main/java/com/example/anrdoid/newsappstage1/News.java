package com.example.anrdoid.newsappstage1;

/**
 * Created by Labtop on 18/02/18.
 */

public class News {
    private String mTitle;
    private String mCategory;
    private String mDate;
    private String mUrl;

    public News(String mTitle, String mCategory, String mDate, String mUrl) {
        this.mTitle = mTitle;
        this.mCategory = mCategory;
        this.mDate = mDate;
        this.mUrl = mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
