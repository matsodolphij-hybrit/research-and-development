package com.research.designpatterns.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Song extends SongComponent {

    String songName;
    String bandName;
    int releaseYear;

    public Song(final String songName, final String bandName, final int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    public void displaySongInfo() {
        log.atInfo().log("Song info: name = {}, band name = {}, year released = {}", this.songName, this.bandName, this.releaseYear);
    }
}
