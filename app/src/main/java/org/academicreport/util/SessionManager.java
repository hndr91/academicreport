package org.academicreport.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class SessionManager {

    /**
     * Properties
     */
    private static final String PREF_NAME = "AkademikLogin";
    private static final String KEY_IS_LOGGEDIN = "isLoggedIn";
    private static final String KEY_STU_NUMBER ="student_number";
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context context;
    private int PRIVATE_MODE = 0;



    public SessionManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setLogin(boolean isLoggedIn) {
        editor.putBoolean(KEY_IS_LOGGEDIN, isLoggedIn);
        editor.commit();
    }

    public boolean isLoggedIn(){
        return pref.getBoolean(KEY_IS_LOGGEDIN, false);
    }

    public void setStudentNumber(String studentNumber) {
        editor.putString(KEY_STU_NUMBER, studentNumber);
        editor.commit();
    }

    public String getStudentNumber() {
        return pref.getString(KEY_STU_NUMBER, "");
    }
}
