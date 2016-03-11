package com.example.kiran.swipetodismiss;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by kiran on 7/5/15.
 */
public class CustomViewPager extends ViewPager {

    public OnTouchListener listener;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (listener != null) {
            listener.onTouch(null, ev);
        }
        return super.onTouchEvent(ev);
    }

}
