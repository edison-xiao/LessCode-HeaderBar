package com.jayfeng.lesscode.headerbar;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.view.Gravity;

import com.jayfeng.lesscode.core.$;

public class HeaderBarConfig {

    /**
     * ===================================
     * Singleton
     * ===================================
     */
    private volatile static HeaderBarConfig instance;
    public static HeaderBarConfig getInstance() {
        if (instance == null) {
            synchronized ($.class) {
                if (instance == null) {
                    instance = new HeaderBarConfig();
                }
            }
        }
        return instance;
    }

    /**
     * ===================================
     * HeaderBar Config
     * ===================================
     */
    // header
    private static int mHeaderHeight = 56;  // dp
    private static Drawable mHeaderBackgroundDrawable;
    private static int mHeaderShadowHeight = 10;  // dp
    private static Drawable mHeaderShadowDrawable;
    private static int mHeaderBackIcon = 0;

    // title
    private static Typeface mTitleTypeface = null;
    private static int mTitleTextColor = Color.WHITE;
    private static int mTitleTextSize = 14; // sp
    private static int mTitlePaddingLeft = 0;
    private static int mTitlePaddingTop = 0;
    private static int mTitlePaddingRight = 0;
    private static int mTitlePaddingBottom = 0;
    private static Typeface mSubtitleTypeface = null;
    private static int mSubtitleTextColor = Color.WHITE;
    private static int mSubtitleTextSize = 12; // sp

    // item
    private static int mItemTextNormalColor = Color.WHITE;
    private static int mItemTextPressedColor = Color.parseColor("#CCCCCC");
    private static int mItemBackgroudResource = 0;
    private static int mItemTextSize = 12;  // sp
    private static int mItemTextPaddingLeft = 0;
    private static int mItemTextPaddingTop = 0;
    private static int mItemTextPaddingRight = 0;
    private static int mItemTextPaddingBottom = 0;
    private static int mItemImagePaddingLeft = 0;
    private static int mItemImagePaddingTop = 0;
    private static int mItemImagePaddingRight = 0;
    private static int mItemImagePaddingBottom = 0;
    private static int mItemMinWidth = -1;

    // tab
    private static Drawable mTabBottomBackgroundDrawable;

    // popup
    private static Drawable mPopupBackgroundDrawable;
    private static int mPopupItemTextColor = Color.WHITE;
    private static int mPopupItemTextSize = 14;
    private static int mPopupItemTextPaddingLeft = 0;
    private static int mPopupItemTextPaddingTop = 0;
    private static int mPopupItemTextPaddingRight = 0;
    private static int mPopupItemTextPaddingBottom = 0;
    private static int mPopupItemTextGravity = Gravity.LEFT;

    public static int headerHeight() {
        return mHeaderHeight;
    }

    public HeaderBarConfig headerHeight(int headerHeight) {
        HeaderBarConfig.mHeaderHeight = headerHeight;
        return this;
    }

    public static Drawable headerBackgroundDrawable() {
        return mHeaderBackgroundDrawable;
    }

    public HeaderBarConfig headerBackgroundDrawable(Drawable headerBackgroundDrawable) {
        HeaderBarConfig.mHeaderBackgroundDrawable = headerBackgroundDrawable;
        return this;
    }

    public static int headerShadowHeight() {
        return mHeaderShadowHeight;
    }

    public HeaderBarConfig headerShadowHeight(int headerShadowHeight) {
        HeaderBarConfig.mHeaderShadowHeight = headerShadowHeight;
        return this;
    }

    public static Drawable headerShadowDrawable() {
        return mHeaderShadowDrawable;
    }

    public HeaderBarConfig headerShadowDrawable(Drawable headerShadowDrawable) {
        HeaderBarConfig.mHeaderShadowDrawable = headerShadowDrawable;
        return this;
    }

    public static int headerBackIcon() {
        return mHeaderBackIcon;
    }

    public HeaderBarConfig headerBackIcon(int headerBackIcon) {
        HeaderBarConfig.mHeaderBackIcon = headerBackIcon;
        return this;
    }

    public static int titleTextColor() {
        return mTitleTextColor;
    }

    public HeaderBarConfig titleTextColor(int titleTextColor) {
        HeaderBarConfig.mTitleTextColor = titleTextColor;
        return this;
    }

    public static int titleTextSize() {
        return mTitleTextSize;
    }

    public HeaderBarConfig titleTextSize(int titleTextSize) {
        HeaderBarConfig.mTitleTextSize = titleTextSize;
        return this;
    }

    public HeaderBarConfig titlePadding(int left, int top, int right, int bottom) {
        HeaderBarConfig.mTitlePaddingLeft = left;
        HeaderBarConfig.mTitlePaddingTop = top;
        HeaderBarConfig.mTitlePaddingRight = right;
        HeaderBarConfig.mTitlePaddingBottom = bottom;

        return this;
    }

    public static int titlePaddingLeft() {
        return mTitlePaddingLeft;
    }

    public HeaderBarConfig titlePaddingLeft(int titlePaddingLeft) {
        HeaderBarConfig.mTitlePaddingLeft = titlePaddingLeft;
        return this;
    }

    public static int titlePaddingTop() {
        return mTitlePaddingTop;
    }

    public HeaderBarConfig titlePaddingTop(int titlePaddingTop) {
        HeaderBarConfig.mTitlePaddingTop = titlePaddingTop;
        return this;
    }

    public static int titlePaddingRight() {
        return mTitlePaddingRight;
    }

    public HeaderBarConfig titlePaddingRight(int titlePaddingRight) {
        HeaderBarConfig.mTitlePaddingRight = titlePaddingRight;
        return this;
    }

    public static int titlePaddingBottom() {
        return mTitlePaddingBottom;
    }

    public HeaderBarConfig titlePaddingBottom(int titlePaddingBottom) {
        HeaderBarConfig.mTitlePaddingBottom = titlePaddingBottom;
        return this;
    }

    public static Typeface titleTypeface() {
        return mTitleTypeface;
    }

    public HeaderBarConfig titleTypeface(Typeface titleTypeface) {
        HeaderBarConfig.mTitleTypeface = titleTypeface;
        return this;
    }

    public static int subtitleTextColor() {
        return mSubtitleTextColor;
    }

    public HeaderBarConfig subtitleTextColor(int subtitleTextColor) {
        HeaderBarConfig.mSubtitleTextColor = subtitleTextColor;
        return this;
    }

    public static int subtitleTextSize() {
        return mSubtitleTextSize;
    }

    public HeaderBarConfig subtitleTextSize(int subtitleTextSize) {
        HeaderBarConfig.mSubtitleTextSize = subtitleTextSize;
        return this;
    }

    public static Typeface subtitleTypeface() {
        return mSubtitleTypeface;
    }

    public HeaderBarConfig subtitleTypeface(Typeface subtitleTypeface) {
        HeaderBarConfig.mSubtitleTypeface = subtitleTypeface;
        return this;
    }

    public HeaderBarConfig itemTextColor(@ColorInt int itemTextColor) {
        HeaderBarConfig.mItemTextNormalColor = itemTextColor;
        HeaderBarConfig.mItemTextPressedColor = itemTextColor;
        return this;
    }

    public static int itemTextNormalColor() {
        return mItemTextNormalColor;
    }

    public HeaderBarConfig itemTextNormalColor(@ColorInt int itemTextNormalColor) {
        HeaderBarConfig.mItemTextNormalColor = itemTextNormalColor;
        return this;
    }

    public static int itemTextPressedColor() {
        return mItemTextPressedColor;
    }

    public HeaderBarConfig itemTextPressedColor(@ColorInt int itemTextPressedColor) {
        HeaderBarConfig.mItemTextPressedColor = itemTextPressedColor;
        return this;
    }

    public static int itemBackgroudResource() {
        return mItemBackgroudResource;
    }

    public HeaderBarConfig itemBackgroudResource(int itemBackgroudResource) {
        HeaderBarConfig.mItemBackgroudResource = itemBackgroudResource;
        return this;
    }

    public static int itemTextSize() {
        return mItemTextSize;
    }

    public HeaderBarConfig itemTextSize(int itemTextSize) {
        HeaderBarConfig.mItemTextSize = itemTextSize;
        return this;
    }

    public HeaderBarConfig itemTextPadding(int left, int top, int right, int bottom) {
        HeaderBarConfig.mItemTextPaddingLeft = left;
        HeaderBarConfig.mItemTextPaddingTop = top;
        HeaderBarConfig.mItemTextPaddingRight = right;
        HeaderBarConfig.mItemTextPaddingBottom = bottom;

        return this;
    }

    public static int itemTextPaddingLeft() {
        return mItemTextPaddingLeft;
    }

    public HeaderBarConfig itemTextPaddingLeft(int itemTextPaddingLeft) {
        HeaderBarConfig.mItemTextPaddingLeft = itemTextPaddingLeft;
        return this;
    }

    public static int itemTextPaddingTop() {
        return mItemTextPaddingTop;
    }

    public HeaderBarConfig itemTextPaddingTop(int itemTextPaddingTop) {
        HeaderBarConfig.mItemTextPaddingTop = itemTextPaddingTop;
        return this;
    }

    public static int itemTextPaddingRight() {
        return mItemTextPaddingRight;
    }

    public HeaderBarConfig itemTextPaddingRight(int itemTextPaddingRight) {
        HeaderBarConfig.mItemTextPaddingRight = itemTextPaddingRight;
        return this;
    }

    public static int itemTextPaddingBottom() {
        return mItemTextPaddingBottom;
    }

    public HeaderBarConfig itemTextPaddingBottom(int itemTextPaddingBottom) {
        HeaderBarConfig.mItemTextPaddingBottom = itemTextPaddingBottom;
        return this;
    }

    public HeaderBarConfig itemImagePadding(int left, int top, int right, int bottom) {
        HeaderBarConfig.mItemImagePaddingLeft = left;
        HeaderBarConfig.mItemImagePaddingTop = top;
        HeaderBarConfig.mItemImagePaddingRight = right;
        HeaderBarConfig.mItemImagePaddingBottom = bottom;

        return this;
    }

    public static int itemImagePaddingLeft() {
        return mItemImagePaddingLeft;
    }

    public HeaderBarConfig itemImagePaddingLeft(int itemImagePaddingLeft) {
        HeaderBarConfig.mItemImagePaddingLeft = itemImagePaddingLeft;
        return this;
    }

    public static int itemImagePaddingTop() {
        return mItemImagePaddingTop;
    }

    public HeaderBarConfig itemImagePaddingTop(int itemImagePaddingTop) {
        HeaderBarConfig.mItemImagePaddingTop = itemImagePaddingTop;
        return this;
    }

    public static int itemImagePaddingRight() {
        return mItemImagePaddingRight;
    }

    public HeaderBarConfig itemImagePaddingRight(int itemImagePaddingRight) {
        HeaderBarConfig.mItemImagePaddingRight = itemImagePaddingRight;
        return this;
    }

    public static int itemImagePaddingBottom() {
        return mItemImagePaddingBottom;
    }

    public HeaderBarConfig itemImagePaddingBottom(int itemImagePaddingBottom) {
        HeaderBarConfig.mItemImagePaddingBottom = itemImagePaddingBottom;
        return this;
    }

    public static int itemMinWidth() {
        return mItemMinWidth;
    }

    public HeaderBarConfig itemMinWidth(int itemMinWidth) {
        HeaderBarConfig.mItemMinWidth = itemMinWidth;
        return this;
    }

    public static Drawable tabBottomBackgroundDrawable() {
        return mTabBottomBackgroundDrawable;
    }

    public HeaderBarConfig tabBottomBackgroundDrawable(Drawable tabBottomBackgroundDrawable) {
        HeaderBarConfig.mTabBottomBackgroundDrawable = tabBottomBackgroundDrawable;
        return this;
    }

    public static Drawable popupBackgroundDrawable() {
        return mPopupBackgroundDrawable;
    }

    public HeaderBarConfig popupBackgroundDrawable(Drawable popupBackgroundDrawable) {
        HeaderBarConfig.mPopupBackgroundDrawable = popupBackgroundDrawable;
        return this;
    }

    public static int popupItemTextColor() {
        return mPopupItemTextColor;
    }

    public HeaderBarConfig popupItemTextColor(int popupItemTextColor) {
        HeaderBarConfig.mPopupItemTextColor = popupItemTextColor;
        return this;
    }

    public static int popupItemTextSize() {
        return mPopupItemTextSize;
    }

    public HeaderBarConfig popupItemTextSize(int popupItemTextSize) {
        HeaderBarConfig.mPopupItemTextSize = popupItemTextSize;
        return this;
    }

    public static int popupItemTextGravity() {
        return mPopupItemTextGravity;
    }

    public HeaderBarConfig popupItemTextGravity(int popupItemTextGravity) {
        HeaderBarConfig.mPopupItemTextGravity = popupItemTextGravity;
        return this;
    }

    public HeaderBarConfig popupItemTextPadding(int left, int top, int right, int bottom) {
        HeaderBarConfig.mPopupItemTextPaddingLeft = left;
        HeaderBarConfig.mPopupItemTextPaddingTop = top;
        HeaderBarConfig.mPopupItemTextPaddingRight = right;
        HeaderBarConfig.mPopupItemTextPaddingBottom = bottom;

        return this;
    }

    public static int popupItemTextPaddingLeft() {
        return mPopupItemTextPaddingLeft;
    }

    public HeaderBarConfig popupItemTextPaddingLeft(int popupItemTextPaddingLeft) {
        HeaderBarConfig.mPopupItemTextPaddingLeft = popupItemTextPaddingLeft;
        return this;
    }

    public static int popupItemTextPaddingTop() {
        return mPopupItemTextPaddingTop;
    }

    public HeaderBarConfig popupItemTextPaddingTop(int popupItemTextPaddingTop) {
        HeaderBarConfig.mPopupItemTextPaddingTop = popupItemTextPaddingTop;
        return this;
    }

    public static int popupItemTextPaddingRight() {
        return mPopupItemTextPaddingRight;
    }

    public HeaderBarConfig popupItemTextPaddingRight(int popupItemTextPaddingRight) {
        HeaderBarConfig.mPopupItemTextPaddingRight = popupItemTextPaddingRight;
        return this;
    }

    public static int popupItemTextPaddingBottom() {
        return mPopupItemTextPaddingBottom;
    }

    public HeaderBarConfig popupItemTextPaddingBottom(int popupItemTextPaddingBottom) {
        HeaderBarConfig.mPopupItemTextPaddingBottom = popupItemTextPaddingBottom;
        return this;
    }

    public void build() {
        // check config
    }
}