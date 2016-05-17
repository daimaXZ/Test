package project.etoury.com.myapplication.reveallayout.manager.presenter;

import project.etoury.com.myapplication.reveallayout.manager.model.LoginInteractor;
import project.etoury.com.myapplication.reveallayout.manager.model.LoginInteractorImpl;
import project.etoury.com.myapplication.reveallayout.manager.model.OnLoginFinishedListener;
import project.etoury.com.myapplication.reveallayout.manager.view.LoginView;

/**
 * Created by shaoze on 2016/3/18.
 */
public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {
    private  LoginView loginView;
    private final LoginInteractorImpl loginInteractor;

    public LoginPresenterImpl(LoginView loginView){
        this.loginView=loginView;
        loginInteractor = new LoginInteractorImpl();
    }
    @Override
    public void onDestroy() {
        loginView =null;
    }

    @Override
    public void validateCredentials(String username, String password) {
       if (loginView!=null){
           loginView.showProgress();
       }
        loginInteractor.login(username,password,this);
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
