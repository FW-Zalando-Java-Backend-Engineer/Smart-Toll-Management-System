public class DiscountEngine {

    /**
     * Applies discount to the toll amount for frequent users.
     * @param tollAmount Original toll amount
     * @param isFrequentUser True if the user is a frequent traveler
     * @return Discounted toll amount if applicable
     */
    public static double applyDiscount(double tollAmount, boolean isFrequentUser) {
        // TODO: Use ternary operator to apply 10% discount for frequent users
        return isFrequentUser ? tollAmount * 0.90 : tollAmount;
    }
}
