package com.example.josh.spaceheroes.util;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.annotation.DrawableRes;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by joshuarose on 4/19/16.
 */
public class CustomBinders {
    @BindingAdapter({"font"})
    public static void setFont(TextView textView, String fontName){
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
    }

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }

    @BindingAdapter({"gif"})
    public static void loadGif(GifImageView gifView, @DrawableRes int drawableRes){
        gifView.setImageResource(drawableRes);
    }
}
