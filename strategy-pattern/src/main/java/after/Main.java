package after;

import java.util.function.Consumer;

public class Main {
  private static Player[] readDataFromSomewhere() {
    return new Player[] {
      new Player("Faker", 50, 77.4, 4.3, 29.6),
      new Player("uzi", 67.9, 70.1, 5.6, 32.3),
      new Player("Rookie", 77.8, 70.8, 6.8, 26.2),
      new Player("Scout", 61.4, 71.3, 4.8, 25.4),
      new Player("Rekkles", 77.8, 80.2, 13.2, 33.5),
      new Player("Caps", 77.8, 65.2, 4.3, 32.6)
    };
  }

  private static void print(TopNRanker ranker, Consumer<Player> consumer) {
    Player player = null;
    while ((player = ranker.delTop()) != null) {
      consumer.accept(player);
    }
  }

  public static void main(String[] args) {
    Player[] players = readDataFromSomewhere();

    TopThreeRanker winRateRanker = new TopThreeRanker(Player.WINRATE_COMPARATOR);
    winRateRanker.insertAll(players);
    print(
        winRateRanker,
        e ->
            System.out.println(
                String.format("id: %s, win rate: %.1f%%", e.getId(), e.getWinRate())));

    System.out.println("==================================");

    TopThreeRanker kdaRanker = new TopThreeRanker(Player.KDA_COMPARATOR);
    kdaRanker.insertAll(readDataFromSomewhere());
    print(
        kdaRanker,
        e -> System.out.println(String.format("id: %s, kda: %.1f", e.getId(), e.getKda())));

    System.out.println("==================================");

    ButtomThreeRanker buttomKdaRanker = new ButtomThreeRanker(Player.KDA_COMPARATOR);
    buttomKdaRanker.insertAll(readDataFromSomewhere());
    print(
        buttomKdaRanker,
        e -> System.out.println(String.format("id: %s, kda: %.1f", e.getId(), e.getKda())));
  }
}
