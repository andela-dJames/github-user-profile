package com.danieljames.assessmentapp.domain.model;


import com.google.gson.annotations.SerializedName;

public class GithubCommit {

    @SerializedName("message")
    private String message;
    @SerializedName("tree")
    private String tree;
    @SerializedName("committer")
    private GithubUser commiter;

    @SerializedName("author")
    private GithubUser author;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public GithubUser getCommiter() {
        return commiter;
    }

    public void setCommiter(GithubUser commiter) {
        this.commiter = commiter;
    }

    public GithubUser getAuthor() {
        return author;
    }

    public void setAuthor(GithubUser author) {
        this.author = author;
    }
}
