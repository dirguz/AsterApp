package com.example.asterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.UserViewHolder> {
    private List<Post> posts;
    public PostAdapter(List<Post> posts) {
        this.posts = posts;
    }
        @NonNull
        @Override
        public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)  {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.activity_main2, parent, false);
            return new UserViewHolder(itemView);
            }

            @Override
            public void onBindViewHolder(@NonNull UserViewHolder holder, int position){
                Post post = posts.get(position);
                holder.tvName.setText(post.getName());
                holder.tvAbsolute_magnitude_h.setText(post.getAbsolute_magnitude_h());
                holder.tvIs_potentially_hazardous_asteroid.setText(post.getIs_potentially_hazardous_asteroid());
                holder.tvOrbiting_body.setText(post.getOrbiting_body());
                holder.tvIs_sentry_object.setText(post.getIs_sentry_object());
            }

            @Override
            public int getItemCount() {
                return posts.size();
            }
            public static class UserViewHolder extends RecyclerView.ViewHolder {
                public TextView tvName;
                public TextView tvAbsolute_magnitude_h;
                public TextView tvIs_potentially_hazardous_asteroid;
                public TextView tvOrbiting_body;
                public TextView tvIs_sentry_object;

            public UserViewHolder(@NonNull View itemView) {
                    super(itemView);
                    TextView tvName = itemView.findViewById(R.id.tvName);
                    TextView tvAbsolute_magnitude_h = itemView.findViewById(R.id.tvMag);
                    TextView tvIs_potentially_hazardous_asteroid = itemView.findViewById(R.id.tvHazard);
                    TextView tvOrbiting_body = itemView.findViewById(R.id.tvOrbit);
                    TextView tvIs_sentry_object = itemView.findViewById(R.id.tvSentry);
                }
            }
}

