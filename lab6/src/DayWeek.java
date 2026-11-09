public class DayWeek {
    private int value;

    public DayWeek(){
        value=1;
    }
//    public DayWeek(int value){
//        this.value=value;
//    }
    public int Get(){
        return value;
    }
    public void Set(int value){
        if(value>=1 && value<=7){
            this.value=value;
        }
    }
    public String GetName(){
        String day ="Monday";
        switch (value){
            case 2: day="Tuesday";break;
            case 3: day="Wednesday";break;
            case 4: day="Thursday";break;
            case 5: day="Friday";break;
            case 6: day="Saturday";break;
            case 7: day="Sunday";break;
        }
        return day;
    }

}
