package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class SensorSubsystem implements Subsystem {
  TalonSRX potMotor;
  CANSparkMax switchMotor;
  DigitalInput limitSwitch;
  DigitalInput photoGate; 
  AnalogPotentiometer potentiometer;

  // Constructor for our subsytem. In this case its the sensorboard
  public SensorSubsystem(CANSparkMax switchMotor, TalonSRX potMotor, DigitalInput limitSwitch, DigitalInput photoGate, AnalogPotentiometer potentiometer) {
    this.switchMotor = switchMotor;
    this.potMotor = potMotor;
    this.limitSwitch = limitSwitch;
    this.photoGate = photoGate;
    this.potentiometer = potentiometer;
  }

  /* These methods will interact with the devices used in the subsystem */

  // Returns the CANSparkMax motor of this subsystem
  public CANSparkMax getSwitchMotor() {
    return switchMotor;
  }

  // Sets the motors value using the CANSparkMax method .set(double speed)
  public void setSwitchMotor(double val) { 
    switchMotor.set(val);
  }

  // Returns the TalonSRX motor of this subsystem
  public TalonSRX getMotor() {
    return potMotor;
  }

  // Sets the motors value using the TalonSRX method .set(double speed)
  public void setPhotoMotor(double val) { 
    potMotor.set(TalonSRXControlMode.PercentOutput, val);
  }

  // Returns the Limitswitch of this subsystem
  public DigitalInput getLimitSwitch() {
    return limitSwitch;
  }

  // Returns the value of the Limitswitch using the method .get()
  public boolean getSwitchValue() {
    return limitSwitch.get();
  }

  // Returns the Photogate of this subsystem
  public DigitalInput getPhotoGate() {
    return photoGate;
  }

  // Returns the value of the Photogate using the method .get()
  public boolean getPhotoGateValue() {
    return photoGate.get();
  }

  // Returns the Potentiometer of this subsystem
  public AnalogPotentiometer getPotentiometer() {
    return potentiometer;
  }

  // Returns the value of the potentiometer using the method .get()
  public double getPotentiometerValue() {
    return potentiometer.get();
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
