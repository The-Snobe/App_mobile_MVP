package com.example.app_mvp;

public interface MainActivityVerified {

    interface View{
    void onSuccess(String message);
    void onError(String message);
    }

    interface Presenter{
        void doLogin(String email, String password);
    }
}
