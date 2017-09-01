package com.kson.horizontaltabhost.utils;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2017/08/18
 * Description:
 */
public class AppUtils {

    /**
     * 获取屏幕宽度
     * @return
     */
    public static int getScreenWidth(Context context){
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int w_screen = dm.widthPixels;
        return w_screen;

    }

    /**
     * 获取屏幕高度
     * @return
     */
    public static int getScreenHeight(Context context){
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int h_screen = dm.heightPixels;
        return h_screen;

    }
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context,float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context,float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
