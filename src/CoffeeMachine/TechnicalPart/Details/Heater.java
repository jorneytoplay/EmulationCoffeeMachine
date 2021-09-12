package CoffeeMachine.TechnicalPart.Details;

public class Heater implements Electronics{ //Нагреватель
    @Override
    public String toString() {
        return "Heater is operational ☑";
    }

    @Override
    public String voltage() {
        return "250V";
    }

    @Override
    public String frequency() {
        return "25kHz";
    }
}
