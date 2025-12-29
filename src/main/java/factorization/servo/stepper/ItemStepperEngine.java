package factorization.servo.stepper;

import net.minecraft.world.World;

import factorization.fzds.Hammer;
import factorization.servo.AbstractServoMachine;
import factorization.servo.ItemServoMotor;
import factorization.shared.Core;

public class ItemStepperEngine extends ItemServoMotor {

    public static int channel = Hammer.hammerInfo
        .makeChannelFor(Core.modId, "stepperengine", 4, -1, "Channel for stepper engines");

    public ItemStepperEngine(String name) {
        super(name);
    }

    @Override
    protected AbstractServoMachine makeMachine(World w) {
        return new StepperEngine(w);
    }
}
