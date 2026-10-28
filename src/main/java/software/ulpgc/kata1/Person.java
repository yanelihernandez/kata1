package software.ulpgc.kata1;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {

    private static final double DAYS_PER_YEAR = 365.25;

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
