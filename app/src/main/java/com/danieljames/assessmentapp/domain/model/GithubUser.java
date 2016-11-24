package com.danieljames.assessmentapp.domain.model;


public class GithubUser extends Model{
    private String userName;
    private String email;
    private int followers;
    private int following;
    private int numberOfRepos;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getNumberOfRepos() {
        return numberOfRepos;
    }

    public void setNumberOfRepos(int numberOfRepos) {
        this.numberOfRepos = numberOfRepos;
    }
}
