package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @author scyking
 **/
public class TestSocketServer {

    public static void startTest() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8091);
        serverSocket.setSoTimeout(10000);
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
                try {
                    Socket server = serverSocket.accept();
                    System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                    DataInputStream in = new DataInputStream(server.getInputStream());
                    System.out.println(in.readUTF());
                    DataOutputStream out = new DataOutputStream(server.getOutputStream());
                    out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                    server.close();
                } catch (SocketTimeoutException e) {
                    System.out.println("Socket timed out!");
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
            }
        });
        t.run();
    }

    public static void main(String[] args) {
        try {
            TestSocketServer.startTest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
