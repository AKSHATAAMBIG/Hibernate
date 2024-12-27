package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "song")//add the table name
public class Song1 {
    @Id // represents primary key of column song_id
    @Column(name = "song_id")// database column name and class field name should same
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Transient if u use this annotation column not stored in the database
    @Column(name = "song_name")
    private String songName;
    @Column(name = "singer")
    private String singer;

    public Song1() {
    }

    public Song1(int id, String songName, String singer) {
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

    @Override
    public String toString() {
        return "Song1{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
