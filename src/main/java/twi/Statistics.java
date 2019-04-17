package twi;

import twitter4j.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Statistics {

    private Twitter twitter;

    private String username;

    public Statistics(Twitter twitter, String username) {
        this.twitter = twitter;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public Date getAccountCreationDate(){
        try {
            return twitter.showUser(username).getCreatedAt();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Integer> getTweetsAndRetweetsCounter(){
        int retweetCounter = 0;
        int tweetCounter = 0;
        int p = 1;
        do{
            try {
                Paging paging = new Paging(p);

                List<Status> statuses = twitter.getUserTimeline(username, paging);
                for(Status status: statuses){
                    if(status.isRetweet()){
                        retweetCounter++;
                    }else{
                        tweetCounter++;
                    }
                }
            } catch (TwitterException e) {
                p++;
                continue;
            }
            p++;
        }while(p<=50);

        List<Integer> result = new ArrayList<Integer>(2);
        result.add(0,retweetCounter);
        result.add(1,tweetCounter);

        return result;
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
        String bio = "brak";
        try {
            bio =  twitter.showUser(username).getDescription();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return bio;
    }

//    public Date getLastTweetDate(){
//        Date d = null;
//        try {
//            d =  twitter.showUser(this.username).getCreatedAt();
//        } catch (TwitterException e) {
//            e.printStackTrace();
//        }
//        return d;
//    }

    public List<Long> getLastRetweetsIntervalInMinutes() {
        List<Long> intervals = new ArrayList<Long>();
        List<Status> statuses = null;

        try {
            statuses = twitter.getUserTimeline(username);

            for (Status status : statuses) {
                if (status.isRetweet()) {

                    Date retweetDate = status.getCreatedAt();

                    Date originalDate = twitter.showStatus( status.getRetweetedStatus().getId() ).getCreatedAt();

                    long diffInMillies = Math.abs(originalDate.getTime() - retweetDate.getTime());
                    long diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);

                    intervals.add(diff);
                }

            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return intervals;
    }
    public List<Long> getLastTweetsIntervals() {

        List<Long> intervals = new ArrayList<Long>();
        List<Status> statuses = new ArrayList<Status>();
        List<Status> statusesTweets = new ArrayList<Status>();

        try {

            statuses = twitter.getUserTimeline(username);
            for (Status status : statuses) {
                if (!status.isRetweet()) {
                    statusesTweets.add(status);
                }
            }

            for(int i=0; i<statusesTweets.size()-1; i++){
                long diffInMillies = statuses.get(i).getCreatedAt().getTime() - statuses.get(i+1).getCreatedAt().getTime();
                long diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
                intervals.add(diff);
            }


        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return intervals;
    }




}
