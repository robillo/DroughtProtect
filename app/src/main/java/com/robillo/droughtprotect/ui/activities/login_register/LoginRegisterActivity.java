package com.robillo.droughtprotect.ui.activities.login_register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.robillo.droughtprotect.R;
import com.robillo.droughtprotect.ui.activities.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginRegisterActivity extends BaseActivity implements LoginRegisterMvpView {

    @BindView(R.id.register)
    TextView registerButton;

    @BindView(R.id.login)
    TextView loginButton;

    @BindView(R.id.register_layout)
    LinearLayout registerLayout;

    @BindView(R.id.login_layout)
    LinearLayout loginLayout;

    @BindView(R.id.go_to_login)
    TextView goToLogin;

    @BindView(R.id.go_to_register)
    TextView goToRegister;

    @BindView(R.id.email_register)
    EditText registerEmail;

    @BindView(R.id.email_login)
    EditText loginEmail;

    @BindView(R.id.password_register)
    EditText registerPassword;

    @BindView(R.id.password_login)
    EditText loginPassword;

    @BindView(R.id.header)
    TextView header;

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
        if(toggle == LoginRegisterMvpView.REGISTER) {
            loginLayout.setVisibility(View.GONE);
            registerLayout.setVisibility(View.VISIBLE);
            header.setText(getString(R.string.register));
        }
        else if(toggle == LoginRegisterMvpView.LOGIN){
            loginLayout.setVisibility(View.VISIBLE);
            registerLayout.setVisibility(View.GONE);
            header.setText(getString(R.string.login));
        }
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
        toggleLoginRegister(0);
    }

    @OnClick(R.id.go_to_register)
    public void setGoToRegister() {
        toggleLoginRegister(1);
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
