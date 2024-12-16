import java.util.Stack; // To use stack

public class StackCreature {
    public static void main(String[] args) {

        // Fixed input data for creatures and their power levels
        String[] cNames = {"Dragon", "Griffin", "Unicorn", "Phoenix", "Centaur"};
        int[] powerLevel = {95, 88, 78, 92, 85};

        System.out.println("\nGIMENEZ FINAL EXAM");
        
        // Display original data
        System.out.println("\nOriginal Data:");
        printData(cNames, powerLevel);

        // Sort power levels in descending order using Bubble Sort and display
        bubbleSortDescending(powerLevel, cNames);
        System.out.println("\nBubble Sort (Descending Order of Power Levels):");
        printDataWithPower(cNames, powerLevel);

        // Sort power levels in ascending order using Selection Sort and display
        selectionSortAscending(powerLevel, cNames);
        System.out.println("\nSelection Sort (Ascending Order of Power Levels):");
        printDataWithPower(cNames, powerLevel);

        // Use bubble sorted data to push creatures onto a stack
        Stack<String> creatureStack = new Stack<>();
        for (int i = 0; i < cNames.length; i++) {
            creatureStack.push(cNames[i] + " has a power level " + powerLevel[i]);
        }

        // Pop and display each creature's details from the stack
        System.out.println("\nPopped Creatures (Descending Order of Power Levels):");
        while (!creatureStack.isEmpty()) {
            System.out.println("Popped: " + creatureStack.pop());
        }
    }

    // Bubble Sort algorithm to sort the array in descending order and sort names along with it
    public static void bubbleSortDescending(int[] powerLevel, String[] names) {
        int n = powerLevel.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (powerLevel[j] < powerLevel[j + 1]) {
                    // Swap the power levels
                    int tempPower = powerLevel[j];
                    powerLevel[j] = powerLevel[j + 1];
                    powerLevel[j + 1] = tempPower;

                    // Swap the corresponding names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }

    // Selection Sort algorithm to sort the array in ascending order and sort names along with it
    public static void selectionSortAscending(int[] powerLevel, String[] names) {
        int n = powerLevel.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (powerLevel[j] < powerLevel[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the power levels
            int tempPower = powerLevel[minIdx];
            powerLevel[minIdx] = powerLevel[i];
            powerLevel[i] = tempPower;

            // Swap the corresponding names
            String tempName = names[minIdx];
            names[minIdx] = names[i];
            names[i] = tempName;
        }
    }

    // Method to print the elements of an array with their corresponding names
    public static void printData(String[] names, int[] powerLevels) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " has a power level of " + powerLevels[i]);
        }
    }

    // Method to print the names and power levels in a given order
    public static void printDataWithPower(String[] names, int[] powerLevels) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " has a power level of " + powerLevels[i]);
        }
    }
}
