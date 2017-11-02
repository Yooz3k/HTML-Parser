/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parserhd;

/**
 *
 * @author Mat
 */
public class Name {
    int nameID;
    String firstName;
    String secondName;
    
    public Name(int id, String firstName, String secondName)
    {
        nameID = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
