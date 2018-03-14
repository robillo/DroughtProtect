package com.robillo.droughtprotect.ui.activities.login_register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.robillo.droughtprotect.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginRegisterActivity extends AppCompatActivity implements LoginRegisterMvpView {

    @BindView(R.id.register)
    Button registerButton;

    @BindView(R.id.login)
    Button loginButton;

    @BindView(R.id.register_layout)
    Button registerLayout;

    @BindView(R.id.login_layout)
    Button loginLayout;

    @BindView(R.id.go_to_login)
    TextView goToLogin;

    @BindView(R.id.go_to_register)
    TextView goToRegister;

    @BindView(R.id.email_register)
    Button registerEmail;

    @BindView(R.id.email_login)
    Button loginEmail;

    @BindView(R.id.password_register)
    Button registerPassword;

    @BindView(R.id.password_login)
    Button loginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        setup();
    }

    @Override
    public void setup() {
        ButterKnife.bind(this);
    }

    @Override
    public void toggleLoginRegister(int toggle) {

    }

    @OnClick(R.id.register)
    public void setRegisterButton() {

    }

    @OnClick(R.id.login)
    public void setLoginButton() {

    }

    @OnClick(R.id.register_layout)
    public void setRegisterLayout() {

    }

    @OnClick(R.id.login)
    public void setLoginLayout() {

    }

    @OnClick(R.id.go_to_login)
    public void setGoToLogin() {

    }

    @OnClick(R.id.go_to_register)
    public void setGoToRegister() {

    }

    @OnClick(R.id.email_register)
    public void setRegisterEmail() {

    }

    @OnClick(R.id.email_login)
    public void setLoginEmail() {

    }

    @OnClick(R.id.password_register)
    public void setRegisterPassword() {

    }

    @OnClick(R.id.password_login)
    public void setLoginPassword() {

    }
}
