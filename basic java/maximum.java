public class maximum {
    public static void main(String[] args) {
        int n = 10; // Total rupees
        int r1 = 12; // Cost of plastic bottle
        int r2 = 9; // Cost of glass bottle
        int r3 = 8; // Exchange value of empty glass bottle

        int maxLiters = getMaxLiters(n, r1, r2, r3);
        System.out.println("Maximum liters of milk that can be bought: " + maxLiters);
    }

    public static int getMaxLiters(int n, int r1, int r2, int r3) {
        
        int maxLitersWithPlastic = n / r1;

    
        int maxLitersWithGlass = n / r2;

        int maxLiters = maxLitersWithGlass;
        int emptyBottles = maxLitersWithGlass;

        while (emptyBottles >= r3) {
            int additionalLiters = emptyBottles / r3;
            maxLiters += additionalLiters;
            emptyBottles = additionalLiters + emptyBottles % r3;
        }

            return Math.max(maxLiters, maxLitersWithPlastic);
    }
}
