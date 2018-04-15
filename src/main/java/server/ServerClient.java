package server;


import Ui.UiController;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerClient {
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message="default";
    private String serverIP;
    private Socket connection;
    private UiController uiController;
    //constructor
    public ServerClient(String host){
        serverIP = host;

    }

    public void startRunning(){
        try{
            connecctToServer();
            setupStreams();
            whileConnected();
        }catch (EOFException ex){
            showMessage("\n Client Terminated the Connection\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            closeConnection();
        }
    }

    private void connecctToServer() throws  IOException{
        System.out.print("\nWaiting for Connection...\n");
        connection=server.accept();
        System.out.print("\nConnected to Server"+connection.getInetAddress().getHostName()+"\n");
    }

    //set-up Streams: send and recieve data
    private void setupStreams() throws IOException{
        //output
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();

        //input
        input = new ObjectInputStream(connection.getInputStream());

        System.out.print("\nStreams are ready...\n");
    }

    // /whileConnected - during connection
    private void whileConnected() throws IOException{
        String message = " You are now Connected!" ;
        System.out.print("\n"+message+"\n");
        do{
            try{
                message = (String) input.readObject();
                System.out.print("\nMessage..."+message+"\n");
            }catch (ClassNotFoundException ex){
                System.out.print("\nInvalid Message...\n");
            }
        }while(!message.equals("CLIENT-END"));
    }

    //close Connection
    public void closeConnection()throws  IOException{
        System.out.print("\nClosing Connection\n");
        try{
            output.close();
            input.close();
            connection.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    //updates main Window
    public void showMessage(final String text){
        this.uiController.getUiTextArea().appendText(text);
    }
}
