package CoffeeMachine.TechnicalPart.Details;

public class ControlPanel implements Electronics{ //Панель управления
    @Override
    public String toString() {
        return "Control panel is operational ☑";
    }

    @Override
    public String voltage() {
        return "50V";
    }

    @Override
    public String frequency() {
        return "5kHz";
    }
}
