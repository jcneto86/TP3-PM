package com.jcneto.tp3_pm_finale;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.jcneto.tp3_pm_finale.R;

public class ImageAdapter extends BaseAdapter {


    private Context context;
    public Integer[] images = {
            R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image4,
            R.drawable.image5, R.drawable.image6,
            R.drawable.image7, R.drawable.image8,
            R.drawable.image9, R.drawable.image10,
            R.drawable.image11, R.drawable.image12,
            R.drawable.image13, R.drawable.image14,
            R.drawable.image15, R.drawable.image16,
            R.drawable.image17, R.drawable.image18,
            R.drawable.image19, R.drawable.image20,
            R.drawable.image21, R.drawable.image22,
    };
    public Integer[] imagesFull = {
            R.drawable.imagefull1, R.drawable.imagefull2,
            R.drawable.imagefull3, R.drawable.imagefull4,
            R.drawable.imagefull5, R.drawable.imagefull6,
            R.drawable.imagefull7, R.drawable.imagefull8,
            R.drawable.imagefull9, R.drawable.imagefull10,
            R.drawable.imagefull11, R.drawable.imagefull12,
            R.drawable.imagefull13, R.drawable.imagefull14,
            R.drawable.imagefull15, R.drawable.imagefull16,
            R.drawable.imagefull17, R.drawable.imagefull18,
            R.drawable.imagefull19, R.drawable.imagefull20,
            R.drawable.imagefull21, R.drawable.imagefull22,
    };

    public ImageAdapter(Context c)
    {
        context = c;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(240, 240));
        return imageView;
    }
}
