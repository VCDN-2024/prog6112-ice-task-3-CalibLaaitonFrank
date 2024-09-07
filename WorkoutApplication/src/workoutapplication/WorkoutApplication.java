package  workoutapplication;
import java.util.Scanner;

// Abstract class Workout
abstract class Workout {
    private String exercises;
    private int duration; // in minutes
    private int intensityLevel;

    // Constructor
    public Workout(String exercises, int duration, int intensityLevel) {
        this.exercises = exercises;
        this.duration = duration;
        this.intensityLevel = intensityLevel;
    }

    // Get methods
    public String getExercises() {
        return exercises;
    }

    public int getDuration() {
        return duration;
    }

    public int getIntensityLevel() {
        return intensityLevel;
    }
}

// Interface IWorkout
public interface IWorkout {
    void printWorkout();
}

// Class ProcessWorkout extends Workout and implements IWorkout
class ProcessWorkout extends Workout implements IWorkout {
    // Constructor
    public ProcessWorkout(String exercises, int duration, int intensityLevel) {
        super(exercises, duration, intensityLevel);
    }

    // Method to print workout details
    @Override
    public void printWorkout() {
        System.out.println("Workout Details:");
        System.out.println("Exercises: " + getExercises());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Intensity Level: " + getIntensityLevel());
    }
}

// Class WorkoutApplication
public class WorkoutApplication {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter workout details
        System.out.println("Enter workout exercises:");
        String exercises = scanner.nextLine();
        System.out.println("Enter workout duration (in minutes):");
        int duration = scanner.nextInt();
        System.out.println("Enter workout intensity level (1-10):");
        int intensityLevel = scanner.nextInt();

        // Instantiate ProcessWorkout
        ProcessWorkout workout = new ProcessWorkout(exercises, duration, intensityLevel);

        // Call printWorkout() to display workout details
        workout.printWorkout();
    }
}


//REFERENCES
//Farell, J, 2019. Java Programming, 9th edition. Cengage Learning