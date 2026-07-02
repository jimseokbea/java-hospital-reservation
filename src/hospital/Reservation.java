package hospital;

public class Reservation {

    User user;
    Hospital hospital;
    String date;
    String time;

    public Reservation(User user,Hospital hospital,String date, String time){
        this.date=date;
        this.user=user;
        this.time=time;
        this.hospital=hospital;
    }


}
