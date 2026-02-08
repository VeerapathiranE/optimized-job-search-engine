package com.jobsearch;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        JobService service = new JobService();
        SearchEngine engine = new SearchEngine();

        while (true) {

            System.out.println(
                    "\n==== SMART JOB SEARCH ENGINE ====");

            System.out.println("1. View Jobs");
            System.out.println("2. Search Job");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    service.viewAllJobs();
                    break;

                case 2:
                    System.out.print("Keyword: ");
                    String key = sc.nextLine();

                    engine.searchByKeyword(
                            service.getAllJobs(), key);
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
