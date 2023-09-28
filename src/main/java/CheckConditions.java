public class CheckConditions {
    public static boolean driveRegistration(double yearOld, boolean health) {
        if (!health) return false;
        if (yearOld<0.0) {
            throw new IllegalArgumentException("Year old cannot be negative");
        } else return !(yearOld <= 18.0);
    }
}