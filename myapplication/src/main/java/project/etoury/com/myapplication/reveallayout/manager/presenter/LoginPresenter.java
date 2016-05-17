package project.etoury.com.myapplication.reveallayout.manager.presenter;

/**
 * Created by shaoze on 2016/3/18.
 */
public interface LoginPresenter {
    void onDestroy();
    void validateCredentials(String username, String password);
}
