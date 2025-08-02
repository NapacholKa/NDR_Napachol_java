public class Time {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public Time(int hour, int minute, int second){
        // this.hour = hour;
        // this.minute = minute;
        // this.second = second;
        setTime(hour, minute, second);
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour) {
        if(hour < 0  || hour > 24){
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        }
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if(minute < 0  || minute > 60){
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        }
        this.minute = minute;
    }
    public void setSecond(int second) {
        if(second < 0 || second > 60){
            throw new IllegalArgumentException("Second must be between 0 and 59.");
        }
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return String.format("%02d%02d%2d", hour,minute,second);
    }

    //Advance the time by one second
    //Returns the current objectto allow for method chaining.
    //Return the current Time object

    public Time nextsecond(){
        this.second++;
        if(this.second == 60 ){
            this.second = 0;
            this.minute++;
            if(this.minute==60){
                this.minute = 0;
                this.hour++;
                if(this.hour == 24){
                    this.hour = 0;
                }

            }
        }
        return this;
    }
}

