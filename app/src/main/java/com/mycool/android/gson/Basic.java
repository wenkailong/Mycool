package com.mycool.android.gson;



import com.google.gson.annotations.SerializedName;

/**
 * Created by 狼性人生有点狂 on 2018/6/14.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }


}
