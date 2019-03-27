package com.motivation.dell.moneymotivation01;

public class EarningWay {

    private String earningWayName;
    private String earningWayDesc;
    private int Thumbnail;


    public EarningWay(String earningWayName, String earningWayDesc, int Thumbnail) {
        this.earningWayName = earningWayName;
        this.earningWayDesc = earningWayDesc;
        this.Thumbnail = Thumbnail;
    }

    public String getEarningWayName() {
        return earningWayName;
    }

    public void setEarningWayName(String earningWayName) {
        this.earningWayName = earningWayName;
    }

    public String getEarningWayDesc() {
        return earningWayDesc;
    }

    public void setEarningWayDesc(String earningWayDesc) {
        this.earningWayDesc = earningWayDesc;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

}
