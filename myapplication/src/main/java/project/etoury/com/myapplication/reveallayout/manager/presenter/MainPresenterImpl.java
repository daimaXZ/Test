package project.etoury.com.myapplication.reveallayout.manager.presenter;
import java.util.List;

import project.etoury.com.myapplication.reveallayout.manager.model.FindItemsInteractor;
import project.etoury.com.myapplication.reveallayout.manager.model.FindItemsInteractorImpl;
import project.etoury.com.myapplication.reveallayout.manager.view.MainView;

/**
 * Created by shaoze on 2016/3/17.
 */
public class MainPresenterImpl implements MainPresenter, FindItemsInteractor.OnFinishedListener {
    private  MainView mainView;
    private  FindItemsInteractorImpl findItemsInteractor;
    public MainPresenterImpl(MainView mainView) {
       this.mainView = mainView;
        findItemsInteractor = new FindItemsInteractorImpl();
    }
    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }
        findItemsInteractor.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(List<String> items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }
}
