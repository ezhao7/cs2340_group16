package edu.gatech.group16.watersourcingproject.controller.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import edu.gatech.group16.watersourcingproject.R;

/**
 * Created by Edwin Zhao on 2017/02/22.
 */

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * OnCreate method required to load activity and loads everything that
     * is needed for the page while setting the view.
     *
     *
     * @param savedInstanceState Takes in a bundle that may contain an object
     *                           for use within this class
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

        findViewById(R.id.welcome_button_signin).setOnClickListener(this);
        findViewById(R.id.welcome_button_signup).setOnClickListener(this);
    }

    /**
     * OnClick method that will listen for clicks on the
     * view that is taken in and proceed with actions.
     *
     *
     * @param v Takes in a view that will contain buttons
     *          for the onClick method to listen to.
     */
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.welcome_button_signin) {
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
            this.finish();
        } else if (i == R.id.welcome_button_signup) {
            Intent signUpIntent = new Intent(this, RegAccountTypeActivity.class);
            startActivity(signUpIntent);
            this.finish();
        }

    }

}
