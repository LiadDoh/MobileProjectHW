package com.example.hw1.helpers;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Base_Activity extends AppCompatActivity {

    public ImageView main_IMG_player_card1;
    public ImageView main_IMG_player_card2;
    public TextView main_LBL_score1;
    public TextView main_LBL_score2;
    public ProgressBar main_BAR_progress;
    public MediaPlayer claps;
    public MediaPlayer triumphal;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
