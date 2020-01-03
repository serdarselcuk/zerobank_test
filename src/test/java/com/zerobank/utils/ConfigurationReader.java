package com.zerobank.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;

    static {
        try {
            FileInputStream stream = new FileInputStream("configuration.properties");
            configFile = new Properties();
            configFile.load(stream);
            stream.close();
        } catch (IOException e) {
            System.out.println("Failed to load properties file!");
            e.printStackTrace();
        }
    }

    public static String getProperty(String str){

        return configFile.getProperty(str);
    }
}
