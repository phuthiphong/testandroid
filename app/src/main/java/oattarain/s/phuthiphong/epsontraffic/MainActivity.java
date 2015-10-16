package oattarain.s.phuthiphong.epsontraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import static oattarain.s.phuthiphong.epsontraffic.R.id.button;
import static oattarain.s.phuthiphong.epsontraffic.R.id.listView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView foodListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();


    } //Main Method

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonMediaplayer = MediaPlayer.create(getBaseContext(),R.raw.bee);
                buttonMediaplayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://www.youtube.com/watch?v=vVIA1ISs6M4"));
                startActivity(objIntent);

            }   //event
        });

    }

    private void bindWidget() {

        foodListView = (ListView)findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }
} //Main Class
