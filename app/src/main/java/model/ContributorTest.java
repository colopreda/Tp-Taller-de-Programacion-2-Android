package model;

/**
 * Created by apredazzi on 3/22/17.
 */

public class ContributorTest {

    String login;
    String html_url;

    int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }

}
