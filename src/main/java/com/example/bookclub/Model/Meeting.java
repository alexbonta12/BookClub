package com.example.bookclub.Model;

import java.time.LocalDateTime;

public class Meeting {
    private int MEETING_ID;
    public String location;
    public LocalDateTime dateTime;
    public String meetingTitle;
    public String[] meetingDescription;
    public Book meetingBook;

    public Meeting() {}

    public int getMEETING_ID() {
        return MEETING_ID;
    }

    public void setMEETING_ID(int MEETING_ID) {
        this.MEETING_ID = MEETING_ID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String[] getMeetingDescription() {
        return meetingDescription;
    }

    public void setMeetingDescription(String[] meetingDescription) {
        this.meetingDescription = meetingDescription;
    }

    public Book getMeetingBook() {
        return meetingBook;
    }

    public void setMeetingBook(Book meetingBook) {
        this.meetingBook = meetingBook;
    }
}
