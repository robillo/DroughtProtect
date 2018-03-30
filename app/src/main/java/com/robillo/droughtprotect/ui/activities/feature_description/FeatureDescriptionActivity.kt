package com.robillo.droughtprotect.ui.activities.feature_description

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.robillo.droughtprotect.R
import com.robillo.droughtprotect.helper.AppConstants
import com.robillo.droughtprotect.ui.activities.BaseActivity
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation

class FeatureDescriptionActivity : BaseActivity(), FeatureDescriptionMvpView {

    lateinit var heading : TextView

    lateinit var description : TextView

    lateinit var backgroundImage : ImageView

    lateinit var headerText : String
    lateinit var descriptionText : String
    lateinit var urlText : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_description)

        setup()
    }

    override fun setup() {
        heading = findViewById(R.id.heading)
        description = findViewById(R.id.description)
        backgroundImage = findViewById(R.id.background_image)

        headerText = intent.getStringExtra(AppConstants.EXTRA_FEATURE_NAME)
        descriptionText = intent.getStringExtra(AppConstants.EXTRA_FEATURE_DESCRIPTION)
        urlText = intent.getStringExtra(AppConstants.EXTRA_FEATURE_URL)

        heading.text = headerText
        description.text = descriptionText

        Glide.with(this)
                .load(urlText)
                .apply(RequestOptions.bitmapTransform(BrightnessFilterTransformation(-0.2f)))
                .into(backgroundImage)
    }
}
