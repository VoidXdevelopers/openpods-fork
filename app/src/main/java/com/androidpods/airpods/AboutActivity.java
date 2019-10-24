package com.androidpods.airpods;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        /**
         * LEGAL DANGER ZONE!
         *
         * The following actions are a violation of the GNU GPLv3 License:
         * - Removing, hiding or altering the license or the code that displays it
         * - Removing or changing the link to the original source code or the code that displays it
         * - Removing or changing the donation link of the original project or the code that displays it
         *
         * If you're forking the application, it MUST be made clear that your version is a fork, who the original author is, and all references to the original project and license must not be removed.
         * You are free to add links to your project, whatever to this activity.
         * Also Google play removes those apps which has "Donation link", So don't add any donation button that leads to external site.
         */

        ((WebView)(findViewById(R.id.license))).loadUrl("file:///android_asset/license.html");

        ((Button)(findViewById(R.id.github))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/voidxdevelopers/openpods-fork")));
            }
        });
        ((Button)(findViewById(R.id.website))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://voidxdevelopers.github.io/site/")));
            }
        });
        ((Button)(findViewById(R.id.donate))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.androidpods.airpods")));
                Toast.makeText(AboutActivity.this, "❤️", Toast.LENGTH_SHORT).show();
            }
        });

        //END OF LEGAL DANGER ZONE
    }
}
