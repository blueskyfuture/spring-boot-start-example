package com.bluesky.starter;

public class HelloService {
    private BlueskyProperties properties;

    public String sayHello(String name) {
        return properties.getPrefix() + "--" + name + "--" + properties.getSuffix();
    }

    public BlueskyProperties getProperties() {
        return properties;
    }

    public void setProperties(BlueskyProperties properties) {
        this.properties = properties;
    }
}
