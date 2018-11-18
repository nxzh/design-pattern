package before;

public class TopThreeKDARanker implements TopNRanker {
  private Player[] top3 = new Player[3];
  private int min = -1;
  private int n = 0;

  private int getMin() {
    if (n == 0) {
      return -1;
    }
    int min = 0;
    for (int i = 1; i < n; ++i) {
      if (top3[min].getKda() > top3[i].getKda()) {
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
    if (top3[min].getKda() < player.getKda()) {
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
      if (top3[max].getKda() < top3[i].getKda()) {
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
}
