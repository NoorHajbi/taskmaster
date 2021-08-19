package com.example.taskmaster;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EspressoAppTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void assertTextChanged() {
        // type text and then press change text button

//        onView(withId(R.id.inputField)).perform(typeText("Hello"), closeSoftKeyboard()); //editText
        onView(withId(R.id.buttonMain_addTask)).perform(click());
        onView(withId(R.id.buttonMain_allTask)).perform(click());


        // check that the text was changed when the button was clicked
//        onView(withId(R.id.inputField)).check(matches(withText("Hello"))); //editText, and we need to set that text in activity class
//        https://github.com/joj5/401-TEMP/blob/main/curriculum/class-31/demo/app/src/main/java/com/example/espressodemo/MainActivity.java
    }

    @Test
    public void goToSecondActivity() {
//        onView(withId(R.id.inputField)).perform(typeText("Good Bye"), closeSoftKeyboard());
//        onView(withId(R.id.buttonMain_allTask)).perform(click()); //we need goodbye to be rendered in allTask activity

        // assert the data went over correctly and was displayed
//        onView(withId(R.id.resultView)).check(matches(withText("Good Bye")));
    }
}