package mid;

public interface TopNRanker {
  default void insertAll(Player[] players) {
    for (int i = 0; i < players.length; ++i) {
      insert(players[i]);
    }
  }

  void insert(Player player);

  Player delTop();
}
