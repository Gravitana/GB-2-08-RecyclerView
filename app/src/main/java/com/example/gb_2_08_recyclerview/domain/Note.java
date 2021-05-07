package com.example.gb_2_08_recyclerview.domain;

public class Note {

    private final String id;
    private final String title;
    private final String imageUrl;

    public Note(String id, String title, String imageUrl) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
