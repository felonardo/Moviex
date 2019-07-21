package com.example.moviex2;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.moviex2.Fragment.MovieFragment;
import com.example.moviex2.Fragment.TvShowFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

            private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                    = new BottomNavigationView.OnNavigationItemSelectedListener() {

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentManager mfragmentManager = getSupportFragmentManager();

            switch (item.getItemId()) {

                case R.id.navigation_movies:

                    if (mfragmentManager != null) {
                        MovieFragment movieFragment = new MovieFragment();
                        FragmentTransaction mFragmentTransaction = mfragmentManager.beginTransaction();
                        mFragmentTransaction.setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right);
                        mFragmentTransaction.replace(R.id.frame_container, movieFragment, MovieFragment.class.getSimpleName());
                        mFragmentTransaction.commit();
                    }
                    return true;

                case R.id.navigation_tvshow:
                    if (mfragmentManager != null) {
                        TvShowFragment tvShowFragment = new TvShowFragment();
                        FragmentTransaction mFragmentTransaction = mfragmentManager.beginTransaction();
                        mFragmentTransaction.setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left);
                        mFragmentTransaction.replace(R.id.frame_container, tvShowFragment, TvShowFragment.class.getSimpleName());
                        mFragmentTransaction.commit();
                    }
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        MovieFragment movieFragment = new MovieFragment();


        Fragment fragment = mFragmentManager.findFragmentByTag(MovieFragment.class.getSimpleName());

        if (!(fragment instanceof MovieFragment)) {
            mFragmentTransaction.add(R.id.frame_container, movieFragment, MovieFragment.class.getSimpleName());
            Log.d("MyFlexibleFragment", "Fragment Name :" + MovieFragment.class.getSimpleName());
            mFragmentTransaction.commit();
        }

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        if (savedInstanceState == null) {
            navigation.setSelectedItemId(R.id.navigation_movies);
        }

        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.ab_gradient));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_change_settings){
            Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mIntent);
        }
        return super.onOptionsItemSelected(item);
    }

}
