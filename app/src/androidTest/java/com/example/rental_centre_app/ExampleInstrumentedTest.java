package com.example.rental_centre_app;

import android.content.Context;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
<<<<<<< Updated upstream
@RunWith(AndroidJUnit4.class)
class ExampleInstrumentedTest {
=======

public class ExampleInstrumentedTest {
>>>>>>> Stashed changes
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext;
        appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.rental_centre_app", appContext.getPackageName());
    }
}