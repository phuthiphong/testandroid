package oattarain.s.phuthiphong.epsontraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        //Creat Listview
        createListView();


    } //Main Method

    private void createListView() {

        //Setup Source of Image
        final int[] iconInts = new int[20];
        iconInts[0] = R.drawable.ramen_01;
        iconInts[1] = R.drawable.ramen_02;
        iconInts[2] = R.drawable.ramen_03;
        iconInts[3] = R.drawable.ramen_04;
        iconInts[4] = R.drawable.ramen_05;
        iconInts[5] = R.drawable.ramen_06;
        iconInts[6] = R.drawable.ramen_07;
        iconInts[7] = R.drawable.ramen_08;
        iconInts[8] = R.drawable.ramen_09;
        iconInts[9] = R.drawable.ramen_10;
        iconInts[10] = R.drawable.ramen_11;
        iconInts[11] = R.drawable.ramen_12;
        iconInts[12] = R.drawable.ramen_13;
        iconInts[13] = R.drawable.ramen_14;
        iconInts[14] = R.drawable.ramen_15;
        iconInts[15] = R.drawable.ramen_16;
        iconInts[16] = R.drawable.ramen_17;
        iconInts[17] = R.drawable.ramen_18;
        iconInts[18] = R.drawable.ramen_19;
        iconInts[19] = R.drawable.ramen_20;

        final String[] title1Strings = getResources().getStringArray(R.array.title1);

        String[] title2Strings = getResources().getStringArray(R.array.title2);

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, iconInts, title1Strings, title2Strings);

        foodListView.setAdapter(objMyAdapter);

        //Active When Click
        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
                objIntent.putExtra("Title", title1Strings[i]);
                objIntent.putExtra("Image", iconInts[i]);
                objIntent.putExtra("Index", i);
                startActivity(objIntent);

            }
        });


    }

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonMediaplayer = MediaPlayer.create(getBaseContext(), R.raw.bee);
                buttonMediaplayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://www.youtube.com/watch?v=vVIA1ISs6M4"));
                startActivity(objIntent);

            }   //event
        });

    }

    private void bindWidget() {

        foodListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }
} //Main Class
