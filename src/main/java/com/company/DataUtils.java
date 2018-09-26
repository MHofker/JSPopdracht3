package com.company;

import java.util.ArrayList;

/**
 * Utility cLass to retrieve hard-coded data.
 * Class contains only static methods so no need to instanciate
 */
public class DataUtils {

    /**
     * @return hard-coded list of cars
     *
     */
    public static ArrayList<Auto> getAutolijst() {
        ArrayList autolijst = new ArrayList<>();
        autolijst.add(new Auto("Ford", "Fiesta", 23999, "images/autos/fordfiesta.jpg"));
        autolijst.add(new Auto("Ford", "Focus", 18995, "images/autos/fordfocus.jpg"));
        autolijst.add(new Auto("Opel", "Astra", 14895, "images/autos/opelastra.jpg"));
        autolijst.add(new Auto("Opel", "Insignia", 65450, "images/autos/opelinsignia.jpg"));
        autolijst.add(new Auto("Subaru", "Forester", 34750, "images/autos/subaruforester.jpg"));
        autolijst.add(new Auto("Subaru", "Impreza", 28345, "images/autos/subaruimpreza.jpg"));
        autolijst.add(new Auto("Mercedes", "E 63", 110995, "images/autos/mercedede63.png"));
        autolijst.add(new Auto("Mercedes", "CLA 45", 190780, "images/autos/mercedescla45.jpg"));
        autolijst.add(new Auto("Mercedes", "E 230", 1000, "images/autos/mercedese230.jpg"));
        autolijst.add(new Auto("Mercedes", "C 250", 599, "images/autos/mercedesc250.jpg"));
        autolijst.add(new Auto("Ferrari", "612 GTO", 350500, "images/autos/ferrari612.jpg"));
        autolijst.add(new Auto("Ferrari", "California", 210780, "images/autos/ferraricalifornia.jpg"));
        autolijst.add(new Auto("Ferrari", "458", 280775, "images/autos/ferrari458.jpg"));
        autolijst.add(new Auto("Lotus", "Elise CR", 48591, "images/autos/lotuselisecr.jpg"));
        autolijst.add(new Auto("Lotus", "Elise S CR", 60079, "images/autos/lotuselisescr.jpg"));
        autolijst.add(new Auto("Citroen", "2CV", 459, "images/autos/citroen2cv.jpg"));
        autolijst.add(new Auto("Volvo", "V40", 1250, "images/autos/volvov40.jpg"));
        autolijst.add(new Auto("Mini", "Cooper", 34495, "images/autos/minicooper.jpg"));

        return autolijst;
    }


    /**
     * Ten behoeve van het select merk input veld
     * @return een lijst met alle unieke merken
     */
    public static ArrayList getMerken() {
        ArrayList<String> merken = new ArrayList<>();
        for (Auto auto: getAutolijst()) {
            String merk = auto.getMerk();
            if (!merken.contains(merk)) {
                merken.add(merk);
            }
        }
        return merken;
    }

}
