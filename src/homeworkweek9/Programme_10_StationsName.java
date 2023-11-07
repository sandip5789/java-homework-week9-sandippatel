package homeworkweek9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 * Created by Sandip Patel
 */

public class Programme_10_StationsName {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the station name: ");
        String stationName = scanner.nextLine();
        Map<String, String> stationLines = getStringStringMap();
        // Closing the scanner object
        scanner.close();



        // Checking the station in the map and print lines
    //public static void printStationLine(String stationName, String stationLine) {
        String lines = stationLines.get(stationName);
        if (lines != null) {
            System.out.println("The station " + stationName + " is on the following lines: " + lines);
        } else {
            System.out.println("The station " + stationName + " is not in Zone 1 or does not exist in the data. ");

        }

    }

    public static Map<String, String> getStringStringMap() {
        Map<String, String> stationLines = new HashMap();


        // Zone1 stations and their lines
        stationLines.put("Baker street", "Metropolitan, Bakerloo, Circle, Jubilee, Hammersmith and City");
        stationLines.put("Oxford Circus", "Central, Bakerloo and Victoria");
        stationLines.put("Piccadilly Circus", "Bakerloo and Piccadilly");
        stationLines.put("Victoria", "District, Circle and Victoria");
        stationLines.put("Waterloo", "Waterloo and City, Bakerloo, Northern and Jubilee");
        stationLines.put("Euston", "Northern, Victoria");
        stationLines.put("London Bridge", "Jubilee, Northern");
        stationLines.put("Holborn", "Central, Piccadilly");
        return stationLines;
    }
}

