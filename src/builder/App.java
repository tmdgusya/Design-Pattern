package builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
            TourPlan tourPlan = new TourPlan();
            tourPlan.setTitle("제주도 여행");
            tourPlan.setNights(2);
            tourPlan.setDays(3);
            tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
            tourPlan.setWhereToStay("리조트");
            tourPlan.addPlain(0, "체크인 이후 몸풀기");
            tourPlan.addPlain(0, "저녁 식사");
            tourPlan.addPlain(1, "조식 부페에서 식사");
            tourPlan.addPlain(1, "해변가 산책");
            tourPlan.addPlain(1, "점심은 수영장 근처 음식점에서 먹기");
            tourPlan.addPlain(1, "리조트 수영장에서 놀기");
            tourPlan.addPlain(1, "저녁은 BBQ 식당에서 스테이크");
            tourPlan.addPlain(2, "조식 부페에서 식사");
            tourPlan.addPlain(2, "체크아웃");
    }

}
