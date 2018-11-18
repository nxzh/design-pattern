package after;

import java.util.Comparator;

public class Player {
  private String id;
  private double winRate;
  private double killParticipation;
  private double kda;
  private double damaged;

  public Player(String id, double winRate, double killParticipation, double kda, double damaged) {
    this.id = id;
    this.winRate = winRate;
    this.killParticipation = killParticipation;
    this.kda = kda;
    this.damaged = damaged;
  }

  public String getId() {
    return id;
  }

  public double getWinRate() {
    return winRate;
  }

  public double getKillParticipation() {
    return killParticipation;
  }

  public double getKda() {
    return kda;
  }

  public double getDamaged() {
    return damaged;
  }

  public static final Comparator<Player> KDA_COMPARATOR =
      Comparator.comparingDouble(Player::getKda);

  public static final Comparator<Player> WINRATE_COMPARATOR =
      Comparator.comparingDouble(Player::getWinRate);
}
