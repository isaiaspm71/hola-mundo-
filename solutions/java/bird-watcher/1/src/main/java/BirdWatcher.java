class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int dia : birdsPerDay) {
            if (dia == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
    int total = 0;
    int limite = Math.min(numberOfDays, birdsPerDay.length);
    for (int i = 0; i < limite; i++) {
        total += birdsPerDay[i];
    }
    return total;
}

    public int getBusyDays() {
        int contador = 0;
        for (int dia : birdsPerDay) {
            if (dia >= 5) {
                contador++;
            }
        }
        return contador;
    }
}