package org.academicreport.activity;

import android.app.SearchManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.academicreport.R;
import org.academicreport.activity.Base.BaseActivity;
import org.academicreport.fragment.LoginFragment;
import org.academicreport.util.SessionManager;


public class MainActivity extends BaseActivity {

    private SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginCheck();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void LoginCheck() {
        if(!sessionManager.isLoggedIn()) {
            LoginFragment.launch(getFragmentManager());
        }
    }
}
