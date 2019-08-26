package com.freenow.android_demo.view_interactions;

import android.support.test.espresso.ViewInteraction;

import com.freenow.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class AuthenticationView {

    public ViewInteraction getTxtUsernameInteraction(){
        return onView(withId(R.id.edt_username));
    }

    public ViewInteraction getTxtPasswordInteraction(){
        return onView(withId(R.id.edt_password));
    }

    public ViewInteraction getbtnLoginInteraction(){
        return onView(withId(R.id.btn_login));
    }
}
