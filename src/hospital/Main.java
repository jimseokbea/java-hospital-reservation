package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        User user = new User("배진석",27,"010-6389--2983");

            Hospital[] hospitels = {
                    new Hospital("예수병원","정형외과","전주시 덕진구"),
                            new Hospital("전북대 병원","내과","전주시 완산구"),
                            new Hospital("대자인 병원","심장내과","서울시 중구")
                    };

            Reservation reservation =null;

        while (true) {
            showMenu();

            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("회원정보");
                System.out.println("이름:" + user.name);
                System.out.println("나이:" + user.age);
                System.out.println("폰번호:" + user.phone);
            } else if (menu == 2) {
               showHopitals(hospitels);
            } else if (menu == 3) {
                showHopitals(hospitels);
                System.out.println("예약할 번호를 선택하세요: ");
                int hospitaNumber = scanner.nextInt();
                if (hospitaNumber < 1 || hospitaNumber > hospitels.length){
                    System.out.println("잘못된 번호입니다.");
                }else {
                    Hospital selectedHospital = hospitels[hospitaNumber - 1];
                    reservation = new Reservation(user, selectedHospital,"2026-07-02","14:00");

                    System.out.println("예약이 완료되었습니다.");
                    System.out.println("예약자: " + reservation.user.name);
                    System.out.println("병원: " + reservation.hospital.name);
                    System.out.println("진료과목: " + reservation.hospital.department);
                    System.out.println("예약 날짜: " + reservation.date);
                    System.out.println("예약 시간: " + reservation.time);
                }
            } else if (menu == 4) {
                if (reservation == null) {
                    System.out.println("예약 내역이 없습니다.");
                } else {
                    System.out.println("=== 내 예약 정보 ===");
                    System.out.println("예약자: " + reservation.user.name);
                    System.out.println("병원: " + reservation.hospital.name);
                    System.out.println("진료과목: " + reservation.hospital.department);
                    System.out.println("주소: " + reservation.hospital.address);
                    System.out.println("예약 날짜: " + reservation.date);
                    System.out.println("예약 시간: " + reservation.time);
                }
            } else if (menu == 0){
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
            System.out.println();
        }
        scanner.close();
    }
        public static void showMenu() {
            System.out.println("== 병원 예약콘솔 프로그램 ==");
            System.out.println("1. 회원등록");
            System.out.println("2. 병원 목록 보기");
            System.out.println("3. 예약하기");
            System.out.println("4. 내 예약보기");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요 : ");
        }
        public static void showHopitals(Hospital[] hospitels){
            System.out.println("병원 목록");

        for (int i = 0; i< hospitels.length;i++) {
            System.out.println((i + 1) + "." + hospitels[i].name);
            System.out.println("    진료과목:"  + hospitels[i].department);
            System.out.println("    주소:"  + hospitels[i].address);
        }
        }
    }

