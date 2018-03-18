package com.robillo.droughtprotect.ui.activities.features_list

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import butterknife.ButterKnife
import com.robillo.droughtprotect.R
import com.robillo.droughtprotect.model.Feature
import com.robillo.droughtprotect.ui.activities.BaseActivity
import com.robillo.droughtprotect.ui.activities.features_list.adapters.FeaturesListAdapter
import kotlinx.android.synthetic.main.activity_features_list.*

class FeaturesListActivity : BaseActivity(), FeaturesListMvpView {

    lateinit var featuresAdapter : FeaturesListAdapter
    lateinit var featuresList : MutableList<Feature>
    lateinit var intentsList : MutableList<Intent>
    lateinit var arrayFeatures : Array<String>
    lateinit var arrayDescriptions : Array<String>
    lateinit var arrayUrls : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_features_list)

        setup()
    }

    override fun setup() {
        ButterKnife.bind(this)

        arrayFeatures = resources.getStringArray(R.array.feature_headers)
        arrayDescriptions = resources.getStringArray(R.array.feature_descriptions)
        arrayUrls = resources.getStringArray(R.array.array_urls)

        inflateListFeatures()
        inflateListIntents()

        recycler_view.layoutManager = LinearLayoutManager(this)
        featuresAdapter = FeaturesListAdapter(this, featuresList, intentsList)
        recycler_view.adapter = featuresAdapter
    }

    override fun inflateListIntents() {
        intentsList = ArrayList()

        for (i in arrayFeatures.indices) {
//            intentsList.add(Intent(null))
        }
    }

    override fun inflateListFeatures() {
        featuresList = ArrayList()

        for (i in arrayFeatures.indices) {
            featuresList.add(Feature(arrayFeatures.get(i), arrayDescriptions.get(i), arrayUrls.get(i)))
        }
    }
}
