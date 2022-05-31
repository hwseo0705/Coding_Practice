package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Report {
    public static int[] solution(String[] id_list, String[] report, int k) {
        // answer
        int[] answer = new int[id_list.length];

        // id_list to arraylist
        List<String> idList = Arrays.asList(id_list);
        // final report of names that were reported k times and more
        List<String> reportFinal = new ArrayList<>();
        // map who reported who
        HashMap<String, List<String>> map = new HashMap<>();
        // map who got reported how many times
        HashMap<String, Integer> count = new HashMap<>();

        // initialize
        for (String id : id_list) {
            map.put(id, new ArrayList<String>());
            count.put(id, 0);
        }

        // put values in map and count
        for (int i = 0; i < report.length; i++) {
            String[] split = report[i].split(" ");
            String userId = split[0];
            String reportedUser = split[1];
            if (!map.get(userId).contains(reportedUser)) {
                map.get(userId).add(reportedUser);
                count.put(reportedUser, count.get(reportedUser) + 1);
                if (count.get(reportedUser) >= k) reportFinal.add(reportedUser);
            }
        }

        // count how many the 'id' reported were actually reported
        for (String id : map.keySet()) {
            int howManyReported = 0;
            for (String s : reportFinal) {
                if (map.get(id).contains(s)) howManyReported++;
            }
            answer[idList.indexOf(id)] = howManyReported;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "muzi frodo", "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
    }
}
