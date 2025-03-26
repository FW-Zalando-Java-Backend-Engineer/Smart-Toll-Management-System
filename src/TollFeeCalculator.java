public class TollFeeCalculator {

    /**
     * Calculates toll fee based on vehicle type and distance.
     * @param vehicleType The type of vehicle ("car", "truck", "motorcycle")
     * @param distance The distance traveled in kilometers
     * @return The total toll fee, or -1 for invalid vehicle types
     */
    public static double calculateToll(String vehicleType, double distance) {
        // TODO: Initialize rate variable based on vehicle type using switch
        double rate = 0;

        switch (vehicleType.toLowerCase()) {
            case "car":
                // TODO: Set rate for car
                rate = 2;
                break;
            case "truck":
                // TODO: Set rate for truck
                rate = 4;
                break;
            case "motorcycle":
                // TODO: Set rate for motorcycle
                rate = 1;
                break;
            default:
                // TODO: Return -1 for invalid vehicle types
                return -1;
        }

        // TODO: Calculate base toll
        double toll = rate * distance;

        // TODO: Add 5% surcharge if distance > 100
        if (distance > 100) {
            toll += toll * 0.05;
        }

        return toll;
    }
}
