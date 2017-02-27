package com.jayfeng.lesscode.headerbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jayfeng.lesscode.core.ViewLess;

public class HeaderBar extends LinearLayout {

    // title style
    private int mTitleTextColor;
    private int mTitleTextSize;

    // item style
    private int mItemTextNormalColor;
    private int mItemTextPressedColor;
    private int mItemTextSize;

    // header
    private int mHeaderHeight;
    private Drawable mHeaderBackground;
    private Drawable mHeaderShadow;

    private TextView mTitleView;
    private RelativeLayout mHeaderContainer;
    private LinearLayout mLeftContainer;
    private LinearLayout mRightContainer;
    private ImageView mShadowView;

    public HeaderBar(Context context) {
        super(context);
        init(null, 0);
    }

    public HeaderBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public HeaderBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs, int defStyle) {
        LayoutInflater.from(getContext()).inflate(R.layout.headerbar, this, true);

        final TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.HeaderBar, defStyle, 0);

        mTitleTextColor = a.getColor(R.styleable.HeaderBar_headerbar_title_text_color, HeaderBarConfig.getTitleTextColor());
        mTitleTextSize = a.getDimensionPixelSize(R.styleable.HeaderBar_headerbar_title_text_size, HeaderBarConfig.getTitleTextSize());

        mItemTextNormalColor = a.getColor(R.styleable.HeaderBar_headerbar_item_text_normal_color, HeaderBarConfig.getItemTextNormalColor());
        mItemTextPressedColor = a.getColor(R.styleable.HeaderBar_headerbar_item_text_pressed_color, HeaderBarConfig.getItemTextPressedColor());
        mItemTextSize = a.getDimensionPixelSize(R.styleable.HeaderBar_headerbar_item_text_size, HeaderBarConfig.getItemTextSize());

        mHeaderHeight = a.getDimensionPixelSize(R.styleable.HeaderBar_headerbar_height, HeaderBarConfig.getHeaderHeight());
        if (a.hasValue(R.styleable.HeaderBar_headerbar_background)) {
            mHeaderBackground = a.getDrawable(R.styleable.HeaderBar_headerbar_background);
            mHeaderBackground.setCallback(this);
        } else {
            mHeaderBackground = HeaderBarConfig.getHeaderBackgroundDrawable();
        }
        if (a.hasValue(R.styleable.HeaderBar_headerbar_shadow)) {
            mHeaderShadow = a.getDrawable(R.styleable.HeaderBar_headerbar_shadow);
        } else {
            mHeaderShadow = HeaderBarConfig.getHeaderShadowDrawable();
        }

        a.recycle();

        mTitleView = ViewLess.$(this, R.id.title);
        mHeaderContainer = ViewLess.$(this, R.id.header_container);
        mLeftContainer = ViewLess.$(this, R.id.left_container);
        mRightContainer = ViewLess.$(this, R.id.right_container);
        mShadowView = ViewLess.$(this, R.id.shadow);

        mTitleView.setTextColor(mTitleTextColor);
        mTitleView.setTextSize(mTitleTextSize);
        if (mHeaderShadow != null) {
            mShadowView.setImageDrawable(mHeaderShadow);
        } else {
            mShadowView.setVisibility(View.GONE);
        }
        mHeaderContainer.setBackgroundDrawable(mHeaderBackground);
        mHeaderContainer.getLayoutParams().height = mHeaderHeight;
    }

    public TextView getTitleView() {
        return mTitleView;
    }

    public void setTitle(String title) {
        mTitleView.setText(title);
    }

    public void setTitle(int titleResource) {
        mTitleView.setText(titleResource);
    }

    public void showBack(OnClickListener clickListener) {
        HeaderBarItemImage headerBarItemImage = (HeaderBarItemImage) LayoutInflater.from(getContext()).inflate(R.layout.headerbar_item_image, mLeftContainer, false);
        if (HeaderBarConfig.getHeaderBackIcon() != 0) {
            headerBarItemImage.setImageResource(HeaderBarConfig.getHeaderBackIcon());
        }
        headerBarItemImage.setOnClickListener(clickListener);
        headerBarItemImage.setBackgroundResource(HeaderBarConfig.getItemBackgroudResource());
        mLeftContainer.addView(headerBarItemImage);
    }

    public void addLeftTextItem(String text, OnClickListener clickListener) {
        HeaderBarItemText headerBarItemText = (HeaderBarItemText) LayoutInflater.from(getContext()).inflate(R.layout.headerbar_item_text, mLeftContainer, false);
        headerBarItemText.setText(text);
        headerBarItemText.setTextColor(HeaderBarHelper.createColorStateList(mItemTextNormalColor, mItemTextPressedColor));
        headerBarItemText.setTextSize(mItemTextSize);
        headerBarItemText.setOnClickListener(clickListener);
        headerBarItemText.setBackgroundResource(HeaderBarConfig.getItemBackgroudResource());
        mLeftContainer.addView(headerBarItemText);

    }
    public void addLeftImageItem(int imageResource, OnClickListener clickListener) {
        HeaderBarItemImage headerBarItemImage = (HeaderBarItemImage) LayoutInflater.from(getContext()).inflate(R.layout.headerbar_item_image, mLeftContainer, false);
        headerBarItemImage.setImageResource(imageResource);
        headerBarItemImage.setOnClickListener(clickListener);
        headerBarItemImage.setBackgroundResource(HeaderBarConfig.getItemBackgroudResource());
        mLeftContainer.addView(headerBarItemImage);
    }

    public void addRightTextItem(String text, OnClickListener clickListener) {
        HeaderBarItemText headerBarItemText = (HeaderBarItemText) LayoutInflater.from(getContext()).inflate(R.layout.headerbar_item_text, mRightContainer, false);
        headerBarItemText.setText(text);
        headerBarItemText.setTextColor(HeaderBarHelper.createColorStateList(mItemTextNormalColor, mItemTextPressedColor));
        headerBarItemText.setTextSize(mItemTextSize);
        headerBarItemText.setBackgroundResource(HeaderBarConfig.getItemBackgroudResource());
        headerBarItemText.setOnClickListener(clickListener);
        mRightContainer.addView(headerBarItemText);

    }
    public void addRightImageItem(int imageResource, OnClickListener clickListener) {
        HeaderBarItemImage headerBarItemImage = (HeaderBarItemImage) LayoutInflater.from(getContext()).inflate(R.layout.headerbar_item_image, mLeftContainer, false);
        headerBarItemImage.setImageResource(imageResource);
        headerBarItemImage.setOnClickListener(clickListener);
        headerBarItemImage.setBackgroundResource(HeaderBarConfig.getItemBackgroudResource());
        mRightContainer.addView(headerBarItemImage);
    }

    public void hideShadow() {
        mShadowView.setVisibility(View.GONE);
    }
}
