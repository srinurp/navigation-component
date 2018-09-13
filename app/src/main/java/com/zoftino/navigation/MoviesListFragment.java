package com.zoftino.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;

public class MoviesListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.movie_list,
                container, false);

        ((Button)view.findViewById(R.id.movie_details_b)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("movieId", "DBS183");
                Navigation.findNavController(view).navigate(R.id.action_movies_details, bundle);
            }
        });
        return view;
    }
}
