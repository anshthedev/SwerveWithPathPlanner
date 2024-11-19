package frc;
import frc.MCRCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.IntakeSubsystem;

/*This command enables the intake */
public class StartIntake implements MCRCommand{
    @Override
    public void run(){
        SmartDashboard.putString("auto", "enables intake");
        IntakeSubsystem.getInstance().setAlreadyStopped(false);
        IntakeSubsystem.getInstance().startIntake();
        // i_intake.setIntakeTrue();
        
    }

    @Override
    public boolean isFinished(){
        if(!IntakeSubsystem.getInstance().noteAcquired()){
            return true;
        }
        return false;
    }
}