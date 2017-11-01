/**
 * Project # 2: Creating a Shell Interface Using Java
 * 
 * @author (Constanza Cabrera, ID 1045549) 
 * @class (Operating Systems, CSCI 330)
 */

import java.io.*;
import java.util.ArrayList;

public class SimpleShell3{
    public static void main(String[] args) throws IOException{
        String commandLine;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String MyPath=System.getProperty("user.dir");
        String HomePath=MyPath;
        ArrayList<String> commandHistory=new ArrayList<String>();
        while (true){
            System.out.println(MyPath   );
            System.out.println("jsh>");
            commandLine = console.readLine();
            if (commandLine.equals(""))
                continue;
            if(commandLine.charAt(0)=='!'){
                int tem=0;
                if(commandLine.length()==2&&commandLine.charAt(1)=='*'){
                    for(int i=0;i<commandHistory.size();i++){
                        String a=commandHistory.get(i);
                        System.out.print(i+" "+a+"\n");
                    }
                    continue;
                }
                if(commandLine.length()==2&&commandLine.charAt(1)=='!'){
                    tem=1;
                }
                else{
                    for(int i=1;i<commandLine.length();i++){
                        tem=tem*10+commandLine.charAt(i)-'0';
                    }
                }
                if (tem>commandHistory.size()){
                    System.out.print(tem);
                    System.out.print("Error: Event not found! \n");
                    System.out.print(commandHistory.size());
                    continue;
                }
                else{
                    String exCommand=commandHistory.get(commandHistory.size()-tem);
                    System.out.print(exCommand+"\n");
                    commandLine=exCommand;
                }
            }
            String[] lineSplit = commandLine.split(" ");
            if(lineSplit[0].equalsIgnoreCase("cd")){
                commandHistory.add(commandLine);
                if(lineSplit.length==1 || lineSplit[1].equalsIgnoreCase("~")){
                    MyPath=HomePath;
                }
                else if (lineSplit[1].charAt(0) == '/'){
                    String[] currentSplit = lineSplit[1].split("/");
                    String currentPath = "/";
                    boolean currentFlag=true;
                    for (int i = 1; i < currentSplit.length; i++){
                        ProcessBuilder pb = new ProcessBuilder("ls");
                        File filedir = new File(currentPath);
                        pb.directory(filedir);
                        Process process = pb.start();
                        InputStream is = process.getInputStream();
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr);
                        String line;
                        boolean flag = false;
                        while ((line = br.readLine()) != null){
                            if (currentSplit[i].equalsIgnoreCase(line)){
                                flag = true;
                                break;
                            }
                        }
                        br.close();
                        if (flag){
                            currentPath=currentPath+ "/" +currentSplit[i];
                            continue;
                        }
                        else{
                            System.out.print("Error: Files cannot be found!\n");
                            currentFlag=false;
                            break;
                        }
                    }
                    if(currentFlag){
                        MyPath = lineSplit[1];
                    }
                }
                else if (lineSplit[1].contains("..")){
                    if (lineSplit[1].contains("/")){
                        String[] currentSplit = lineSplit[1].split("/");
                        String currentPath = MyPath;
                        boolean currentFlag=true;
                        if (!currentPath.equals("/")){
                            for (int i = 1; i < currentSplit.length; i++){
                                if (!currentPath.equals("/")){
                                    currentPath = currentPath.substring(0, currentPath.lastIndexOf("/"));
                                }
                                else{
                                    currentPath = "/";
                                }
                            }
                            MyPath = currentPath;
                            System.out.println(MyPath+"For loop");

                        }
                    }else if (MyPath.equals("/")){
                        System.out.println(MyPath+"Else if");
                        MyPath = MyPath.substring(0, MyPath.lastIndexOf("/"));
                    }
                }
                else{
                    String[] currentSplit = lineSplit[1].split("/");
                    String currentPath = MyPath;
                    boolean currentFlag=true;
                    for (int i = 0; i < currentSplit.length; i++){
                        ProcessBuilder pb = new ProcessBuilder("ls");
                        File filedir = new File(currentPath);
                        pb.directory(filedir);
                        Process process = pb.start();
                        InputStream is = process.getInputStream();
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr);
                        String line;
                        boolean flag = false;
                        while ((line = br.readLine()) != null) {
                            if (currentSplit[i].equalsIgnoreCase(line)){
                                flag = true;
                                break;
                            }
                        }
                        br.close();
                        if (flag){
                            currentPath=currentPath+ "/" + currentSplit[i];
                            continue;
                        }    
                        else{
                            System.out.print("Error: Files cannot be found!\n");
                            currentFlag=false;
                            break;
                        }
                    }
                    if(currentFlag){
                        MyPath = MyPath + "/" + lineSplit[1];
                    }
                }
            }
            else if(lineSplit.length==1&&lineSplit[0].equalsIgnoreCase("exit")){
                System.out.println("Goodbye!");
                commandHistory.clear();
                System.exit(0);
            }
            else{
                try{
                    commandHistory.add(commandLine);
                    ProcessBuilder pb = new ProcessBuilder(lineSplit);
                    File filedir=new File(MyPath);
                    pb.directory(filedir);
                    Process process = pb.start();
                    InputStream is = process.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);
                    String line;
                    while ( (line = br.readLine()) != null)
                        System.out.println(line);
                    br.close();
                }
                catch(Exception e){
                    commandLine=null;
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}