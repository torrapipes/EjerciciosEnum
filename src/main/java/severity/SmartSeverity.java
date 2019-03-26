package severity;

public enum SmartSeverity {

    LOW(30), MEDIUM(15), HIGH(7), URGENT(1);

    // Declare an instance variable
    private int projectedTurnaroundDays;


    // Declare a private constructor
    // Los constructores de enums no pueden ser ni public ni protected.
    private SmartSeverity(int projectedTurnaroundDays) {
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }

    // Declare a public method to get the turnaround days
    public int getProjectedTurnaroundDays() {
        return projectedTurnaroundDays;
    }

    // Ya no es necesario un switch, ya que cada constante sabe sus projectedTurnaroundDays

}