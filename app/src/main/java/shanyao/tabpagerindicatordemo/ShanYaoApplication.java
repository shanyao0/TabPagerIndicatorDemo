package shanyao.tabpagerindicatordemo;

import android.app.Application;
import android.content.Context;

public class ShanYaoApplication extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    /**
     * 获取全局的context
     */
    public static Context getContext() {
        return mContext;
    }

}
