package com.omega_r.libs.omegarecyclerview.sticky_header;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public abstract class StickyHeaderDecoration extends RecyclerView.ItemDecoration {

    public static final long NO_HEADER_ID = -1L;

    public abstract void setStickyHeaderAdapter(StickyHeaderAdapter adapter);
    public abstract void setItemSpace(int itemSpace);

    protected boolean isReverseLayout(RecyclerView parent) {
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getReverseLayout();
        }
        return false;
    }
}
