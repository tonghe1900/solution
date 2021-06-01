package com.cisco.demo.pojo;

public class SignUpInfo {

	private String id;

    private String registered_at;

    private String first_name;

    private String last_name;

    private String instagram_username;

    private String twitter_username;

    private String development_environment;

    private String location;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setRegistered_at(String registered_at){
        this.registered_at = registered_at;
    }
    public String getRegistered_at(){
        return this.registered_at;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    public String getFirst_name(){
        return this.first_name;
    }
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    public String getLast_name(){
        return this.last_name;
    }
    public void setInstagram_username(String instagram_username){
        this.instagram_username = instagram_username;
    }
    public String getInstagram_username(){
        return this.instagram_username;
    }
    public void setTwitter_username(String twitter_username){
        this.twitter_username = twitter_username;
    }
    public String getTwitter_username(){
        return this.twitter_username;
    }
    public void setDevelopment_environment(String development_environment){
        this.development_environment = development_environment;
    }
    public String getDevelopment_environment(){
        return this.development_environment;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }
}




