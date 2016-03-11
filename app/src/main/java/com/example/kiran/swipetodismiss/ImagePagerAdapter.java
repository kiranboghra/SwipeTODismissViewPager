package com.example.kiran.swipetodismiss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by kiran on 27/2/16.
 */
public class ImagePagerAdapter extends android.support.v4.view.PagerAdapter {

    private Context context;
    int[] myIntArray = {R.drawable.nature1, R.drawable.nature2, R.drawable.nature3};

    public ImagePagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return myIntArray.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {


        View view = LayoutInflater.from(context).inflate(R.layout.pager_item_image, container, false);
        final ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(myIntArray[position]);

        container.addView(view);
        return view;
    }


}
