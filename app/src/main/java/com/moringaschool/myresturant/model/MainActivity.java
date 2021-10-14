package com.moringaschool.myresturant.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
//import android.widget.EditText;

import com.moringaschool.myresturant.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.mLocationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    private static final String TAG = RestaurantListActivity.class.getSimpleName();
//    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        mLocationEditText = (EditText) findViewById(R.id.mLocationEditText);
//        mFindRestaurantsButton = (Button)findViewById(R.id.findRestaurantsButton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Log.d(TAG, location);
                Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
                startActivity(intent);
                intent.putExtra("location", location);
                startActivity(intent);

            }

            //preparing java code to handle user input from locationInput

    });
    }
}