package Models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * The Destination class represents a destination with its associated
 * activities.
 * 
 * It tracks the name of the destination and a set of activities available at
 * the destination.
 */
public class Destination {
    private String name;
    private Set<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new HashSet<Activity>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Activity> getActivities() {
        return this.activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        this.activities.remove(activity);
    }

}
