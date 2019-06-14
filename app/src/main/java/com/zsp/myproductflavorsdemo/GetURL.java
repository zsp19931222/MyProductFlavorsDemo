package com.zsp.myproductflavorsdemo;

import static com.zsp.myproductflavorsdemo.Content.LIGONG_BASE_URL;
import static com.zsp.myproductflavorsdemo.Content.NANNIN_BASE_URL;

/**
 * author：Andy on 2019/6/14 0014-16:30
 * email:zsp872126510@gmail.com
 */

public class GetURL {
    public static String getBaseUrl(){
      int type=BuildConfig.APP_TYPE;
      switch (type){
          case LIGONG_BASE_URL:
             return "https://www.google.com.hk/webhp?hl=zh-CN&sourceid=cnhp&gws_rd=ssl";
          case NANNIN_BASE_URL:
              return "https://www.baidu.com/?tn=62095104_9_oem_dg";
      }
      return "";
    }
}
