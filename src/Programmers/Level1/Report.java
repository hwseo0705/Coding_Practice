package Programmers.Level1;

import java.sql.Array;
import java.util.*;

public class Report {
    public static int[] solution(String[] id_list, String[] report, int k) {
        // answer
        int[] answer = new int[id_list.length];

        // id_list to arraylist
        List<String> idList = Arrays.asList(id_list);
        // map who reported who
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String user = report[i].split(" ")[0];
            String reportedUser = report[i].split(" ")[1];

            if (map.get(reportedUser) != null) {
                if (!map.get(reportedUser).contains(user)) {
                    map.get(reportedUser).add(user);
                }
            } else {
                List<String> l = new ArrayList<>();
                l.add(user);
                map.put(reportedUser, l);
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key).size() >= k) {
                for (int j = 0; j < map.get(key).size(); j++) {
                    answer[idList.indexOf(map.get(key).get(j))]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "muzi frodo", "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
    }
}
