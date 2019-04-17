package twi;

import java.io.*;

public class AccessToken {
    public static void storeAccessToken(long useId, twitter4j.auth.AccessToken accessToken){
        System.out.println(useId);
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("token");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(accessToken);
            objectOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The token was succesfully written to a file");

    }

    public static twitter4j.auth.AccessToken getAccessToken(){
        twitter4j.auth.AccessToken accessToken = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream("token");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            accessToken = (twitter4j.auth.AccessToken) objectIn.readObject();
            objectIn.close();
            System.out.println("The token was succesfully read from a file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return accessToken;
    }
}
