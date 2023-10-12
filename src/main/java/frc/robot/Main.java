package frc.robot;

import org.victorrobotics.dtlib.DTRobot;

public final class Main {
  private Main() {}

  public static void main(String... args) {
    DTRobot.runRobot(Robot::new);
  }
}
