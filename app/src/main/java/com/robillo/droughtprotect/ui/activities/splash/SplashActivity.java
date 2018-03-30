package com.robillo.droughtprotect.ui.activities.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.robillo.droughtprotect.R;
import com.robillo.droughtprotect.ui.activities.BaseActivity;
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation;
import com.robillo.droughtprotect.ui.activities.login_register.LoginRegisterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    Animation topDown, bottomUp;

    @BindView(R.id.upper)
    TextView mUpper;

    @BindView(R.id.lower)
    TextView mLower;

    @BindView(R.id.ll_one)
    LinearLayout mViewOne;

    @BindView(R.id.ll_two)
    LinearLayout mViewTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setUp();
    }

    @Override
    public void setUp() {
        ButterKnife.bind(this);

//        Glide.with(this).load(getResources().getDrawable(R.drawable.abcd))
//                .apply(RequestOptions.bitmapTransform(new BrightnessFilterTransformation(-0.2f)))
//                .into((ImageView) findViewById(R.id.abcd));

        startCountDown();

        topDown = AnimationUtils.loadAnimation(this, R.anim.top_down);
        bottomUp = AnimationUtils.loadAnimation(this, R.anim.bottom_up);
        mViewOne.startAnimation(topDown);
        mViewTwo.startAnimation(bottomUp);
    }

    public void startCountDown() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginRegisterActivity.class));
            }
        }, 2000);
    }
}
