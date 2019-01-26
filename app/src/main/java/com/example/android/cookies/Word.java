package com.example.android.cookies;

public class Word {
    private String mDefaulttranslation;

    private String mMiwoktranslation;

    private int mAudioResourceId;

    private int mMiwokimage=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaultTranslation, String miwokTranslation,int audioresource) {
        mDefaulttranslation = defaultTranslation;
        mMiwoktranslation = miwokTranslation;
        mAudioResourceId=audioresource;
    }


    public Word(String defaulttranslation, String miwoktranslation,int miwokimage,int audioresource)
    {
        mDefaulttranslation=defaulttranslation;

        mMiwoktranslation=miwoktranslation;

        mMiwokimage=miwokimage;

        mAudioResourceId=audioresource;

    }

    public String getDefaulttranslation()
    {
        return mDefaulttranslation;
    }

    public String getmMiwoktranslation()
    {
        return  mMiwoktranslation;
    }

    public int getmiwokimage()
    {
        return  mMiwokimage;
    }

    public boolean hasimage()
    {
        return mMiwokimage!=NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
