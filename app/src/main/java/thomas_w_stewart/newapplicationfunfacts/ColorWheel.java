package thomas_w_stewart.newapplicationfunfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by rogerhull on 1/2/15.
 */
public class ColorWheel {
    String mColors[] = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int findColor() {

        Random randomGenerator = new Random();
        int randomColor = randomGenerator.nextInt(mColors.length);
        String color = mColors[randomColor];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }


}