package oattarain.s.phuthiphong.epsontraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    TextView titleTexView, detailTextView;
    ImageView foodImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Bind Widget
        bindWidget();

        //Show View
        showView();

    }   // Main Method

    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTexView.setText(strTitle);

        //Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.ramen_01);
        foodImageView.setImageResource(intImage);

        //Show Detail
        String[] detailStrings = getResources().getStringArray(R.array.detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        detailTextView.setText(detailStrings[intIndex]);

    }

    private void bindWidget() {
        titleTexView = (TextView) findViewById(R.id.txtShowTitle1);
        detailTextView = (TextView) findViewById(R.id.txtDetail);
        foodImageView = (ImageView) findViewById(R.id.imvImage);
    }


}   // Main Class
