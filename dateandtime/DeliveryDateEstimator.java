package Zohocodinground.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class DeliveryDateEstimator {
    public static void main(String[] args) {

        Set<LocalDate> holidays = new HashSet<>();
        holidays.add(LocalDate.of(2025, 9, 2));
        holidays.add(LocalDate.of(2025, 9, 2));

        LocalDate deliveryDate = estimateDeliveryDate(LocalDate.of(2025,  9, 1), 9, holidays);

        System.out.println(deliveryDate);


    }

    public static LocalDate estimateDeliveryDate(LocalDate startDate, int workingDays, Set<LocalDate> holidays) {
        LocalDate currentDate = startDate;
        int daysAdded = 0;

        while (daysAdded < workingDays) {
            currentDate = currentDate.plusDays(1);

            DayOfWeek day = currentDate.getDayOfWeek();
            boolean isWeekend = (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY);
            boolean isHoliday = holidays.contains(currentDate);

            if (!isHoliday && !isWeekend) daysAdded++;
        }

        return currentDate;
    }
}
