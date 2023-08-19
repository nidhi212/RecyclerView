package com.example.recyclerview.Models;

public class RecipeModels {
    int pic;
    String text;

    public RecipeModels(int pic, String text) {
        this.pic = pic;
        this.text = text;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
