package Models;

import java.util.HashSet;
import java.util.Set;

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

}
