package com.research.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SongGroup extends SongComponent {

    private final List<SongComponent> songComponents = new ArrayList<>();

    @Getter
    @Setter
    private String groupName;

    @Getter
    @Setter
    private String groupDescription;

    public SongGroup(final String groupName, final String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public void add(SongComponent songComponent) {
        this.songComponents.add(songComponent);
    }

    public void remove(SongComponent songComponent) {
        this.songComponents.remove(songComponent);
    }

    public SongComponent get(int index) {
        return this.songComponents.get(index);
    }

    @Override
    public void displaySongInfo() {
        log.atInfo().log("Groupname: {} and group description: {}", this.groupName, this.groupDescription);

        for (final SongComponent songComponent : songComponents) {
            songComponent.displaySongInfo();
        }
    }
}
