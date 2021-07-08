package com.acn.reflection;
import javax.annotation.Resource;

@Resource
@MyAnnotation(name = "MySong", description = "I test Annotations!")
public class Song {

    private String name;
    private String band;

    public Song(String name, String band) {
        this.name = name;
        this.band = band;
    }

    public String getName() {
        return this.name;
    }

    public String getBand() {
        return this.band;
    }
}
