package co.uk.zoopla.hooks;

import co.uk.zoopla.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browser {

    @Before
    public void setUp() {
        launchBrowser("Firefox");
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }



}