package com.example;

import java.util.EnumSet;
import java.util.Set;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum Activity {
    HIKING, SWIMMING, SKIING, PUMPKIN_CARVING
}

class SeasonalActivityOrganizer {
    private EnumSet<Activity> springActivities;
    private EnumSet<Activity> summerActivities;
    private EnumSet<Activity> autumnActivities;
    private EnumSet<Activity> winterActivities;

    public SeasonalActivityOrganizer() {
        springActivities = EnumSet.noneOf(Activity.class);
        summerActivities = EnumSet.noneOf(Activity.class);
        autumnActivities = EnumSet.noneOf(Activity.class);
        winterActivities = EnumSet.noneOf(Activity.class);
    }

    public Set<Activity> getActivitiesForSeason(Season season) {
        switch (season) {
            case SPRING:
                return springActivities;
            case SUMMER:
                return summerActivities;
            case AUTUMN:
                return autumnActivities;
            case WINTER:
                return winterActivities;
            default:
                throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    public Set<Activity> addActivityForSeason(Activity activity, Season season) {
        switch (season) {
            case SPRING:
                springActivities.add(activity);
                return springActivities;
            case SUMMER:
                summerActivities.add(activity);
                return summerActivities;
            case AUTUMN:
                autumnActivities.add(activity);
                return autumnActivities;
            case WINTER:
                winterActivities.add(activity);
                return winterActivities;
            default:
                throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    public void removeActivityFromAllSeasons(Activity activity) {
        springActivities.remove(activity);
        summerActivities.remove(activity);
        autumnActivities.remove(activity);
        winterActivities.remove(activity);
    }

    public Set<Activity> getAllActivities() {
        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
        allActivities.addAll(springActivities);
        allActivities.addAll(summerActivities);
        allActivities.addAll(autumnActivities);
        allActivities.addAll(winterActivities);
        return allActivities;
    }

    public static void main(String[] args) {
        SeasonalActivityOrganizer organizer = new SeasonalActivityOrganizer();
        organizer.addActivityForSeason(Activity.HIKING, Season.SPRING);
        organizer.addActivityForSeason(Activity.SWIMMING, Season.SUMMER);
        organizer.addActivityForSeason(Activity.SKIING, Season.WINTER);

        System.out.println(organizer.getAllActivities()); // Output: [HIKING, SWIMMING, SKIING]
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING)); // Output: [HIKING]
        System.out.println(organizer.getActivitiesForSeason(Season.SUMMER)); // Output: [SWIMMING]
        System.out.println(organizer.getActivitiesForSeason(Season.WINTER)); // Output: [SKIING]

        organizer.removeActivityFromAllSeasons(Activity.HIKING);
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING)); // Output: []
    }
}
