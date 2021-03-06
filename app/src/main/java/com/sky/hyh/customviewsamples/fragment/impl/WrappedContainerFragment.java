package com.sky.hyh.customviewsamples.fragment.impl;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.hyh.annotation.InjectFragment;
import com.hyh.base_lib.BaseFragment;
import com.hyh.base_lib.annotation.FindViewByIdAno;
import com.sky.hyh.customviewsamples.R;
import com.sky.hyh.customviewsamples.customview.wrappedContainer.WrappedContainer2;

/**
 * Created by hyh on 2019/2/13 21:02
 * E-Mail Address：fjnuhyh122@gmail.com
 */
@InjectFragment()
public class WrappedContainerFragment extends BaseFragment {
    @FindViewByIdAno(R.id.wc_container)
    private WrappedContainer2 mWrappedContainer;
    @FindViewByIdAno(R.id.btn_add)
    private Button mBtnAdd;

    @Override
    protected int getResId() {
        return R.layout.fragment_wrapped_container;
    }

    @Override
    protected void initViews(View rootView) {
        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.p1));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.gravity = Gravity.CENTER;
                imageView.setLayoutParams(layoutParams);

                mWrappedContainer.add();
            }
        });
    }
}
