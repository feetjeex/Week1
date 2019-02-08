package com.example.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    // Declaring the variables that contain the actual images of body parts
    ImageView imagemouth;
    ImageView imagehat;
    ImageView imageeyes;
    ImageView imagemoustache;
    ImageView imageglasses;
    ImageView imageeyebrows;
    ImageView imageshoes;
    ImageView imagearms;
    ImageView imageears;
    ImageView imagenose;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // call the super class onCreate to complete the creation of activity like
        // the view hierarchy
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize members of body parts so we can manipulate them later
        imagemouth = (ImageView) findViewById(R.id.ImageMouth);
        imagehat = (ImageView) findViewById(R.id.ImageHat);
        imageeyes = (ImageView) findViewById(R.id.ImageEyes);
        imagemoustache = (ImageView) findViewById(R.id.ImageMoustache);
        imageglasses = (ImageView) findViewById(R.id.ImageGlasses);
        imageeyebrows = (ImageView) findViewById(R.id.ImageEyebrows);
        imageshoes = (ImageView) findViewById(R.id.ImageShoes);
        imagearms = (ImageView) findViewById(R.id.ImageArms);
        imageears = (ImageView) findViewById(R.id.ImageEars);
        imagenose = (ImageView) findViewById(R.id.ImageNose);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        // Saves the state of the image (Visible/Invisible) to the image as a keypair
        super.onSaveInstanceState(outState);
        outState.putInt("ImageMouth", imagemouth.getVisibility());
        outState.putInt("ImageHat", imagehat.getVisibility());
        outState.putInt("ImageEyes", imageeyes.getVisibility());
        outState.putInt("ImageMoustache", imagemoustache.getVisibility());
        outState.putInt("ImageGlasses", imageglasses.getVisibility());
        outState.putInt("ImageEyebrows", imageeyebrows.getVisibility());
        outState.putInt("ImageShoes", imageshoes.getVisibility());
        outState.putInt("ImageArms", imagearms.getVisibility());
        outState.putInt("ImageEars", imageears.getVisibility());
        outState.putInt("ImageNose", imagenose.getVisibility());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        // Sets the visibility of the image (Visible/Invisible) on restoring the instance using the key pair
        super.onRestoreInstanceState(savedInstanceState);
        imagemouth.setVisibility(savedInstanceState.getInt("ImageMouth"));
        imagehat.setVisibility(savedInstanceState.getInt("ImageHat"));
        imageeyes.setVisibility(savedInstanceState.getInt("ImageEyes"));
        imagemoustache.setVisibility(savedInstanceState.getInt("ImageMoustache"));
        imageglasses.setVisibility(savedInstanceState.getInt("ImageGlasses"));
        imageeyebrows.setVisibility(savedInstanceState.getInt("ImageEyebrows"));
        imageshoes.setVisibility(savedInstanceState.getInt("ImageShoes"));
        imagearms.setVisibility(savedInstanceState.getInt("ImageArms"));
        imageears.setVisibility(savedInstanceState.getInt("ImageEars"));
        imagenose.setVisibility(savedInstanceState.getInt("ImageNose"));
    }

    // To check if the checkboxes work
    public void checksClicked (View v) {
        Log.d(TAG, "checkClicked: ");
    }

    // Method to check if the checkbox is checked
    public void checkClicked(View view) {
        // Has the view been checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Which checkbox has been checked?
        switch(view.getId()) {
            case R.id.mouth:
                if (checked) {
                    imagemouth.setVisibility(View.VISIBLE);
                }
                else {
                    imagemouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hat:
                if (checked) {
                    imagehat.setVisibility(View.VISIBLE);
                }
                else {
                    imagehat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyes:
                if (checked) {
                    imageeyes.setVisibility(View.VISIBLE);
                }
                else {
                    imageeyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.moustache:
                if (checked) {
                    imagemoustache.setVisibility(View.VISIBLE);
                }
                else {
                    imagemoustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glasses:
                if (checked) {
                    imageglasses.setVisibility(View.VISIBLE);
                }
                else {
                    imageglasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrows:
                if (checked) {
                    imageeyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    imageeyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoes:
                if (checked) {
                    imageshoes.setVisibility(View.VISIBLE);
                }
                else {
                    imageshoes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.arms:
                if (checked) {
                    imagearms.setVisibility(View.VISIBLE);
                }
                else {
                    imagearms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.ears:
                if (checked) {
                    imageears.setVisibility(View.VISIBLE);
                }
                else {
                    imageears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.nose:
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
