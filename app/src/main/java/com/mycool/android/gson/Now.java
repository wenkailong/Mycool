package com.mycool.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 狼性人生有点狂 on 2018/6/14.
 */

public class Now {
   @SerializedName("tmp")
    public String temperature;
   @SerializedName("cond")
    public More more;

   public class More{
       @SerializedName("txt")
       public String info;
   }

}
