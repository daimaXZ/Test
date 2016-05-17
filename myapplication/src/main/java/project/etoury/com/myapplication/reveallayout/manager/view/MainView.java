package project.etoury.com.myapplication.reveallayout.manager.view;

import java.util.List;

/**
 * Created by shaoze on 2016/3/17.
 */
public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);

}
