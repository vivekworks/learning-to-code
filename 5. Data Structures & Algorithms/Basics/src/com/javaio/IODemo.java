package com.javaio;

import java.io.*;

public class IODemo implements Serializable{
    String var = "";
    String dirPath=System.getProperty("user.dir") + "\\Basics\\src\\com\\javaio\\";

    public IODemo() {
        //checkFileInputStream();
        //checkFileOutputStream();
        //checkByteArrayInputStream();
        //checkByteArrayOutputStream();
        //checkFileReader();
        //checkBufferedFileReader();
        //checkFileWriter();
        //checkBufferedWriter();
        //checkPrintWriter();
        //checkPrintBufferedFileWriter();
        //checkObjectOutputStream();
    }

    /**
     * File Input Stream
     */
    public void checkFileInputStream() {
        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Basics\\src\\com\\javaio\\File.txt")) {
            int c;
            while ((c = fis.read()) != -1)
                var += (char) c;
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * File Output Stream
     */
    public void checkFileOutputStream() {
        try (FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\Basics\\src\\com\\javaio\\File1.txt")) {
            byte[] byteArray = var.getBytes();
            for (int i = 0, len = byteArray.length; i < len; i++)
                fos.write(byteArray[i]);
            fos.flush();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    /**
     * ByteArray Input Stream
     */
    public void checkByteArrayInputStream(){
        byte[] values = var.getBytes();
        try(ByteArrayInputStream bais = new ByteArrayInputStream(values)){
            int a;
            while((a = bais.read())!=-1)
                System.out.print((char)a);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * ByteArray Output Stream
     */
    public void checkByteArrayOutputStream(){
        byte[] val = var.getBytes();
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            baos.write(val);
            byte[] b = baos.toByteArray();
            for(byte b1 :b)
                System.out.print((char)b1);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * File Reader
     */
    public void checkFileReader(){
        try(FileReader fw = new FileReader(dirPath+"File.txt")) {
            int line;
            while((line=fw.read())!=-1)
                System.out.print((char)line);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Buffered File Reader
     */
    public void checkBufferedFileReader(){
        try(BufferedReader bw = new BufferedReader(new FileReader(dirPath+"File.txt"))){
            String line;
            while((line=bw.readLine()) != null)
                System.out.println(line);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * File Writer
     */
    public void checkFileWriter(){
        String s = "A lazy brown fox jumps onto an old wall";
        try(FileWriter fw = new FileWriter(dirPath+"File.txt")){
            fw.write(s);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Buffered Writer
     */
    public void checkBufferedWriter(){
        String s = "A lazy brown fox jumps onto an old wall with buffered writer";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(dirPath+"File.txt"))){
            bw.write(s);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Print Writer
     */
    public void checkPrintWriter(){
        String s = "A lazy brown fox jumps onto an old wall with Print writer";
        try(PrintWriter pw = new PrintWriter(dirPath+"File.txt")){
            pw.println(s);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Print Writer + Buffered Writer + File Writer
     */
    public void checkPrintBufferedFileWriter(){
        String[] s = new String[5];
        s[0] = "That's that, then. Both teams head into the World Cup, with a contrasting run of fortunes in white-ball cricket.";
        s[1] = "South Africa flex their all-round muscles, while Sri Lanka look a little lost about combinations, form and other such questions. For the moment, it's goodbye from Wanderers. ";
        s[2] = "This is Debayan Sen, signing off on behalf of scorer Thilak Gowda and the rest of the crew here at ESPNcricinfo. ";
        s[3] = "Go on and follow Delhi vs Mumbai in the IPL, or the Australian chase of another 280-plus target in Sharjah. ";
        s[4] = "Andrew Fidel Fernando's report should land here soon enough as well. Goodbye for now!";
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(dirPath+"combo.txt")),true)){
            for(String line :s)
                pw.println(line);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Object Output Stream
     */
    public void checkObjectOutputStream(){
        IODemo ioDemo = new IODemo();
        ioDemo.dirPath="Great";
        ioDemo.var="Check Buddy";
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dirPath+"serial.log"))){
            oos.writeObject(ioDemo);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Object Input Stream
     */
    public void checkObjectInputStream(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dirPath+"serial.log"))){
            IODemo obj = (IODemo)ois.readObject();
            System.out.println(obj.dirPath+" - "+obj.var);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
