package project.etoury.com.myapplication.reveallayout.manager.view;

/**
 * Created by shaoze on 2016/3/18.
 */
public interface LoginView {
    void showProgress();

    void hideProgress();
    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
