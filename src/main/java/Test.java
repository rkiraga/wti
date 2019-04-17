import twi.Reports;
import twi.Statistics;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
//    public static void main(String args[]) throws Exception{
//        // The factory instance is re-useable and thread safe.
//        Twitter twitter = TwitterFactory.getSingleton();
//        twitter.setOAuthConsumer("R8ewe2qMQ5N6J7M3JkqoJKcNb" , "nk7ep5FXcLPkDOJ1w8G8TVPi6BQsP6rMHn5sLsJepvfiB4rKie");
//        RequestToken requestToken = twitter.getOAuthRequestToken();
//
//        AccessToken accessToken = getAccessToken();
//        twitter.setOAuthAccessToken(accessToken);
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        while (null == accessToken) {
////            System.out.println("Open the following URL and grant access to your account:");
////            System.out.println(requestToken.getAuthorizationURL());
////            System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
////            String pin = br.readLine();
////            try{
////                if(pin.length() > 0){
////                    accessToken = twitter.getOAuthAccessToken(requestToken, pin);
////                }else{
////                    accessToken = twitter.getOAuthAccessToken();
////                }
////            } catch (TwitterException te) {
////                if(401 == te.getStatusCode()){
////                    System.out.println("Unable to get the access token.");
////                }else{
////                    te.printStackTrace();
////                }
////            }
////        }
////        //persist to the accessToken for future reference.
////        storeAccessToken(twitter.verifyCredentials().getId() , accessToken);
//
//        //Twitter twitter = TwitterFactory.getSingleton();
////        List<Status> statuses = twitter.getUserTimeline("AndrzejDuda");
////        System.out.println("Showing home timeline.");
////        int c = 0;
////        for (Status status : statuses) {
////            if( status.isRetweet() ){
////
////                Date dataRetw = status.getCreatedAt();
////
////                System.out.println( dataRetw );
////
////
////                System.out.println( status.getRetweetedStatus().getId() );
////                System.out.println( "oryginal" + twitter.showStatus( status.getRetweetedStatus().getId() ).getText() );
////
////                Date dataOrygi = twitter.showStatus( status.getRetweetedStatus().getId() ).getCreatedAt();
////
////                System.out.println( dataOrygi );
//////                System.out.println( Date dataRetw dataOrygi );
////                //System.out.println(twitter.get);
////                long diffInMillies = Math.abs(dataOrygi.getTime() - dataRetw.getTime());
////                long diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
////                System.out.println( "roznica w minitach: " + diff);
////            }
////            c++;
////            if(c==5){
////                break;
////            }
////        }
//
////        System.out.println("DUDA FOLLOWUJE:  " + twitter.showUser("AndrzejDuda").getFriendsCount());
////        System.out.println("DUDE FOLLOWUJE :  " + twitter.showUser("AndrzejDuda").getFollowersCount());
////        System.out.println("DATA :  " + twitter.showUser("AndrzejDuda").getCreatedAt());
////        System.out.println("DATA :  " + twitter.showUser("AndrzejDuda").getDescription());
////
////        System.out.println( twitter.getUserTimeline("AndrzejDuda") );
////
////        System.out.println("===============\n\n");
//        //System.out.println( twitter.tweets().getRetweets(new Long("896523232098078720")) );
//
//        //Status status = twitter.updateStatus(args[0]);
//        //System.out.println("Successfully updated the status to [" + status.getText() + "].");
//
////        Statistics s = new Statistics(twitter, "AndrzejDuda");
////        System.out.println(s.getLastRetweetsIntervalInMinutes());
////        System.out.println(s.getLastTweetsIntervals());
//
//        System.out.println("test");
//        //Reports reports = new Reports(twitter, "AndrzejDuda");
//        Reports reports = new Reports(twitter, "betelgeuse_3");
//
//        reports.makeReport();
//
//        System.exit(0);
//    }
//    private static void storeAccessToken(long useId, AccessToken accessToken){
//        System.out.println(useId);
//        FileOutputStream fileOut = null;
//        try {
//            fileOut = new FileOutputStream("token");
//            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//            objectOut.writeObject(accessToken);
//            objectOut.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("The Object  was succesfully written to a file");
//
//    }
//    private static AccessToken getAccessToken(){
//        AccessToken accessToken = null;
//        FileInputStream fileIn = null;
//        try {
//            fileIn = new FileInputStream("token");
//            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//            accessToken = (AccessToken) objectIn.readObject();
//            objectIn.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return accessToken;
//    }


}
