package com.example.android.miwok;

/**
 * Created by Hafitz Rizki on 4/16/2018.
 */

public class Word {

    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



//    generate constructor

//    public Word(String defaultTranslation, String MiwokTranslation) {
//        this.mdefaultTranslation = defaultTranslation;
//        this.mMiwokTranslation = MiwokTranslation;
//    }
//
//    public String getdefaultTranslation(){
//        return mdefaultTranslation;
//    }
//
//    public String getMiwokTranslation(){
//        return mMiwokTranslation;
//    }

    public Word(String mdefaultTranslation, String mMiwokTranslation) {
        this.mdefaultTranslation = mdefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mdefaultTranslation, String mMiwokTranslation, int mImageResourceId) {
        this.mdefaultTranslation = mdefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }


    public String getdefaultTranslation(){
        return mdefaultTranslation;
    }

    public String getMiwokTranslation(){

        return mMiwokTranslation;
    }

    public  int getmImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
