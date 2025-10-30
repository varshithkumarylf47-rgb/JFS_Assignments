package com.interfaceBasics.quest6;

public class Indian implements ICuisine {
    @Override
    public String[] showMenus(String type) {
        return switch (type) {
            case "starters" -> new String[]{"Paneer Tikka",
                    "Samosa",
                    "Aloo Tikki",
                    "Chicken Tikka",
                    "Veg Manchurian",
                    "Hara Bhara Kabab",
                    "Seekh Kebab",
                    "Fish Amritsari",
                    "Dahi Puri",
                    "Prawn Koliwada"};
            case "desserts" -> new String[]{"Gulab Jamun",
                    "Rasmalai",
                    "Jalebi",
                    "Kheer",
                    "Gajar Ka Halwa",
                    "Rasgulla",
                    "Payasam",
                    "Sandesh",
                    "Kulfi",
                    "Mysore Pak"};
            case "maincourse" -> new String[]{"Butter Chicken",
                    "Paneer Butter Masala",
                    "Dal Makhani",
                    "Rogan Josh",
                    "Biryani",
                    "Palak Paneer",
                    "Chole Bhature",
                    "Mutton Curry",
                    "Kadhi Pakora",
                    "Fish Curry"};
            default -> null;
        };
    }
}
