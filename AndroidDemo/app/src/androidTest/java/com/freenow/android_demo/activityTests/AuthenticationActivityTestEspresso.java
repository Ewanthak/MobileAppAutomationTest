package com.freenow.android_demo.activityTests;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.freenow.android_demo.activities.AuthenticationActivity;
import com.freenow.android_demo.view_interactions.AuthenticationView;

@RunWith(AndroidJUnit4.class)
public class AuthenticationActivityTestEspresso {
    public static final String USERNAME = "crazydog335";
    public static final String PASSWORD = "venture";
    public AuthenticationView authView = new AuthenticationView();

    @Rule
    public ActivityTestRule<AuthenticationActivity> activityRule
            = new ActivityTestRule<>(AuthenticationActivity.class);

    @Test
    public void verifyFreenowLogin(){
        authView.getTxtUsernameInteraction().perform(typeText(USERNAME), closeSoftKeyboard());
        authView.getTxtPasswordInteraction().perform(typeText(PASSWORD), closeSoftKeyboard());
        authView.getbtnLoginInteraction().perform(click());
    }
}
