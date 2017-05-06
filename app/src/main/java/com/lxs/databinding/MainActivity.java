package com.lxs.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxs.databinding.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void removeFindViewById(View view) {
        startActivity(new Intent(getApplicationContext(), RemoveFindViewByIdActivity.class));
    }

    public void uiBinding(View view) {
        startActivity(new Intent(getApplicationContext(), UIBindingActivity.class));
    }

    public void eventBinding(View view) {
        startActivity(new Intent(getApplicationContext(), EventBindingActivity.class));
    }

    public void include(View view) {
        startActivity(new Intent(getApplicationContext(), IncludeActivity.class));
    }

    public void observable(View view) {
        startActivity(new Intent(getApplicationContext(), ObservableActivity.class));
    }

    public void imageView(View view) {
        startActivity(new Intent(getApplicationContext(), ImageViewActivity.class));
    }

    public void recyclerView(View view) {
        startActivity(new Intent(getApplicationContext(), RecyclerViewActivity.class));
    }

}
