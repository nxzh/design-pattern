package after;

import java.util.Comparator;

public class ButtomThreeRanker extends TopThreeRanker {

  public ButtomThreeRanker(Comparator<Player> comparator) {
    super(comparator);
  }

  @Override
  protected boolean less(Player p1, Player p2) {
    return super.more(p1, p2);
  }

  @Override
  protected boolean more(Player p1, Player p2) {
    return super.less(p1, p2);
  }
}
