package com.example.satan.daggerdemo;;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by alpine on 7/20/16.
 */

@Singleton
@Component(modules = {LoginHandlerModule.class})
public interface LoginHandlerComponent {
    LoginHandler provideLoginHandler();
}
