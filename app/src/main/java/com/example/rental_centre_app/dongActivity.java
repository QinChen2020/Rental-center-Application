package com.example.rental_centre_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.os.Bundle;


public class dongActivity extends AppCompatActivity {

    private ImageView welcomeImg = null;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dong);

        ActionBar actionBar = getSupportActionBar();//消除APP该Activity界面标题栏

        if(actionBar!=null){ //消除APP该Activity界面标题栏

            actionBar.hide();

        }

        welcomeImg = (ImageView) findViewById(R.id.wrap);

        AlphaAnimation anima = new AlphaAnimation(0.3f, 1.0f);

        anima.setDuration(3000);// 设置简单动画的显示时间

        welcomeImg.startAnimation(anima);

        anima.setAnimationListener(new AnimationImpl());

    }

    private class AnimationImpl implements AnimationListener {
        @Override

        public void onAnimationStart(Animation animation) {
            welcomeImg.setBackgroundResource(R.mipmap.yw);

        }

        @Override

        public void onAnimationEnd(Animation animation) {
            skip(); // 动画结束后跳转到别的页面

        }

        @Override

        public void onAnimationRepeat(Animation animation) {
        }

    }

    private void skip() {
        startActivity(new Intent(this, MainPageActivity.class));//动画开屏后返回APP主界面

        finish();

    }

}