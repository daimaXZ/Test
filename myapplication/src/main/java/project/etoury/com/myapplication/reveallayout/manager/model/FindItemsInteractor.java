package project.etoury.com.myapplication.reveallayout.manager.model;

import java.util.List;

/**
 * Created by shaoze on 2016/3/18.
 */
public interface FindItemsInteractor {
    interface OnFinishedListener {
        void onFinished(List<String> items);
    }
    void findItems(OnFinishedListener listener);
}
