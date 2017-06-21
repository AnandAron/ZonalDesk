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

    /*    SharedPreferences p= PreferenceManager.getDefaultSharedPreferences(this);


        boolean firstInstall=p.getBoolean("FIRST_INSTALL",true);
        p.edit().putBoolean("FIRST_INSTALL",false).apply();
        //If the app is opened first after installation, Redirect to the Home Activity
        //else continue with the Registration Activity
        //Note that after entering to HomeActivity Registration Activity must be removed from the back stack by mentioning in the manifest file
        if(!firstInstall){

            Intent i = new Intent(this,HomeActivity.class);
            startActivity(i);
        }
*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
      //  Drawable tempDrawable = getResources().getDrawable(R.drawable.try1);
      //  LayerDrawable bubble = (LayerDrawable) tempDrawable;
       // GradientDrawable rightRect = (GradientDrawable) bubble.findDrawableByLayerId(R.id.rightRect);


    }
}
