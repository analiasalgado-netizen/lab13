package com.lab13;

public class OnlineCourse extends Course {
    public String platform;

    public OnlineCourse(String Title, int duration, String platform) {
        super(Title, duration);
        this.platform = platform;

    }

    public String getPlatform() {
    return platform;
}

public void setPlatform(String platform) {
    this.platform = platform;
}


    
    @Override
public String showInformation() {
    return super.showInformation() + "\nPlatform: " + platform;
}

    }  

