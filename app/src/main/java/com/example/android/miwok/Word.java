package com.example.android.miwok;

class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID =NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    int getImageResourceID(){ return mImageResourceID; }

    boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
