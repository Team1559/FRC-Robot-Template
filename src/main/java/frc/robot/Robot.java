package frc.robot;

import org.victorrobotics.dtlib.DTRobot;
import org.victorrobotics.dtlib.command.DTCommand;
import org.victorrobotics.dtlib.command.DTNullCommand;

public final class Robot extends DTRobot {
  public Robot() {}

  @Override
  protected void init() {}

  @Override
  protected void simulationInit() {}

  @Override
  protected void bindCommands() {}

  @Override
  protected void periodic() {}

  @Override
  protected DTCommand getAutoCommand() {
    return new DTNullCommand();
  }

  @Override
  protected DTCommand getSelfTestCommand() {
    return new DTNullCommand();
  }
}
