package my.edu.utar.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import my.edu.utar.assignment2.fragments.Search;

public class MainActivity extends AppCompatActivity implements Search.OnDataPass {
    ViewPagerAdapter pagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public static String USER_ID;
    public static boolean IS_SEARCHED_USER = false;

    @Override
    public void onChange(String uid) {
        USER_ID = uid;
        IS_SEARCHED_USER = true;
        viewPager.setCurrentItem(4);
    }

    @Override
    public void onBackPressed(){
        if (viewPager.getCurrentItem() == 4) {
            viewPager.setCurrentItem(0);
            IS_SEARCHED_USER = false;
        }
        else
            super.onBackPressed();
    }
}