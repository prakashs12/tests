/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.datanucleus.samples.jdo.cassandra;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * 
 * @author bergun
 */
@PersistenceCapable
public class Song
{

    @PrimaryKey
    @Persistent(customValueStrategy = "uuid")
    private String id;

    @SuppressWarnings("unused")
    private String title;

    @SuppressWarnings("unused")
    private String album;

    @SuppressWarnings("unused")
    private String artist;

    @Persistent
    private byte[] data;

}
