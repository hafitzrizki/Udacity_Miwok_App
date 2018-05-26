package com.example.android.miwok;

/**
 * Created by Hafitz Rizki on 4/16/2018.
 */

public class Word {

    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;


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

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    public  int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
