package CoffeeMachine.TechnicalPart.Details;

public class Piston implements Electronics{ //Coffee squeeze piston
    @Override
    public String toString() {
        return "Piston is operational ☑";
    }

    @Override
    public String voltage() {
        return "200V";
    }

    @Override
    public String frequency() {
        return "20kHz";
    }
}
