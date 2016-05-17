package project.etoury.com.myapplication.reveallayout.manager.model;

/**
 * Created by shaoze on 2016/3/18.
 */
public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
