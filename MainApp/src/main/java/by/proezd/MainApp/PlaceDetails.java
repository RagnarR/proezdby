package by.proezd.MainApp;

/**
 * Created with IntelliJ IDEA.
 * User: Aliaksandr_Rabykin
 * Date: 3/20/13
 * Time: 1:01 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.Serializable;

import com.google.api.client.util.Key;

/** Implement this class from "Serializable"
 * So that you can pass this class Object to another using Intents
 * Otherwise you can't pass to another actitivy
 * */
public class PlaceDetails implements Serializable {

    @Key
    public String status;

    @Key
    public Place result;

    @Override
    public String toString() {
        if (result!=null) {
            return result.toString();
        }
        return super.toString();
    }
}

