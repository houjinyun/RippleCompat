package com.desmond.ripple;

import android.graphics.Color;
import android.graphics.Path;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

/**
 * Created by Jiayi Yao on 2015/10/30.
 */
public class RippleConfig {
    private int rippleDuration = RippleUtil.RIPPLE_DURATION;
    private int fadeDuration = RippleUtil.FADE_DURATION;
    private int rippleColor = 0xa000ff00;
    private int backgroundColor = Color.TRANSPARENT;
    private int maxRippleRadius = RippleUtil.MAX_RIPPLE_RADIUS;
    private Interpolator interpolator = new AccelerateInterpolator();
    private RippleCompatDrawable.Type type = RippleCompatDrawable.Type.CIRCLE;
    private boolean isFull = false;
    private boolean isSpin = false;

    private static RippleConfig dConfig = new RippleConfig();

    public static RippleConfig getDefaultConfig(){
        return dConfig;
    }

    public int getRippleDuration() {
        return rippleDuration;
    }

    public void setRippleDuration(int rippleDuration) {
        this.rippleDuration = rippleDuration;
    }

    public int getRippleColor() {
        return rippleColor;
    }

    public void setRippleColor(int rippleColor) {
        this.rippleColor = rippleColor;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }

    public int getMaxRippleRadius() {
        return maxRippleRadius;
    }

    public void setMaxRippleRadius(int maxRippleRadius) {
        this.maxRippleRadius = maxRippleRadius;
    }

    public int getFadeDuration() {
        return fadeDuration;
    }

    public void setFadeDuration(int fadeDuration) {
        this.fadeDuration = fadeDuration;
    }

    public Interpolator getInterpolator() {
        return interpolator;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
    }

    public void setType(RippleCompatDrawable.Type type) {
        this.type = type;
    }

    public Path getPath(){
        switch (type){

            case CIRCLE:
                return RipplePathFactory.produceCirclePath();

            case HEART:
                return RipplePathFactory.produceHeartPath();

            case TRIANGLE:
                return RipplePathFactory.produceTrianglePath();

            default:
                return RipplePathFactory.produceCirclePath();
        }
    }

    public boolean isSpin() {
        return isSpin;
    }

    public void setIsSpin(boolean isSpin) {
        this.isSpin = isSpin;
    }
}
