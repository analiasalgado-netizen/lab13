package com.lab13;

public class OnSiteCourse extends Course {
    public int room;
    public int maxquota;

    public OnSiteCourse(String Title, int duration, int room, int maxquota) {
        super(Title, duration);
        this.room = room;
        this.maxquota = maxquota;

    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getMaxquota() {
        return maxquota;
    }

    public void setMaxquota(int maxquota) {
        this.maxquota = maxquota;
    }

    //
    @Override
    public String showInformation() {
    return super.showInformation()
         + "\nRoom: " + room
         + "\nMax quota: " + maxquota;
}

    }
