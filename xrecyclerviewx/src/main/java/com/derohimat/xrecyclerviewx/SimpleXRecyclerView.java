package com.derohimat.xrecyclerviewx;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public class SimpleXRecyclerView extends XRecyclerView {

    public SimpleXRecyclerView(Context context) {
        super(context);
    }

    public SimpleXRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleXRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setUpAsList() {
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public void setUpAsGrid(int spanCount) {
        setHasFixedSize(true);
        setLayoutManager(new GridLayoutManager(getContext(), spanCount));
    }
}