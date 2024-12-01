package com.signomix.proprietary;

public class ExtensionPoints {

    /**
     * Returns the number of starting points (founded by the service owner) for the given account type.
     * @return
     */
    public int getStartingPoints() {
        return 0;
    }   

    /**
     * Are starting points refundable every month?
     * @return
     */
    boolean isStartingPointsRefundable() {
        return false;
    }

    /**
     * Are extended features require extension points?
     * @return
     */
    public boolean isControlled() {
        return false;
    }

    /**
     * Are extended features available for free accounts?
     * @return
     */
    public boolean isAvailableForFreeAccount() {
        return false;
    }
    
    /**
     * Returns the value of a point in the given currency.
     * @param currency
     * @return
     */
    public double getPointValueByCurrency(String currency) {
        switch (currency.toLowerCase()) {
            case "eur":
                return 0.0;
            case "pln":
                return 0.0;
            default:
                return 0.0;
        }
    }

    /**
     * Returns the number of points required to send an SMS.
     * @return
     */
    public int getPointsForSMS() {
        return 2;
    }
}
