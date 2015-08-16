package org.academicreport.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.academicreport.R;

public class LoginFragment extends Fragment {

    private static final String TAG = "Login Fragment";

    private String mParam1;
    private String mParam2;

    public LoginFragment() {}

    public static void launch(FragmentManager fragmentManager) {
        fragmentManager.beginTransaction()
                .add(R.id.container, new LoginFragment(), TAG)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }
}
