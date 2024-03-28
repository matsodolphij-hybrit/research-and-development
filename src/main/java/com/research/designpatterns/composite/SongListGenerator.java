package com.research.designpatterns.composite;

/**
 * What is the composite design pattern?
 * 1. Allows you to treat objects and composition of objects uniformly.
 * 2. They allow you to represent part-whole hierarchies. (any object in a collection is a part of the whole composition and composition as a whole is a collection of parts)
 * 2.1 Components can further be divided into smaller components
 * 3. You can structure data, or represent the inner working of every part of a while object individually.

 */
public class SongListGenerator {

    public static void main(String[] args) {

        SongComponent industrialMusic = new SongGroup(" + Industrial", "description");
        SongComponent heavyMetal = new SongGroup(" + Heavy metal", "description");
        SongComponent rock = new SongGroup(" + Rock", "description");

        SongComponent everySong = new SongGroup("- Song List", "Every song");
        everySong.add(industrialMusic);
        everySong.add(heavyMetal);
        everySong.add(rock);

        industrialMusic.add(new Song("  -- industrial song name 1", "industrial band name 1", 1997));
        industrialMusic.add(new Song("  -- industrial song name 2", "industrial band name 2", 1999));
        heavyMetal.add(new Song("-- heavy metal song name", "heavy metal song name", 2002));
        rock.add(new Song("  -- rock song name", "rock song name", 2001));

        // sub component of rock
        SongComponent heavyRock = new SongGroup("  + Heavy rock sub category", "description");
        heavyRock.add(new Song("    -- This is the heaviest rock song ever", "description", 2017));
        rock.add(heavyRock);

        DiscJockey wietze = new DiscJockey(everySong);
        wietze.getSongList();


    }
}
