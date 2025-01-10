import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.println("Enter the age of Amar:");
        int ageAmar = sc.nextInt();
        System.out.println("Enter the age of Akbar:");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter the age of Anthony:");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.println("Enter the height of Amar (in cm):");
        int heightAmar = sc.nextInt();
        System.out.println("Enter the height of Akbar (in cm):");
        int heightAkbar = sc.nextInt();
        System.out.println("Enter the height of Anthony (in cm):");
        int heightAnthony = sc.nextInt();

        // Finding the youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = 
            (youngestAge == ageAmar) ? "Amar" : 
            (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        // Finding the tallest
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = 
            (tallestHeight == heightAmar) ? "Amar" : 
            (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        // Display results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        sc.close();
    }
}
