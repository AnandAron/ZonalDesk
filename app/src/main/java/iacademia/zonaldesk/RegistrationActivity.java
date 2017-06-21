package iacademia.zonaldesk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    SharedPreferences p= PreferenceManager.getDefaultSharedPreferences(this);


        boolean firstInstall=p.getBoolean("FIRST_INSTALL",true);
        p.edit().putBoolean("FIRST_INSTALL",false).apply();
        boolean isVerified = p.getBoolean("VERIFICATION_STATUS",false);

        //Only If the entry is not immediate after first install and if the user is verified , Redirect to the Home Activity
        //else continue with the Registration Activity
        //Note: Include the line "SharedPreferences.edit().putBoolean("VERIFICATION_STATUS",true).apply()" once the verification is done
        //Note that after entering to HomeActivity Registration Activity must be removed from the back stack by mentioning in the manifest file
        if(!firstInstall & isVerified){
            p.edit().putBoolean("VERIFICATION_STATUS",true).apply();//I ve included it here to make the app stable.
            // Remove this and update the status once the verification is done
            Intent i = new Intent(this,HomeActivity.class);
            startActivity(i);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



    }
}
