package com.aisoftdev.rasulersunnat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    Button button, moreApps, rating;
    AdView madView;
    ImageView imageView, share, info, facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        madView = findViewById(R.id.splash_ad);
        button = findViewById(R.id.button_main);
        rating = findViewById(R.id.rating);
        imageView = findViewById(R.id.imageView);
        moreApps = findViewById(R.id.moreApps);
        share = findViewById(R.id.shareApp);
        info = findViewById(R.id.info);
        facebook = findViewById(R.id.facebook);


        AdRequest adRequest = new AdRequest.Builder().build();
        madView.loadAd(adRequest);


        madView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                imageView.setVisibility(View.GONE);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SunnatActivity.class);
                startActivity(intent);
            }
        });

        moreApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Ai Soft Dev")));
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=Ai Soft Dev")));
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
                    String msg = "Download this application flow this link ";
                    msg = msg + "https.google.com/store/apps/details?id=" + getPackageName();
                    i.putExtra(Intent.EXTRA_TEXT, msg);
                    startActivity(Intent.createChooser(i, "Choose One"));

                } catch (Exception e) {
                    // Toast.makeText(this,"Share Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("market://details?id=" + getPackageName()));
                startActivity(i);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setContentView(R.layout.dialog_discalimar);
                dialog.show();
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }


        });


    }

    private void showAlertDialog() {
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.facebook);

        dialog.setCanceledOnTouchOutside(true);

        Button fbPage = dialog.findViewById(R.id.fbPage);
        Button email = dialog.findViewById(R.id.email);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(Intent.ACTION_SEND);
                ii.setData(Uri.parse("email"));
                String[] s = {"mmm.rahman77@gmail.com"};
                ii.putExtra(Intent.EXTRA_EMAIL, s);
                ii.putExtra(Intent.EXTRA_SUBJECT, "এই মেইলটি পাঠানো হয়েছে বাংলা ম্যাসেজ এপ থেকে");
                ii.putExtra(Intent.EXTRA_TEXT, "বিস্তারিত মতামত লিখুন");
                ii.setType("message/rfc822");
                Intent chooser = Intent.createChooser(ii, "পছন্দ করুন");
                startActivity(chooser);
            }
        });

        fbPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/AI_Abdur_Rahman"));
                startActivity(intent);
            }
        });


        dialog.show();


    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(getString(R.string.app_name));
        builder.setMessage("আপনি এপ্লিকেশন থেকে বের হয়ে যেতে চান ?");
        builder.setIcon(getDrawable(R.drawable.icon));
        builder.setCancelable(true);
        builder.setNegativeButton("হ্যা", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setPositiveButton("না", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}