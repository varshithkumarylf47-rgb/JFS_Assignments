package com.interfaceBasics.quest6;

public class International implements ICuisine {
    @Override
    public String[] showMenus(String type) {
        return switch (type) {
            case "starters" -> new String[]{"Bruschetta",
                    "Caesar Salad",
                    "Garlic Bread",
                    "Spring Rolls",
                    "Stuffed Mushrooms",
                    "Chicken Wings",
                    "Nachos with Cheese",
                    "Mini Quiches",
                    "Calamari Fritti",
                    "Caprese Skewers"};
            case "desserts" -> new String[]{"Cheesecake",
                    "Brownie",
                    "Tiramisu",
                    "Crème Brûlée",
                    "Apple Pie",
                    "Chocolate Mousse",
                    "Panna Cotta",
                    "Baklava",
                    "Ice Cream Sundae",
                    "Eclairs"};
            case "maincourse" -> new String[]{"Lasagna",
                    "Grilled Salmon",
                    "Spaghetti Carbonara",
                    "Beef Steak",
                    "Chicken Alfredo Pasta",
                    "Vegetable Stir Fry",
                    "Tacos",
                    "Sushi Platter",
                    "Paella",
                    "Shepherd’s Pie"};
            default -> null;
        };
    }
}
