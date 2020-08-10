package com.kostya_zinoviev.recyclerviewniceexample;

public class Person {
    private int mImageView;
    private String mName;
    private String mSurname;
    public Person(int imageView,String name, String surname){
        mImageView = imageView;
        mName = name;
        mSurname = surname;
    }

    public int getmImageView() {
        return mImageView;
    }

    public String getmName() {
        return mName;
    }

    public String getmSurname() {
        return mSurname;
    }
}

