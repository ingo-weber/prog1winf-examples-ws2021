package de.tuberlin.sbe.prog1winf.sockets;

import java.io.*;
import java.net.Socket;

/**
 * @author Ingo Weber
 * Diese Klasse implementiert eine einfache Version von "wget"
 */
public class ReadFromURL {
    public static void main(String[] args) throws Exception {
//        String strUrl = "www.google.de";
        String strUrl = "www.heise.de";
        String linesep = System.lineSeparator();

        Socket socket = new Socket(strUrl, 80);
        OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter bw = new BufferedWriter(out);
        InputStreamReader in = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(in);

        System.out.println("**** Request ****");
        String strToSend = "GET / HTTP/1.1" + linesep;
        bw.write(strToSend); System.out.print(strToSend);
        strToSend = "Host: " + strUrl + linesep;
        bw.write(strToSend); System.out.print(strToSend);
        strToSend = linesep; // empty line indicates the end of the header
        bw.write(strToSend); System.out.print(strToSend);
        bw.flush();

        System.out.println("**** Response ****");

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        socket.close();
    }
}