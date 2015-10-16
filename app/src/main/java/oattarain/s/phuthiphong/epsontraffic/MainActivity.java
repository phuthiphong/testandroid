package oattarain.s.phuthiphong.epsontraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    } //Main Method

    private void bindWidget() {

        foodListView = (ListView)findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }
} //Main Class
