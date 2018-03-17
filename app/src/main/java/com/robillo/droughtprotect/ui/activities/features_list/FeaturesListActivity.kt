package com.robillo.droughtprotect.ui.activities.features_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import butterknife.ButterKnife
import com.robillo.droughtprotect.R

class FeaturesListActivity : AppCompatActivity(), FeaturesListMvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_features_list)

        setup()
    }

    override fun setup() {
        ButterKnife.bind(this)
    }
}
