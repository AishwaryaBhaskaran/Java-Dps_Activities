
package \;
import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

    @Override
    public int compare(Team a, Team b) {
        if (a.getNumberOfMatches() > b.getNumberOfMatches()) {
            return 1;
        } else if (a.getNumberOfMatches() < b.getNumberOfMatches()) {
            return -1;
        }
        return 0;
    }

}