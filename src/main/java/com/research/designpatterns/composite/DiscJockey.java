package com.research.designpatterns.composite;

public class DiscJockey {

    SongComponent songList;

    public DiscJockey(final SongComponent newSongList) {
        this.songList = newSongList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
