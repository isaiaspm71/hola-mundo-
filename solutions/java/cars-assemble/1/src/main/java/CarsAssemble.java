class CarsAssemble {

    static double successRate(int speed) {
        if (speed == 0) {
            return 0;
        } else if (speed <= 4) {
            return 1.0;
        } else if (speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else {
            return 0.77; // speed == 10
        }
    }

    static double productionRatePerHour(int speed) {
        return speed * 221 * successRate(speed);
    }

    static int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}