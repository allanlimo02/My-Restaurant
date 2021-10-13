package com.moringaschool.myresturant;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import android.widget.TextView;

import com.moringaschool.myresturant.model.MainActivity;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
    @RunWith(RobolectricTestRunner.class)
    public class MainActivityTest {
        private MainActivity activity;
        @Before
        public void setUp() throws Exception {
            activity = Robolectric.buildActivity(MainActivity.class)
                    .create()
                    .resume()
                    .get();
        }
        public void validateTextViewContent(){
            TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
            assertEquals("MyRestaurants", appNameTextView.getText().toString());
        }

    }

