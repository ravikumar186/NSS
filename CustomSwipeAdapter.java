package com.example.raviranjan.navigation;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class CustomSwipeAdapter extends PagerAdapter {
    private int[] image_resources={R.drawable.pic10,R.drawable.pic11,R.drawable.pic12,R.drawable.pic13,R.drawable.pic14};
    private Context ctx;
    private LayoutInflater layoutInflater;
    public CustomSwipeAdapter(Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return image_resources.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view==(FrameLayout)object);
    }
    @Override
    public  Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View Item_view = layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView=(ImageView)Item_view.findViewById(R.id.image_view);
        imageView.setImageResource(image_resources[position]);
        container.addView(Item_view);
        return Item_view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((FrameLayout) object);
    }
}

