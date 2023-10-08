package com.example.restaurangmeny;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



//ATT GÖRA
//Fortsätt lägga in bilder till alla rätter samt ändra java koden så bilderna försvinner när man gör val
//Gör resources till alla rätter
//Gör dimensions till bilder och text
//Gör designen snyggare






public class MainActivity extends AppCompatActivity {

    Button btnFörrätter, btnVarmrätter, btnEfterrätter;
    TextView textRestaurangnamn;
    TextView[] förrättViews, varmrättViews, efterrättViews;
    TextView[] förrättsBeskrivning, varmrättsBeskrivning, efterrättBeskrivning;
    ImageView[] förättsBilder, varmrättsBilder, efterrättsBilder ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnFörrätter = findViewById(R.id.btn_förätter);
        btnVarmrätter = findViewById(R.id.btn_varmrätter);
        btnEfterrätter = findViewById(R.id.btn_efterrätter);
        textRestaurangnamn = findViewById(R.id.text_restaurangnamn);

        förrättViews = new TextView[]{findViewById(R.id.show_förätt1), findViewById(R.id.show_förätt2), findViewById(R.id.show_förätt3)};
        varmrättViews = new TextView[]{findViewById(R.id.show_varmrätt1), findViewById(R.id.show_varmrätt2), findViewById(R.id.show_varmrätt3)};
        efterrättViews = new TextView[]{findViewById(R.id.show_efterrätt1), findViewById(R.id.show_efterrätt2), findViewById(R.id.show_efterrätt3)};

        förättsBilder = new ImageView[]{findViewById(R.id.förätt1_bild), findViewById(R.id.förätt2_bild), findViewById(R.id.förätt3_bild)};
        varmrättsBilder = new ImageView[]{findViewById(R.id.varmrätt1_bild), findViewById(R.id.varmrätt2_bild), findViewById(R.id.varmrätt3_bild)};
        efterrättsBilder = new ImageView[]{findViewById(R.id.efterrätt1_bild), findViewById(R.id.efterrätt2_bild), findViewById(R.id.efterrätt3_bild)};


        förrättsBeskrivning = new TextView[]{findViewById(R.id.förätt1_beskriving), findViewById(R.id.förätt2_beskrivning), findViewById(R.id.förätt3_beskriving)};
        varmrättsBeskrivning = new TextView[]{findViewById(R.id.varmrätt1_beskrivning), findViewById(R.id.varmrätt2_beskrivning), findViewById(R.id.varmrätt3_beskrivning)};
        efterrättBeskrivning = new TextView[]{findViewById(R.id.efterrätt1_beskrivning), findViewById(R.id.efterrätt2_beskrivning), findViewById(R.id.efterrätt3_beskrivning)};








        //Gör att man inte ser alla rätter förens man klickar på knapparna
        hideViews(förrättViews);
        hideViews(varmrättViews);
        hideViews(efterrättViews);

        //Gör att man inte ser alla bilder förens man klickar på knapparna
        hideImages(förättsBilder);
        hideImages(varmrättsBilder);
        hideImages(efterrättsBilder);
       //Gör att man inte ser alla beskrivningar förens man klickar på knapparna
        hideViews(förrättsBeskrivning);
        hideViews(varmrättsBeskrivning);
        hideViews(efterrättBeskrivning);



        btnFörrätter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showViews(förrättViews);
                showViews(förrättsBeskrivning);
                showImages(förättsBilder);

                hideViews(varmrättViews);
                hideViews(efterrättViews);
                hideViews(varmrättsBeskrivning);
                hideViews(efterrättBeskrivning);
                hideImages(varmrättsBilder);
                hideImages(efterrättsBilder);

            }
        });

        btnVarmrätter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showViews(varmrättViews);
                showImages(varmrättsBilder);
                showViews(varmrättsBeskrivning);

                hideViews(förrättViews);
                hideViews(efterrättViews);
                hideViews(förrättsBeskrivning);
                hideViews(efterrättBeskrivning);
                hideImages(förättsBilder);
                hideImages(efterrättsBilder);

            }
        });

        btnEfterrätter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showViews(efterrättViews);
                showImages(efterrättsBilder);
                showViews(efterrättBeskrivning);

                hideViews(förrättViews);
                hideViews(varmrättViews);
                hideViews(förrättsBeskrivning);
                hideViews(varmrättsBeskrivning);
                hideImages(förättsBilder);
                hideImages(varmrättsBilder);
            }
        });
    }

//Metoder för att visa och gömma text
    private void showViews(TextView[] views) {
        for (TextView view : views) {
            view.setVisibility(View.VISIBLE);
        }
    }

    private void hideViews(TextView[] views) {
        for (TextView view : views) {
            view.setVisibility(View.GONE);
        }
    }


//Metoder för att visa och gömma bilder
    private void showImages(ImageView[] images) {
        for (ImageView image : images) {
            image.setVisibility(View.VISIBLE);
        }
    }

    private void hideImages(ImageView[] images) {
        for (ImageView image : images) {
            image.setVisibility(View.GONE);
        }
    }


}




