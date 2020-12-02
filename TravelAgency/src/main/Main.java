package main;

import Agency.Agency;
import system.AgencySystem;
import system.CommandReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        AgencySystem.InitializeSystem();
        CommandReader.Run();


    }
}

