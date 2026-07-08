# hospital-reservation-console

Java 기초 문법을 학습하면서 병원 예약 콘솔 프로그램을 만드는 프로젝트이다.

## 변수

### 오늘 배운 내용

- String 타입으로 글자 데이터를 저장했다.
- int 타입으로 숫자 데이터를 저장했다.
- 변수에 사용자 이름, 병원 이름, 진료 과목, 예약 날짜, 예약 시간을 저장했다.
- System.out.println으로 예약 정보를 콘솔에 출력했다.

### 병원 예약 서비스와 연결

병원 예약 서비스에는 사용자, 병원, 예약 정보가 필요하다.

오늘은 이 데이터를 변수로 표현했다.

- userName: 예약자 이름
- userAge: 예약자 나이
- hospitalName: 병원 이름
- department: 진료 과목
- reservationDate: 예약 날짜
- reservationTime: 예약 시간

### 다음에 발전시킬 내용

- 조건문을 사용해서 메뉴를 선택하게 만들기
- 반복문을 사용해서 프로그램이 계속 실행되게 만들기
- 배열을 사용해서 여러 병원 목록 만들기

## 조건문

### 오늘 배운 내용

- if, else if, else 조건문을 학습했다.
- Scanner를 사용해서 사용자의 메뉴 번호를 입력받았다.
- 입력한 메뉴 번호에 따라 다른 기능이 실행되도록 만들었다.
- 잘못된 번호를 입력했을 때 예외 메시지를 출력했다.

### 병원 예약 서비스와 연결

조건문을 사용해서 병원 예약 콘솔 프로그램의 메뉴 선택 기능을 만들었다.

- 1번: 회원 등록
- 2번: 병원 목록 보기
- 3번: 예약하기
- 0번: 종료
- 그 외 번호: 잘못된 메뉴 처리

### Spring Boot로 발전하면

- 회원 등록 기능은 POST /users API로 발전한다.
- 병원 목록 보기 기능은 GET /hospitals API로 발전한다.
- 예약하기 기능은 POST /reservations API로 발전한다.


## 반복문

- while 반복문을 사용해서 메뉴가 계속 출력되도록 만들었다.
- 0번을 입력하면 break로 프로그램이 종료되도록 만들었다.
- 사용자가 여러 기능을 연속으로 선택할 수 있게 만들었다.

### 병원 예약 서비스와 연결

콘솔 프로그램에서는 while 반복문으로 프로그램이 계속 실행된다.
나중에 Spring Boot에서는 서버가 계속 실행되면서 사용자의 API 요청을 기다리는 구조로 발전한다.

## 배열과 for문

- 배열을 사용해서 여러 병원 이름을 저장했다.
- for문을 사용해서 병원 목록을 하나씩 출력했다.
- hospitals.length를 사용해서 배열 길이만큼 반복했다.

### 병원 예약 서비스와 연결

처음에는 배열에 병원 목록을 저장하지만, 나중에는 다음 구조로 발전한다.

- 배열 → ArrayList
- ArrayList → Repository
- Repository → MySQL 데이터베이스
- MySQL 데이터베이스 → JPA Entity와 Repository

## 클래스와 객체

### 오늘 배운 내용

- class를 사용해서 User, Hospital, Reservation의 설계도를 만들었다.
- 각 클래스에 필드(name, age, phone, department 등)를 정의했다.
- 생성자를 만들어서 객체를 생성할 때 값을 넣도록 했다.
- this 키워드로 필드와 매개변수를 구분했다.
- new 키워드로 객체를 생성했다.
- Reservation 클래스가 User와 Hospital을 필드로 가지게 해서 객체끼리 연결했다.

### 병원 예약 서비스와 연결

흩어져 있던 변수들을 관련 있는 것끼리 클래스로 묶었다.

예약(Reservation)은 예약자(User)와 병원(Hospital)을 조합해서 표현했다.

- User: 예약자 정보
- Hospital: 병원 정보
- Reservation: User + Hospital + 날짜 + 시간

### Spring Boot / JPA로 발전하면

- User, Hospital, Reservation 클래스는 JPA Entity로 발전한다.
- 객체 간의 연결은 연관관계 매핑(@ManyToOne, @OneToMany)으로 발전한다.

## 예약 취소

### 오늘 배운 내용

- 예약 취소 메뉴를 추가했다.
- 예약이 없을 때는 "취소할 예약이 없습니다."를 출력하도록 만들었다.
- 예약이 있을 때는 reservation 값을 null로 바꿔 예약을 취소했다.
- 예약 취소 후 내 예약 보기를 실행하면 "예약 내역이 없습니다."가 출력되도록 만들었다.

### 병원 예약 서비스와 연결

콘솔 프로젝트에서는 reservation = null로 예약 정보를 비운다.

나중에 Spring Boot/JPA에서는 실제 데이터를 삭제하기보다 예약 상태를 변경하는 방식으로 발전한다.

- 현재 콘솔 방식: reservation = null
- Spring Boot 발전: reservation.cancel()
- JPA 발전: status = CANCELED