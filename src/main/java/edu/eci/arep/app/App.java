/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.arep.app;

/**
 *
 * @author Usuario
 */

import java.io.*;
import java.net.*;
import java.util.regex.*;
import org.apache.commons.io.FilenameUtils;


public class App {
    

 public App() {
        int port = getPort();
        webLoader = new WebLoader();
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Could not listen on port: " + port);
            System.exit(1);
        }
        clientSocket = null;
        out = null;
        in = null;
    }

}
