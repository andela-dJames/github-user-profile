package com.danieljames.assessmentapp.domain.model;



public class GithubCommit {

    private String message;
    private String tree;
    private GithubUser commiter;

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
}
