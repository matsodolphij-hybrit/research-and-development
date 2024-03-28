package com.research.designpatterns.composite;

public abstract class SongComponent {

    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void removeComponent(SongComponent newSongComponent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public SongComponent getSongComponent() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException("Not implemented");
    }

}
