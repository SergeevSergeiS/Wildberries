package ru.internet.sergeevss90.config;

import org.aeonbits.owner.ConfigFactory;
import ru.internet.sergeevss90.config.CredentialsConfig;

public class Credentials {
    public static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    public static boolean isRemoteWebDriver() {
        return !config.remote().equals("");
    }
}