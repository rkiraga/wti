package twi;

import twitter4j.Twitter;

public class Reports {

    Statistics statistics = null;

    public Reports(Twitter twitter, String username) {
        statistics = new Statistics(twitter, username);
    }

    public void makeReport(){
        System.out.println("Dane o użytkowniku: "       + statistics.getUsername());
        System.out.println("Ilość retweetow z ostatnich 1000: "
                                                        + statistics.getTweetsAndRetweetsCounter().get(0));
        System.out.println("Ilość tweetow z ostatnich 1000: "
                                                        + statistics.getTweetsAndRetweetsCounter().get(1));
        System.out.println("Ilość obserwującyh: "         + statistics.getFollowersCount());
        System.out.println("Ilość obserwowanych: "       + statistics.getFollowingCount());

        System.out.println("Biografia: "                + statistics.getBiography());
        System.out.println("Data dołączenia: "          + statistics.getAccountCreationDate());
        System.out.println("Odstępy czasowe w minutach pomiędzy tweetem, a retweetem użytkownika: "
                                                        + statistics.getLastRetweetsIntervalInMinutes());
        System.out.println("Odstępy czasowe w minutach pomiędzy dodawaniem tweetów: "
                                                        + statistics.getLastTweetsIntervals());

        }
}
