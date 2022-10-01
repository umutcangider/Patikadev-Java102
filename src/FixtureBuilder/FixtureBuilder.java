package FixtureBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FixtureBuilder {

    List<String> teamList = new LinkedList<>();

    public void leagueFixturePrint() {
        // If an odd number of team lists are entered, it adds another team named "Bay" team complete the even number.
        if(teamList.size() % 2 != 0) {
            teamList.add("Bay");
        }

        // Prints the team list.
        if(teamList.size() != 0) {
            System.out.println("TAKIMLAR :");
            for(String team : teamList) {
                System.out.println("-" + team);
            }
        } else {
            System.out.println("Listede Takım Bulunamadı");
        }

        round();
    }

    private void round() {
        List<String> teamListWeek = new LinkedList<>();
        int round = 2 * (teamList.size() - 1);

        // Adds the team list team the temporary list.
        List<String> teamListTemp = new LinkedList<>(teamList);
        int value = (teamList.size() / 2);

        // The teams are paired away and away from home.

        for(int i = 1; i < round / 2 + 1; i++) {
            for(int j = 0; j <= value + 2; j += 2) {
                teamListWeek.add(teamListTemp.get(j) + " " + teamListTemp.get(j + 1));
            }

            /*
            The first item of the list is kept constant.the item in the middle of the list becomes the second item in the list. and
            the last item is deleted from the list .The list scrolls to the right.
            */

            teamListTemp.add(1, teamListTemp.get(value));
            teamListTemp.add(value, teamListTemp.get(teamListTemp.size() - 1));
            teamListTemp.remove(teamListTemp.size() - 1);
            teamListTemp.remove(teamListTemp.size() - 2);
        }

        // Teams that have played away are written home. the teams that have played at home are away.

        for(int i = round / 2 + 2; i <= round + 1; i++) {
            for (int j = 0; j <= value + 2; j += 2) {
                teamListWeek.add(teamListTemp.get(j + 1) + " " + teamListTemp.get(j));
            }

            /*
            The first item of the list is kept constant.the item in the middle of the list becomes the second item in the list. and
            the last item is deleted from the list .The list scrolls to the right.
            */

            teamListTemp.add(1, teamListTemp.get(value));
            teamListTemp.add(value, teamListTemp.get(teamListTemp.size() - 1));
            teamListTemp.remove(teamListTemp.size() - 1);
            teamListTemp.remove(teamListTemp.size() - 2);
        }

        int count = 0;
        int num;

        //Prints teams by week.

        for (int i = 1; i <= round ; i++) {
            System.out.println("-----------------------------------\nRound " + i);
            List<String> temp = new LinkedList<>();
            // It assigns matched Teams to the temporary list on a weekly basis.
            for(int j = count; j < count + value; j++) {
                temp.add(teamListWeek.get(j));
            }
            // It shuffles the ranks of the matched teams in the week. presses the screen.
            for (int k = 0; k < value; k++) {
                num = new Random().nextInt(temp.size());
                System.out.println(temp.get(num));
                temp.remove(num);
            }
            count += value;
        }
    }
}
