package com.example.app_mvp;

public class MainActivityPresenter implements MainActivityVerified.Presenter {
    MainActivityVerified.View view;

    public MainActivityPresenter(MainActivityVerified.View view) {
        this.view = view;
    }
    @Override
    public void doLogin(String email, String password){

        //test login
        //email : superabel000@gmail.com
        //password : MVP2024

        if(email.equals("superabel000@gmail.com") && password.equals("1234Abel")){
            view.onSuccess("Connection reussi!!!");
        }else{
            view.onError("Echec de connection erreur email ou password");
        }
    }
}
