package com.robillo.droughtprotect.ui.activities.login_register;

/**
 * Created by robinkamboj on 15/03/18.
 */

public interface LoginRegisterMvpView {

    final int LOGIN = 0;
    final int REGISTER = 1;

    void setup();

    void toggleLoginRegister(int toggle);
}
