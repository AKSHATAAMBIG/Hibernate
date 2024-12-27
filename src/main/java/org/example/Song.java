package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "song")//to match the database table name
public class Song {

    @Id // represents primary key of column song_id
    @Column(name = "song_id")// database column name and class field name should same
    private int id;
    @Column(name = "song_name")
    private String songName;
    @Column(name = "singer")
    private String singer;

    public Song() {
    }

    public Song(int id, String songName, String singer) {
        this.id = id;
        this.songName = songName;
        this.singer = singer;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
