package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class SensorSubsystem implements Subsystem {
  CANSparkMax motor;
  DigitalInput limitSwitch;
  AnalogInput potentiometer;

  // Constructor for our subsytem. In this case its the sensorboard
  public SensorSubsystem(CANSparkMax motor, DigitalInput limitSwitch, AnalogInput potentiometer) {
    this.motor = motor;
    this.limitSwitch = limitSwitch;
    this.potentiometer = potentiometer;
  }

  /* These methods will interact with the devices used in the subsystem */

  // Returns the CANSparkMax motor of this subsystem
  public CANSparkMax getMotor() {
    return motor;
  }

  // Sets the motors value using the CANSparkMax method .set(double speed)
  public void setMotor(double val) { 
    motor.set(val);
  }

  // Returns the Limitswitch of this subsystem
  public DigitalInput getLimitSwitch() {
    return limitSwitch;
  }

  // Returns the value of the limitswitch using the method .get()
  public boolean getSwitchValue() {
    return limitSwitch.get();
  }

  public AnalogInput getPotentiometer() {
    return potentiometer;
  }

  public int getPOtentiometerValue() {
    return potentiometer.getValue();
  }

  /* 
  *  We will not be using these methods as most of our devices will updated through our commands.  
  *  We must include them however because we are implementing the subsystem interface 
  */

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
