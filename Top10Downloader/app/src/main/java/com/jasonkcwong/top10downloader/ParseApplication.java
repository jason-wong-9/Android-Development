package com.jasonkcwong.top10downloader;

import java.util.ArrayList;

/**
 * Created by jason on 15-12-25.
 */
public class ParseApplication {
    private String data;
    private ArrayList<Application> applications;

    public ParseApplication(String xmlData) {
        this.data = xmlData;
        applications = new ArrayList<>();
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }
}
