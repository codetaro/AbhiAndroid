package com.example.dyuan.abhiandroid.Activity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.dyuan.abhiandroid.R;

public class MainActivity_VideoView extends AppCompatActivity {

    VideoView simpleVideoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_videoview);

        simpleVideoView = findViewById(R.id.simpleVideoView);
        if (mediaController == null) {
            mediaController = new MediaController(MainActivity_VideoView.this);
            mediaController.setAnchorView(simpleVideoView);
        }
        simpleVideoView.setMediaController(mediaController);
        simpleVideoView.setVideoURI(Uri.parse("http://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/04/videoviewtestingvideo.mp4"));
        simpleVideoView.start();

        simpleVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(), "Thank You...!!!", Toast.LENGTH_SHORT).show();
            }
        });
        simpleVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mediaPlayer, int what, int extra) {
                Toast.makeText(getApplicationContext(), "Oops An Error Occur While Playing Video...!!!", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
