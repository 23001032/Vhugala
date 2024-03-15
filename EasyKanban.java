import javax.swing.JOptionPane; // Importing the necessary package for user input dialogs

public class EasyKanban { // Defining a class named EasyKanban

    public static void main(String[] args) { // The entry point of the program
        boolean loggedIn = true; // Initializing a boolean variable to keep track of login status

        // Welcome Message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban"); // Displaying a welcome message

        while (loggedIn) { // Starting a loop that runs as long as the user is logged in
            int choice = showMenu(); // Calling a method to display a menu and get the user's choice

            switch (choice) { // Switching based on the user's choice
                case 1: // If the user chose option 1
                    handleAddTask(); // Call a method to handle adding tasks
                    break;
                case 2: // If the user chose option 2
                    JOptionPane.showMessageDialog(null, "Coming Soon"); // Display a message indicating that this
                                                                        // feature is coming soon
                    break;
                case 3: // If the user chose option 3 (Quit)
                    loggedIn = false; // Set loggedIn to false to exit the loop and quit the program
                    break;
                default: // If the user chose an invalid option
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again."); // Display an error
                                                                                              // message
            }
        }
    }

    private static int showMenu() { // Method to display a menu and get the user's choice
        String[] options = { "Add tasks", "Show report", "Quit" }; // Creating an array of menu options
        // Displaying a dialog with the menu options and returning the index of the
        // chosen option (+1 to match the switch cases)
        return JOptionPane.showOptionDialog(null, "Choose an option:", "Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]) + 1;
    }

    private static void handleAddTask() { // Method to handle adding tasks
        int taskCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks: ")); // Asking the user
                                                                                                      // for the number
                                                                                                      // of tasks

        double totalHours = 0; // Initializing a variable to keep track of the total hours
        Task[] tasks = new Task[taskCount]; // Creating an array to store Task objects

        for (int i = 0; i < taskCount; i++) { // Loop for adding tasks based on user input
            String taskName = JOptionPane.showInputDialog("Task Name:"); // Asking the user for task details
            String taskDescription = JOptionPane.showInputDialog("Task Description:");
            String developerDetails = JOptionPane.showInputDialog("Developer Details:");
            double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Task Duration (in hours):"));
            String taskStatus = JOptionPane.showInputDialog("Task Status (To Do/Done/Doing):");

            Task task = new EasyKanban().new Task(taskName, i, taskDescription, developerDetails, taskDuration,
                    taskStatus); // Creating a new Task object
            if (!task.checkTaskDescription()) { // Checking if the task description is valid
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters"); // Displaying
                                                                                                                   // an
                                                                                                                   // error
                                                                                                                   // message
                i--; // Decrementing i to re-add the same task
                continue; // Skipping the rest of the loop
            }

            tasks[i] = task; // Adding the task to the array
            totalHours += task.getTaskDuration(); // Adding the task duration to the total

            JOptionPane.showMessageDialog(null, task.printTaskDetails()); // Displaying the task details
        }

        JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours); // Displaying the total hours
    }

    class Task { // Defining an inner class named Task
        String taskName; // Declaring variables to store task details
        int taskNumber;
        String taskDescription;
        String developerDetails;
        double taskDuration;
        String taskID;
        String taskStatus;

        public Task(String taskName, int taskNumber, String taskDescription, String developerDetails,
                double taskDuration, String taskStatus) {
            this.taskName = taskName; // Assigning values to the task variables
            this.taskNumber = taskNumber;
            this.taskDescription = taskDescription;
            this.developerDetails = developerDetails;
            this.taskDuration = taskDuration;
            this.taskID = createTaskID(); // Calling a method to generate a task ID
            this.taskStatus = taskStatus;
        }

        public boolean checkTaskDescription() { // Method to check if the task description is valid
            return taskDescription.length() <= 50; // Returning true if the description is less than or equal to 50
                                                   // characters
        }

        public String createTaskID() { // Method to generate a task ID
            String taskNamePrefix = taskName.substring(0, 2).toUpperCase(); // Extracting the first two letters of the
                                                                            // task name and converting to uppercase
            String developerSuffix = developerDetails.substring(developerDetails.lastIndexOf(' ') + 1).toUpperCase(); // Extracting
                                                                                                                      // the
                                                                                                                      // last
                                                                                                                      // name
                                                                                                                      // of
                                                                                                                      // the
                                                                                                                      // developer
                                                                                                                      // and
                                                                                                                      // converting
                                                                                                                      // to
                                                                                                                      // uppercase
            return taskNamePrefix + ":" + taskNumber + ":" + developerSuffix; // Concatenating the parts to form the
                                                                              // task ID
        }

        public String printTaskDetails() { // Method to format and return task details
            return "Task Status: " + taskStatus + "\n" +
                    "Developer Details: " + developerDetails + "\n" +
                    "Task Number: " + taskNumber + "\n" +
                    "Task Name: " + taskName + "\n" +
                    "Task Description: " + taskDescription + "\n" +
                    "Task ID: " + taskID + "\n" +
                    "Duration: " + taskDuration + " hours";
        }

        public double getTaskDuration() { // Method to get the task duration
            return taskDuration; // Returning the task duration
        }
    }
}
