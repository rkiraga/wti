package twi;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

import java.util.List;

public class Test {
    public static void main(String args[]) throws Exception{
        // The factory instance is re-useable and thread safe.
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.setOAuthConsumer("R8ewe2qMQ5N6J7M3JkqoJKcNb" , "nk7ep5FXcLPkDOJ1w8G8TVPi6BQsP6rMHn5sLsJepvfiB4rKie");
        RequestToken requestToken = twitter.getOAuthRequestToken();

        AccessToken accessToken = twi.AccessToken.getAccessToken();

        twitter.setOAuthAccessToken(accessToken);

        //jesli za pierwszy razem

        //        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //        while (null == accessToken) {
        //            System.out.println("Open the following URL and grant access to your account:");
        //            System.out.println(requestToken.getAuthorizationURL());
        //            System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
        //            String pin = br.readLine();
        //            try{
        //                if(pin.length() > 0){
        //                    accessToken = twitter.getOAuthAccessToken(requestToken, pin);
        //                }else{
        //                    accessToken = twitter.getOAuthAccessToken();
        //                }
        //            } catch (TwitterException te) {
        //                if(401 == te.getStatusCode()){
        //                    System.out.println("Unable to get the access token.");
        //                }else{
        //                    te.printStackTrace();
        //                }
        //            }
        //        }
        //        //persist to the accessToken for future reference.
        //        storeAccessToken(twitter.verifyCredentials().getId() , accessToken);


        //Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" +
                    status.getText());
        }
        System.out.println( twitter.getUserTimeline("AndrzejDuda") );
        System.out.println("===============\n\n");
        //System.out.println( twitter.tweets().getRetweets(new Long("896523232098078720")) );

//        System.out.println(twitter.tweets().);
        System.out.println("===============\n\n");
        System.out.println("===============\n\n");
        System.out.println( twitter.getAccountSettings().getScreenName() );

        //Status status = twitter.updateStatus(args[0]);
        //System.out.println("Successfully updated the status to [" + status.getText() + "].");
        System.exit(0);
    }

}
