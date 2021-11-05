package builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan jejuTrip() {
        return tourPlanBuilder
                .title("제주도 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인 이후 몸풀기")
                .addPlan(0, "바다가 보이는 숙소를 잡기")
                .getPlan();
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder
                .title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인 이후 몸풀기")
                .addPlan(0, "바다가 보이는 숙소를 잡기")
                .getPlan();
    }
}
