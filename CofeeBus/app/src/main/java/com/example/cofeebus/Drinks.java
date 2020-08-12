package com.example.cofeebus;

import android.provider.ContactsContract;

public class Drinks {
    private String name;
    private String desc;
    private int imageId;

    public static final Drinks[] drinks = {
            new Drinks("Latte", "This is description for latte", R.drawable.latte),
            new Drinks("Capachino", "This is a description for capachni",R.drawable.cap),
            new Drinks("Filter Coffee", "This is a description for filter coffee", R.drawable.beans),
    };

    private Drinks(String name, String desc, int id){
        this.name = name;
        this.desc = desc;
        this.imageId = id;
        }

        public String detDesc(){
        return name;
        }

        public String getName(){
        return name;
        }

        public int getImageId(){
        return imageId;
        }

        public String toString(){
        return this.name;
        }
}
