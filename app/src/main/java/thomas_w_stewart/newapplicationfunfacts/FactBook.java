package thomas_w_stewart.newapplicationfunfacts;

import java.util.Random;

/**
 * Created by rogerhull on 1/2/15.
 */
public class FactBook {

    String mFact = "";

    public String getFact(){

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10);


        if (randomNumber == 0) {
            mFact = "It is estimated that millions of trees are planted by forgetful squirrels";
        } else if (randomNumber == 1) {
            mFact = "A cat uses its whiskers to determine if a space is too small to squeeze through";
        } else if (randomNumber == 2) {
            mFact = "At latitude 60 degrees south you can sail all the way around the world";
        } else if (randomNumber == 3) {
            mFact = "A dragonfly has a lifespan of 24 hours";
        } else if (randomNumber == 4) {
            mFact = "99% of the solar system mass is concentrated in the sun";
        } else if (randomNumber == 5) {
            mFact = "Grapes explode when you put them in the microwave";
        } else if (randomNumber == 6) {
            mFact = "A pound of houseflies contains more protein than a pound of beef";
        } else if (randomNumber == 7) {
            mFact = "Nepal is the only country that doesn’t have a rectangular flag";
        } else if (randomNumber == 8) {
            mFact = "Nerve impulses to and from the brain travel as fast as 170 miles (274 km) per hour";
        } else if (randomNumber == 9) {
            mFact = "A lion in the wild usually makes no more than 20 kills a year";
        } else {
            mFact = "Sorry, there was an error";
        }
        return mFact;
    }
}
