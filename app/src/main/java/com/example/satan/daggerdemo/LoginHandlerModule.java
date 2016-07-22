package com.example.satan.daggerdemo;;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alpine on 7/20/16.
 */
@Module
public class LoginHandlerModule {

    @Provides @Singleton
    PasswordChecker providePasswordChecker() {
        return new PasswordChecker();
    }

    @Provides @Singleton
    LoginHandler provideLoginHandler() {
        return new LoginHandler(new PasswordChecker());
    }
}
