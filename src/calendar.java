import java.time.LocalDate;

public class calendar {

    public static void getCalender(int year, int month) {

        int date = 1;       // 일
        int day;            // 요일

        LocalDate firstDate = LocalDate.of(year, month, date); //1일
        day = firstDate.getDayOfWeek().getValue();

        // 달력 출력
        System.out.println(month >= 10 ?
                String.format("%d년 %d월", year, month) : String.format("%d년 %02d월", year, month));

        System.out.println("일\t월\t화\t수\t목\t금\t토\t");

        // 시작하는 만큼 공백
        for (int i = 0; i < day % 7; i++) {
            System.out.print("\t");
        }

        for(int i=1; i<=firstDate.lengthOfMonth(); i++) {
            System.out.printf("%02d\t", date++);
            day++;

            if(day % 7 == 0) {                //다음 줄로
                System.out.println();
            }
        }
    }


}
