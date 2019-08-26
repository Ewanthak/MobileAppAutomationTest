package com.freenow.android_demo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.freenow.android_demo.activities.AuthenticationActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.freenow.android_demo", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<AuthenticationActivity> activityRule
            = new ActivityTestRule<>(AuthenticationActivity.class);

    @Test
    public void testMethodOne(){
        onView(withId(R.id.edt_username)).perform(typeText("crazydog335"), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(typeText("venture"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
    }
}
