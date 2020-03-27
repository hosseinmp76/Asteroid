package main.java.Util;

import java.lang.reflect.Field;
import java.util.Properties;

public class Constants {

    public static int spaceShipSize;
    public static int initialAsteroids;
    public static int asteroidChance;
    public static int maxWidth;
    public static int maxHeight;
    public static int maxSpeed;
    public static int minSpeed;
    public static int maxSize;
    public static int minSize;
    public static int asteroidNumber;

    private static Config configConstants = new Config();

    static {
        configConstance(configConstants.ReadProperties(Urls.createUrls("default").getProperty("CONSTANCE_CONFIG_FILE")));
    }


    private static void configConstance(Properties properties) {

        for (Field field : Constants.class.getFields()) {
            configConstants.fieldInit(field, properties);
        }

    }


}
