package com.mycool.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 狼性人生有点狂 on 2018/6/14.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public  class  Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }


}
