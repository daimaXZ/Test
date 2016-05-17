package project.etoury.com.myapplication.reveallayout.manager.home;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import project.etoury.com.myapplication.R;
import project.etoury.com.myapplication.reveallayout.manager.presenter.MainPresenterImpl;
import project.etoury.com.myapplication.reveallayout.manager.view.MainView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,MainView {
    private ListView list;
    private ProgressBar progressBar;
    private MainPresenterImpl mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        list = (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(this);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        mainPresenter = new MainPresenterImpl(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mainPresenter.onItemClicked(position);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        list.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        list.setVisibility(View.VISIBLE);
    }

    @Override
    public void setItems(List<String> items) {
        list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.onDestroy();
    }
}
