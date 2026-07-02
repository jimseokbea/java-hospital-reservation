package hospital;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class main {
    public static void main(String[] args) {

        /*
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
         */


        Scanner scanner = new Scanner(System.in);

        String[] hospitels = {"예수병원, 전북대 병원, 대자인 병원"};

        while (true) {
            showMenu();

            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("회원 등록 기능입니다.");
            } else if (menu == 2) {
               showHopitals(hospitels);
            } else if (menu == 3) {
                System.out.println("예약하기 기능입니다");
            } else if (menu == 0) {
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
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요 : ");
        }
        public static void showHopitals(String[] hospitels){
            System.out.println("병원 목록");

        for (int i = 0; i< hospitels.length;i++) {
            System.out.println((i + 1) + "." + hospitels[i]);
        }
        }
    }

