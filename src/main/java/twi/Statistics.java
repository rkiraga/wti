package twi;

import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.Date;

public class Statistics {

    private Twitter twitter;

    private String username;

    public Statistics(Twitter twitter, String username) {
        this.twitter = twitter;
        this.username = username;
    }


    public Date getAccountCreationDate(){
        return null;
    }

    public long getTweetsCounter(){
        long tc = 0;
        try {
            tc = twitter.showUser(username).getFollowersCount();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return tc;
    }

    public long getFollowersCount(){
        long fc = 0;
        try {
            fc = twitter.showUser(username).getFollowersCount();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return fc;
    }

    public long getFollowingCount() {
        long fc = 0;
        try {
            fc =  twitter.showUser(username).getFriendsCount();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return fc;
    }

    public String getBiography(){
        String bio = "";
        try {
            bio =  twitter.showUser(username).getDescription();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return bio;
    }

    public Date getLastTweetDate(){
        Date d = null;
        try {
            d =  twitter.showUser("AndrzejDuda").getCreatedAt();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return d;
    }

    //2 metody: jak szybko retweetuje, jak czesto tweetuje

}
