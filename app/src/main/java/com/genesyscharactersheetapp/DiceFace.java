package com.genesyscharactersheetapp;

public class DiceFace {

    private String name;
    private int imageResourceId;

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    private DiceFace(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public static final DiceFace[] faces = {                                                // Indexes for my sanity while working
            new DiceFace("DoubleAdvantage", R.drawable.doubleadvantage),            // 0
            new DiceFace("DoubleSuccess", R.drawable.doublesuccess),                // 1
            new DiceFace("SuccessAdvantage", R.drawable.successadvantage),          // 2
            new DiceFace("advantage", R.drawable.advantage),                        // 3
            new DiceFace("disadvantage", R.drawable.disadvantage),                  // 4
            new DiceFace("failure", R.drawable.failure),                            // 5
            new DiceFace("failureDisadvantage", R.drawable.failuredisadvantage),    // 6
            new DiceFace("doubleFailure", R.drawable.doublefailure),                // 7
            new DiceFace("success", R.drawable.success),                            // 8
            new DiceFace("triumph", R.drawable.triumph),                            // 9
            new DiceFace("despair", R.drawable.despair),                            // 10
            new DiceFace("blank", R.drawable.blank),                                // 11

/*           Star Wars specific stuff, unsure if will use
            new DiceFace("singledarkside", R.drawable.singledarkside),              // 12
            new DiceFace("singlelightside", R.drawable.singlelightside),            // 13
            new DiceFace("doubledarkside", R.drawable.doubledarkside),              // 14
            new DiceFace("doublelightside", R.drawable.doublelightside),            // 15
            new DiceFace("doubledsiadvantage", R.drawable.doubledisadvantage)       // 16*/
    };
}
