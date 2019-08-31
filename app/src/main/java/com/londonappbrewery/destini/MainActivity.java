package com.londonappbrewery.destini;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mRedButton ;
    Button mBlueButton ;
    Button mPurpleButton;
    TextView mStoryText ;
    int mStoryIndex = 1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mRedButton = findViewById(R.id.buttonTop) ;
        mBlueButton = findViewById(R.id.buttonBottom) ;
        mPurpleButton = findViewById(R.id.buttonTopMost) ;
        mPurpleButton.setText(R.string.Restart);
        mPurpleButton.setVisibility(View.GONE);
        mStoryText = findViewById(R.id.storyTextView) ;
        mStoryText.setText(getString(R.string.T1_Story)) ;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destini", "The Red button has been pressed") ;
                furtherRedAdventure();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destini", "The Blue button has been pressed") ;
                furtherBlueAdventure() ;
            }
        });

        // TODO: Set listener on Restart button:

        mPurpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destini", "The story has been reset") ;
                restartStory();
            }
        });


    }

    private void furtherRedAdventure() {
        if(mStoryIndex == 1) {
            mRedButton.setText(R.string.T3_Ans1);
            mBlueButton.setText(R.string.T3_Ans2);
            mStoryText.setText(R.string.T3_Story);
            mStoryIndex = 3 ;
        }
        else if(mStoryIndex == 2) {
            mRedButton.setText(R.string.T3_Ans1) ;
            mBlueButton.setText(R.string.T3_Ans2) ;
            mStoryText.setText(R.string.T3_Story) ;
            mStoryIndex = 3 ;
        }
        else if(mStoryIndex == 3) {
            mRedButton.setVisibility(View.GONE);
            mBlueButton.setVisibility(View.GONE);
            mStoryText.setText(R.string.T6_End);
            mStoryIndex = 6 ;
        }

        if (mStoryIndex == 4){
            mPurpleButton.setVisibility(View.VISIBLE);
        }
        if (mStoryIndex == 5){
            mPurpleButton.setVisibility(View.VISIBLE);
        }
        if (mStoryIndex == 6){
            mPurpleButton.setVisibility(View.VISIBLE);
        }
    }
    private  void furtherBlueAdventure() {
        if(mStoryIndex ==1) {
            mRedButton.setText(R.string.T2_Ans1) ;
            mBlueButton.setText(R.string.T2_Ans2) ;
            mStoryText.setText(R.string.T2_Story) ;
            mStoryIndex = 2 ;
        }
        else if(mStoryIndex == 2) {
            mRedButton.setVisibility(View.GONE) ;
            mBlueButton.setVisibility(View.GONE) ;
            mStoryText.setText(R.string.T4_End) ;
            mStoryIndex = 4 ;
        }
        else if(mStoryIndex == 3) {
            mRedButton.setVisibility(View.GONE) ;
            mBlueButton.setVisibility(View.GONE);
            mStoryText.setText(R.string.T5_End);
            mStoryIndex = 5 ;
        }
        if (mStoryIndex == 4){
            mPurpleButton.setVisibility(View.VISIBLE);
        }
        if (mStoryIndex == 5){
            mPurpleButton.setVisibility(View.VISIBLE);
        }
        if (mStoryIndex == 6){
            mPurpleButton.setVisibility(View.VISIBLE);
        }

    }

    private void restartStory() {
        mRedButton.setText(R.string.T1_Ans1) ;
        mRedButton.setVisibility(View.VISIBLE);
        mBlueButton.setText(R.string.T1_Ans2);
        mBlueButton.setVisibility(View.VISIBLE);
        mPurpleButton.setVisibility(View.GONE);
        mStoryText.setText(R.string.T1_Story) ;
        mStoryIndex = 1;
    }
}
