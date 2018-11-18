package mid;

public class TopThreeKDARanker extends AbstractTopThreeRanker {

  @Override
  protected boolean less(Player p1, Player p2) {
    return p1.getKda() < p2.getKda();
  }

  @Override
  protected boolean more(Player p1, Player p2) {
    return p1.getKda() > p2.getKda();
  }
}
