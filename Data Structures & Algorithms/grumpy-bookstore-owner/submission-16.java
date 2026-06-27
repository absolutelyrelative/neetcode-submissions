class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfiedCustomers = 0;
        int maxSatisfiedCustomers = Integer.MIN_VALUE;

        // Calculate satisfiedCustomers
        for(int i = 0; i < customers.length; i++) {
            satisfiedCustomers += (1 - grumpy[i]) * customers[i];
        }
        System.out.println(satisfiedCustomers);
        System.out.println('-');

        // Initiate the window
        int left = 0;
        int right = 0;
        int saved = 0;

        for(right = 0; right < minutes - 1 && right < customers.length; right++) {
            saved += (grumpy[right]) * customers[right];
            System.out.println("Right: " + String.valueOf(right) + " Saved: " + String.valueOf(saved));
        }
        System.out.println("Right: " + String.valueOf(right) + " Saved: " + String.valueOf(saved));
        System.out.println('-');

        for(left = 0; left <= customers.length - minutes; left++){
            saved = saved + (grumpy[left + minutes - 1]) * customers[left + minutes - 1];
            int currentSatisfiedCustomers = satisfiedCustomers + saved;
            maxSatisfiedCustomers = Math.max(maxSatisfiedCustomers, currentSatisfiedCustomers);
            saved = saved - (grumpy[left]) * customers[left];
            System.out.println("Right: " + String.valueOf(left + minutes - 1) + " Saved: " + String.valueOf(saved));
        }

        return maxSatisfiedCustomers;
    }
}