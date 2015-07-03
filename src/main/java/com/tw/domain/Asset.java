package com.tw.domain;

public class Asset {

    private final long id;

    public String getContent() {
        return content;
    }

    private final String content;

    public Asset(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }
}
