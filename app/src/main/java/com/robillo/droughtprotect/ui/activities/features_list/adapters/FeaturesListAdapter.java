package com.robillo.droughtprotect.ui.activities.features_list.adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.robillo.droughtprotect.R;
import com.robillo.droughtprotect.helper.AppConstants;
import com.robillo.droughtprotect.model.Feature;
import com.robillo.droughtprotect.ui.activities.feature_description.FeatureDescriptionActivity;
import com.robillo.droughtprotect.ui.activities.features_list.FeaturesListActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FeaturesListAdapter extends RecyclerView.Adapter<FeaturesListAdapter.FeaturesHolder> {

    private Context context;
    private List<Feature> features;
    private List<Intent> intents;

    public FeaturesListAdapter(Context context, List<Feature> features, List<Intent> intents) {
        this.context = context;
        this.features = features;
        this.intents = intents;
    }

    @NonNull
    @Override
    public FeaturesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FeaturesHolder(
                LayoutInflater.from(parent.getContext()).
                        inflate(R.layout.row_feature_list_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturesHolder holder, final int position) {
        holder.text.setText(features.get(position).getFeature());
        //noinspection UnnecessaryLocalVariable
        final int pos = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                context.startActivity(intents.get(pos));
            }
        });

        holder.infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FeatureDescriptionActivity.class);
                intent.putExtra(AppConstants.EXTRA_FEATURE_NAME, features.get(pos).getFeature());
                intent.putExtra(AppConstants.EXTRA_FEATURE_DESCRIPTION, features.get(pos).getDescription());
                intent.putExtra(AppConstants.EXTRA_FEATURE_URL, features.get(pos).getImageUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return features.size();
    }

    class FeaturesHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.text)
        TextView text;

        @BindView(R.id.info)
        ImageButton infoButton;

        FeaturesHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
