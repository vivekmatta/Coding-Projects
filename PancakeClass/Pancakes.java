public class Pancakes {
    public int minutesNeeded (int numCakes, int capacity) {

        // Conditions

        // Condition 1
        if (numCakes == 0) {
            return 0;
        }

        // Condition 2
        if (numCakes <= capacity) {
            return 10;
        }

        // Condition 3
        else {
            // If remainder is 0, return the quotient times 10
            if (numCakes % capacity == 0) {
                return (numCakes / capacity) * 10;
            }
            // If the remainder is greater than 0 and the remainder is greater than the capacity / 2, return
            // the quotient times 10 + 10
            else if (numCakes % capacity > 0 && (numCakes % capacity) > capacity / 2){
                return ((numCakes / capacity) * 10) + 10;
            }
            // Any other condition, return the quotient times 10 + 5
            else
            {
                return ((numCakes / capacity) * 10) + 5;
            }
        }

    }

}
