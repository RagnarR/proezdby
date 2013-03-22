package by.proezd.MainApp;

/**
 * Created with IntelliJ IDEA.
 * User: Aliaksandr_Rabykin
 * Date: 3/20/13
 * Time: 1:02 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.Serializable;
import java.util.List;

import com.google.api.client.util.Key;

/** Implement this class from "Serializable"
 * So that you can pass this class Object to another using Intents
 * Otherwise you can't pass to another actitivy
 * */
public class PlacesList implements Serializable {

    @Key
    public String status;

    @Key
    public List<Place> results;

}