package com.synature.connection;

public interface ISocketConnection {
    public void send (String msg);
    public String receive();
    public void close();
}
