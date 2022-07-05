package com.example.musicbookstoresantsg.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
public class MusicAlbumModel extends ProductModel{

    @Id
    @GeneratedValue
    private int numberOfSongs;
    private String singerName;
}
