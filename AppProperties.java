/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.search.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Ashley
 */
public class AppProperties {
    
    public static Properties appProperties = new Properties();
    
    public String getProperty(String propertyName) {
        String propertyValue = "";
        try
        {
            appProperties.load(new FileInputStream("DVDSearchConfig.properties"));
            propertyValue = appProperties.getProperty(propertyName);
        }
        catch(IOException e) {
            System.out.println("Could not load app properties");
            e.printStackTrace();
        }
        return propertyValue;
    }
}
