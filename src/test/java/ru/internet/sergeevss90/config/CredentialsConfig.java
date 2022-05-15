package ru.internet.sergeevss90.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:credentials.properties"
})
public interface CredentialsConfig extends Config {

    @Key("user")
    String user();

    @Key("password")
    String password();

    @Key("remote")
    @DefaultValue("")
    String remote();

    String videoStorage();
}