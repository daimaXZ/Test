package project.etoury.com.myapplication.reveallayout.manager.home;

import android.app.Application;
/**
 * Created by shaoze on 2016/4/11.
 */
public class BaseAppli extends Application {
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
//        GLRenderManager.getInstance().initialize(this);
    }
//    @Override
//    public void onTrimMemory(int level) {
//        super.onTrimMemory(level);
//        GLRenderManager.getInstance().trimMemory(level);
//    }
}
