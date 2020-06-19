/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class ConnectDB {
    public Connection connect;
    private String severName = "VinhR";
    private String dbName = "JavaTest";
    private String userName = "sa";
    private String passWord = "123";
    private String portNumber = "1433";
    private String url = "jdbc:sqlsever://" + severName + ":" + portNumber + "; database = " + dbName ;
    
    public ConnectDB(){
        connect = null;
    }
    
    public boolean openConnect(){
        if(connect == null){
            try{
                connect = DriverManager.getConnection(url, userName, passWord);
                return true;
            }catch(Exception EX){
                System.out.print("Error: " + EX.getMessage());
            }
        }
        return false;
    }
    
    public void closeConnect(){
        if(connect != null){
            try{
                connect.close();
                connect = null;
                System.out.println("Disconnect sucessful !");
            }catch(Exception EX){
                System.out.print("Error: " + EX.getMessage());
            }
        }
    }

    public Connection getConnect() {
        return connect;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }

    public String getSeverName() {
        return severName;
    }

    public void setSeverName(String severName) {
        this.severName = severName;
    }

    public String getDbname() {
        return dbName;
    }

    public void setDbname(String dbname) {
        this.dbName = dbName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
}
