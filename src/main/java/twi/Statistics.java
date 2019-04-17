package twi;

import twitter4j.Twitter;

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

    }

    public long getFollowersCounter(){

    }

    public long getFollowingCounter(){

    }

    public String getBiography(){

    }

    public Date getLastTweetDate(){

    }

    //2 metody: jak szybko retweetuje, jak czesto tweetuje

}
