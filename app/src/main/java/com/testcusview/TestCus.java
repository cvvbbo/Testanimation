package com.testcusview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class TestCus extends View {


    private String mTitleText;


    int lastX ;
    int lastY ;

    /**
     * 文本的颜色
     */
    private int mTitleTextColor;


    private Paint paint;
    private Rect rect;

    public TestCus(Context context) {
        this(context, null);
    }

    public TestCus(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TestCus(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.TestCus, defStyleAttr, 0);
        for (int i = 0; i < typedArray.length(); i++) {
            switch (typedArray.getIndex(i)) {

                case R.styleable.TestCus_textstring:

                    mTitleText = typedArray.getString(typedArray.getIndex(i));

                    break;
                case R.styleable.TestCus_textcolor:
                    mTitleTextColor = typedArray.getColor(typedArray.getIndex(i), Color.BLACK);
                    break;
            }
        }

        paint = new Paint();
        paint.setTextSize(67);


        rect = new Rect();


        // paint.getTextBounds(mTitleText, 0, mTitleText.length(), rect);


        typedArray.recycle();


    }


    // clip 剪辑

    //  Rect 矩形


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.GREEN);
        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), paint);
        paint.setColor(Color.WHITE);
//        canvas.drawText(mTitleText, getWidth() / 2 - rect.width() / 2, getHeight() / 2 + rect.height() / 2, paint);

       // canvas.drawText(mTitleText, getWidth() / 2, getHeight() / 2, paint);

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

//        int width =0;
//        int height =0;
//
//        int widthmode = MeasureSpec.getMode(widthMeasureSpec);
//        int heightmode = MeasureSpec.getMode(heightMeasureSpec);
//        if (widthmode == MeasureSpec.EXACTLY) {
//            paint.getTextBounds(mTitleText, 0, mTitleText.length(), rect);
//            int recwidth = rect.width();
//            width = (getPaddingLeft() + getPaddingRight() +recwidth);
//        }
//
//        if (heightmode == MeasureSpec.EXACTLY){
//            paint.getTextBounds(mTitleText, 0, mTitleText.length(), rect);
//            int recheight = rect.height();
//            height = getPaddingTop() + getPaddingBottom()+ recheight;
//        }
//
//        setMeasuredDimension(width,height);


    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int y = (int) event.getY();
        int x = (int) event.getX();
        LogUtil.e("x的坐标是-->"+x+"--->y的坐标是-->"+y);

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                lastX = (int) x;
                lastY = (int) y;
                break;
            case MotionEvent.ACTION_MOVE:
                int offsetX = x - lastX;
                int offsetY = y - lastY;

                layout(getLeft() + offsetX,getTop() + offsetY ,getRight() + offsetX,getBottom()+offsetX);
                break;
        }
//        return true;

        return super.onTouchEvent(event);

    }



}
