package programs;

// Julian Saldana
// CECS 274-05
// Prog 1 – Marathon
// Feb 11 2020

import java.util.Scanner;

public class Marathon {
    public static void main(String[]arg){
        System.out.println("Welcome to the Los Angeles Marathon Training Program");
        // gathering all the information of user
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.next();
        System.out.print("How far did you run today? ");
        double distance = in.nextDouble();
        System.out.print("How many hours? ");
        int hours = in.nextInt();
        System.out.print("How many minutes? ");
        int minutes = in.nextInt();
        System.out.print("How many seconds? ");
        int seconds = in.nextInt();

        // calculating pace for user
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double pace = totalSeconds / distance; // pace in seconds
        int paceHours = (int) (pace / 3600);
        int paceMinutes = (int) ((pace - (paceHours * 3600) )/ 60);
//        int paceSeconds = (int) (pace - (paceHours * 3600) - (paceMinutes * 60));
        int paceSeconds = (int) (pace % 60);
        System.out.printf("\nHi %s\n", name);
        System.out.printf("Your pace is %d:%02d:%2d\n", paceHours, paceMinutes, paceSeconds);

        // calculating marathon time for user
        double mpace = (totalSeconds / distance) * 26.21875; // pace in seconds
        int mpaceHours = (int) (mpace / 3600);
        int mpaceMinutes = (int) ((mpace - (mpaceHours * 3600) )/ 60);
        int mpaceSeconds = (int) (mpace % 60);
        System.out.printf("At this rate your marathon time would be %d:%02d:%02d\n", mpaceHours, mpaceMinutes, mpaceSeconds);
        System.out.println("Good luck with your training!\n");

        // calculating pace for eliud
        double edistance = 26.21875;
        int ehours = 1;
        int eminutes = 59;
        int eseconds = 40;
        int etotalSeconds = (ehours * 3600) + (eminutes * 60) + eseconds;
        double epace = etotalSeconds / edistance; // eliuds pace in seconds

        pacetable(name, pace, epace);
    }
    // pace table
    public static void pacetable (String uname, double userpace, double eliudpace){
        System.out.println("Pace Table");
        System.out.printf("Mile\t\t\tEliud\t\t\t\t%s\n", uname);
        for (int i = 1; i <= 26; i++){
            // calculating time per mile for user
            double tempuserpace = userpace * i;
            int progressHours = (int) (tempuserpace / 3600);
            int progressMinutes = (int) ((tempuserpace - (progressHours * 3600) )/ 60);
            int progressSeconds = (int) (tempuserpace % 60);

            // calculating time per mile for eliud
            double tempeliudpace = eliudpace * i;
            int eprogressHours = (int) (tempeliudpace / 3600);
            int eprogressMinutes = (int) ((tempeliudpace - (eprogressHours * 3600) )/ 60);
            int eprogressSeconds = (int) (tempeliudpace % 60);

            System.out.printf("%d\t\t\t\t%d:%02d:%02d\t\t\t\t%d:%02d:%02d\n", i, eprogressHours, eprogressMinutes, eprogressSeconds,
                    progressHours, progressMinutes, progressSeconds);
        }
        // calculating final 385 yards of marathon for user
        double tempuserpace = userpace * 26.21875;
        int progressHours = (int) (tempuserpace / 3600);
        int progressMinutes = (int) ((tempuserpace - (progressHours * 3600) )/ 60);
        int progressSeconds = (int) (tempuserpace % 60);

        // calcuating final 385 yards of marathon for eliud
        double tempeliudpace = eliudpace * 26.21875;
        int eprogressHours = (int) (tempeliudpace / 3600);
        int eprogressMinutes = (int) ((tempeliudpace - (eprogressHours * 3600) )/ 60);
        int eprogressSeconds = (int) (tempeliudpace % 60);

        System.out.printf("26m, 385y\t\t%d:%02d:%02d\t\t\t\t%d:%02d:%02d\n", eprogressHours, eprogressMinutes, eprogressSeconds,
                progressHours, progressMinutes, progressSeconds);
    }
}
