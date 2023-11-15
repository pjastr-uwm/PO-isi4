public class TestTime {

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.houres = 15;
        t1.minutes = 19;
        Time t2 = new Time();
        t2.houres =10;
        t2.minutes = 42;
        Time t3 = t1.addTime(t2);
        System.out.println(t3.houres+":"+t3.minutes);
    }
}

class Time
{
    int houres;
    int minutes;

    Time addTime(Time otherTime){
        this.houres += otherTime.houres;
        this.minutes += otherTime.minutes;
        if (this.minutes > 59)
        {
            this.minutes -= 60;
            this.houres +=1;
        }
        if (this.houres > 23)
        {
            this.houres -= 24;
        }
        Time temp = new Time();
        temp.houres = this.houres;
        temp.minutes = this.minutes;
        return temp;
    }
}
