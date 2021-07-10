package com.example.myapplication48;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Earthquake {
    private  String mag;
    private  String loc;
    private  String time;
    private String url;

    public Earthquake(String mag, String loc, String time,String url) {
        this.mag = mag;
        this.loc = loc;
        this.time= time;
        this.url=url;
    }
    public String getMag()
    {
        return mag;
    }
    public String getTime()
    {
        String temp=time;
        long timeInMilliseconds = Long.parseLong(temp);
        Date dateObject = new Date(timeInMilliseconds);
        String temp1=formatTime(dateObject);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM dd, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);
        dateToDisplay=dateToDisplay+"  "+temp1;
        return dateToDisplay;
    }
    public String getLoc()
    {
        return loc;
    }
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
    public String getUrl(){
        return url;
    }
}
