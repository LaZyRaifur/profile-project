package com.raifurrahim.cvformat;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String []circle = {"facebook","github","twitter","Linkedin","pinterest","wordpress"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = findViewById(R.id.circleMenu);

        circleMenu.setMainMenu(Color.parseColor("#ff5436"),R.drawable.image,R.drawable.close)
                .addSubMenu(Color.parseColor("#8c9cff"),R.drawable.facebook)
                .addSubMenu(Color.parseColor("#b5ff6b"),R.drawable.github)
                .addSubMenu(Color.parseColor("#51d3ff"),R.drawable.twitter)
                .addSubMenu(Color.parseColor("#ffaad9"),R.drawable.linkedin)
                .addSubMenu(Color.parseColor("#d4ffff"),R.drawable.pinterest)
                .addSubMenu(Color.YELLOW,R.drawable.wordpress)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {

                        switch (i){

                            case 0:
                            Intent Fbintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/raifur.rahim.31"));
                            startActivity(Fbintent);
                            break;
                            case 1:
                                Intent Gitintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/LaZyRaifur"));
                                startActivity(Gitintent);
                                break;
                            case 2:
                                Intent Twitter_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/lazy_raifur"));
                                startActivity(Twitter_intent);
                                break;
                            case 3:
                                Intent Linkedin_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/raifur-rahim-15b486133/"));
                                startActivity(Linkedin_intent);
                                break;
                            case 4:
                                Intent Pinterest_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pinterest.com/raifurrahim31/"));
                                startActivity(Pinterest_intent);
                                break;
                            case 5:
                                Intent Blog_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lazycoders2017.wordpress.com/blog-2/"));
                                startActivity(Blog_intent);
                                break;
                        }
                        //Toast.makeText(MainActivity.this, "You have selected"+circle[i], Toast.LENGTH_SHORT).show();
                    }
                });

    }

    @Override
    public void onBackPressed() {
        new android.app.AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure want to quite?")
                .setNegativeButton("No",null)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
    }
}
