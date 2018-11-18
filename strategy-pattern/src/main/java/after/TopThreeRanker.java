package after;

import java.util.Comparator;

public class TopThreeRanker implements TopNRanker {
  private Player[] top3 = new Player[3];
  private int min = -1;
  private int n = 0;
  private Comparator<Player> comparator;

  public TopThreeRanker(Comparator<Player> comparator) {
    this.comparator = comparator;
  }

  private int getMin() {
    if (n == 0) {
      return -1;
    }
    int min = 0;
    for (int i = 1; i < n; ++i) {
      if (more(top3[min], top3[i])) {
        min = i;
      }
    }
    return min;
  }

  public void insert(Player player) {
    if (n < 3) {
      top3[n++] = player;
      min = getMin();
      return;
    }
    if (less(top3[min], player)) {
      top3[min] = player;
      min = getMin();
    }
  }

  public Player delTop() {
    if (n == 0) {
      return null;
    }
    int max = 0;
    for (int i = 1; i < n; ++i) {
      if (less(top3[max], top3[i])) {
        max = i;
      }
    }
    Player ret = top3[max];
    for (int i = max; i < n - 1; ++i) {
      top3[i] = top3[i + 1];
    }
    top3[--n] = null;
    return ret;
  }

  protected boolean less(Player p1, Player p2) {
    return comparator.compare(p1, p2) < 0;
  }

  protected boolean more(Player p1, Player p2) {
    return comparator.compare(p1, p2) > 0;
  }
}
