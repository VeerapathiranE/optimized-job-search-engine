package com.jobsearch;

import java.util.*;

public class SearchEngine {

    public void searchByKeyword(
            List<Job> jobs, String keyword) {

        PriorityQueue<Job> pq =
                new PriorityQueue<>(
                        (a, b) ->
                                score(b, keyword)
                                        - score(a, keyword));

        for (Job j : jobs) {
            if (score(j, keyword) > 0) {
                pq.add(j);
            }
        }

        if (pq.isEmpty()) {
            System.out.println("No matching jobs found.");
            return;
        }

        System.out.println("\nTop Matches:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    private int score(Job job, String keyword) {

        int score = 0;
        keyword = keyword.toLowerCase();

        if (job.getTitle().toLowerCase()
                .contains(keyword))
            score += 5;

        if (job.getCompany().toLowerCase()
                .contains(keyword))
            score += 3;

        if (job.getSkills().toLowerCase()
                .contains(keyword))
            score += 2;

        return score;
    }
}
