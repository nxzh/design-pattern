package mid;

public class TopThreeWinRateRanker extends AbstractTopThreeRanker {

  @Override
  protected boolean less(Player p1, Player p2) {
    return p1.getWinRate() < p2.getWinRate();
  }

  @Override
  protected boolean more(Player p1, Player p2) {
    return p1.getWinRate() > p2.getWinRate();
  }
}
