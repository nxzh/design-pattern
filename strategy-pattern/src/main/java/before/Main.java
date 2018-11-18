package before;

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

  public static void main(String[] args) {

    Player[] players = readDataFromSomewhere();
    TopNRanker winRateRanker = new TopThreeWinRateRanker();
    winRateRanker.insertAll(players);

    Player player = null;
    while ((player = winRateRanker.delTop()) != null) {
      System.out.println(
          String.format("id: %s, win rate: %.1f%%", player.getId(), player.getWinRate()));
    }

    System.out.println("==================================");

    TopNRanker kdaRanker = new TopThreeKDARanker();
    kdaRanker.insertAll(players);

    player = null;
    while ((player = kdaRanker.delTop()) != null) {
      System.out.println(
          String.format("id: %s, kda: %.1f", player.getId(), player.getKda()));
    }
  }
}
