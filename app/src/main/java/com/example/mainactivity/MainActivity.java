package com.example.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void checksClicked (View v) {
        Log.d(TAG, "checkClicked: ");
    }

    public void checkClicked(View view) {
        // is de view nu gechecked?
        boolean checked = ((CheckBox) view).isChecked();

        // Welke chceckbox is gelklikt
        switch(view.getId()) {
            case R.id.mouth:
                ImageView imagemouth = (ImageView) findViewById(R.id.ImageMouth);
                if (checked) {
                    imagemouth.setVisibility(View.VISIBLE);
                }
                else {
                    imagemouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hat:
                ImageView imagehat = (ImageView) findViewById(R.id.ImageHat);
                if (checked) {
                    imagehat.setVisibility(View.VISIBLE);
                }
                else {
                    imagehat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyes:
                ImageView imageeyes = (ImageView) findViewById(R.id.ImageEyes);
                if (checked) {
                    imageeyes.setVisibility(View.VISIBLE);
                }
                else {
                    imageeyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.moustache:
                ImageView imagemoustache = (ImageView) findViewById(R.id.ImageMoustache);
                if (checked) {
                    imagemoustache.setVisibility(View.VISIBLE);
                }
                else {
                    imagemoustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glasses:
                ImageView imageglasses = (ImageView) findViewById(R.id.ImageGlasses);
                if (checked) {
                    imageglasses.setVisibility(View.VISIBLE);
                }
                else {
                    imageglasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrows:
                ImageView imageeyebrows = (ImageView) findViewById(R.id.ImageEyebrows);
                if (checked) {
                    imageeyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    imageeyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoes:
                ImageView imageshoes = (ImageView) findViewById(R.id.ImageShoes);
                if (checked) {
                    imageshoes.setVisibility(View.VISIBLE);
                }
                else {
                    imageshoes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.arms:
                ImageView imagearms = (ImageView) findViewById(R.id.ImageArms);
                if (checked) {
                    imagearms.setVisibility(View.VISIBLE);
                }
                else {
                    imagearms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.ears:
                ImageView imageears = (ImageView) findViewById(R.id.ImageEars);
                if (checked) {
                    imageears.setVisibility(View.VISIBLE);
                }
                else {
                    imageears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.nose:
                ImageView imagenose = (ImageView) findViewById(R.id.ImageNose);
                if (checked) {
                    imagenose.setVisibility(View.VISIBLE);
                }
                else {
                    imagenose.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
