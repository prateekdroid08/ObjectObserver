package android.kulcare_pharmacy.com.observerandobservable;

import java.util.Observable;

/**
 * Created by prateekarora on 2/18/16.
 */
public class Test extends Observable {

    private String name = "First time i have this text.";
    private static Test myObj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

    public static Test getObserver() {
        if (myObj == null)
            myObj = new Test();
        return myObj;
    }
}
