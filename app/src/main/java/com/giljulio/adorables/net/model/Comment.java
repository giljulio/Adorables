package com.giljulio.adorables.net.model;

import com.giljulio.adorables.ui.model.Chat;

public class Comment implements Chat {

    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String getKey() {
        return Comment.class.getSimpleName() + String.valueOf(getId());
    }
}