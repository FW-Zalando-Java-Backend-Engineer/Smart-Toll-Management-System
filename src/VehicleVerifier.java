public class VehicleVerifier {

    /**
     * Verifies if a vehicle is allowed to enter the toll system.
     * @param plate The vehicle's license plate number
     * @param isBlacklisted Whether the vehicle is blacklisted
     * @return Access message
     */
    public static String verifyVehicle(String plate, boolean isBlacklisted) {
        // TODO: Deny access if the vehicle is blacklisted
        if (isBlacklisted) {
            return "Access Denied 🚫";
        }
        // TODO: Allow temporary pass if plate starts with "TEMP"
        else if (plate.startsWith("TEMP")) {
            return "Temporary pass";
        }
        // TODO: Otherwise, grant access
        else {
            return "Access Granted ✅";
        }
    }
}
