package frc.robot;

import org.victorrobotics.dtlib.DTRobot;
import org.victorrobotics.dtlib.command.Command;
import org.victorrobotics.dtlib.command.NullCommand;

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
  protected Command getAutoCommand() {
    return new NullCommand();
  }

  @Override
  protected Command getSelfTestCommand() {
    return new NullCommand();
  }
}
