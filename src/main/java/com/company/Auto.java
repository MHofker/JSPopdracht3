package com.company;

import java.text.DecimalFormat;


/**
 *Een typische POJO klasse waarin je de relevante data van een auto-object kunt opslaan
 */

public class Auto {
    // De attributen (eigenschappen) van een auto die we nodig hebben voor de app
    private final String mMerk;
    private final String mType;
    private final int mPrijs;
    private final String mFotourl;

    // Constructor waarmee je een auto object maakt
    public Auto(String merk, String type, int prijs, String fotourl) {
        this.mMerk = merk;
        this.mType = type;
        this.mPrijs = prijs;
        this.mFotourl = fotourl;
    }

    // get methoden (getters) die de attributen van een auto-object teruggeven

    public String getMerk() {
        return mMerk;
    }

    public String getType() {
        return mType;
    }

    public int getPrijs() {
        return mPrijs;
    }

    public String getFoto() {
        return mFotourl;
    }


    /**
     * @return geeft prijs als geformatteerde String mbv DecimalFormat object
     */
    public String getPrijsFormat() {
        //met een DecimalFormat object kun je een double naar een String converteren
        //volgens een bepaald patroon. Zie java documentatie.
        DecimalFormat df = new DecimalFormat("#,##0.--");
        double prijs = (double) this.getPrijs();
        String fPrijs = df.format(prijs);
        return fPrijs;
    }
}
