package hospital;

public class main {
    public static void main(String[] args) {

        //
        String userName = "배진석";
        int userAge = 27;

        String hospitName = "전주예수병원";
        String medicalDepartment = "정형외과";
        String resrvationDate = "2027-07-01";
        String resrvationTime = "14:00";

        System.out.println("===병원 예약 정보===");
        System.out.println("예약자 이름 : " + userName);
        System.out.println("예약자 나이 : " + userAge);
        System.out.println("병원 이름 : " + hospitName);
        System.out.println("진료과 : " + medicalDepartment);
        System.out.println("예약일 : " + resrvationDate);
        System.out.println("예약시간 : " + resrvationTime);
    }
}
