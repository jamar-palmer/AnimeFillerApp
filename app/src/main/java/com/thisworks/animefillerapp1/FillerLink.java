package com.thisworks.animefillerapp1;

import android.content.Context;

public class FillerLink {

    private String series;
    private Context context;

    public FillerLink(String pass, Context context){
        this.series = pass;
        this.context = context;
    }

    //list of if statements matching name to repsective image
    public static int getImage(String name){
        switch(name){
            case "Naruto":
                return R.drawable.naruto;
            case "Bleach":
                return R.drawable.bleach;
            case "One Piece":
                return R.drawable.luffy;
            case "Dragon Ball Z":
                return R.drawable.dbz;
            case "Black Clover":
                return R.drawable.blackclover;
            case "My Hero Academia":
                return R.drawable.myheroacademia;
            default:
                return R.drawable.myheroacademia;
        }
    }

    public String[] getCanonList(){

        String[] canonEps;
        switch(series){
            case "Naruto":
                canonEps =  context.getResources().getStringArray(R.array.NarutoCanon);
                return canonEps;
            case "Bleach":
                canonEps =  context.getResources().getStringArray(R.array.BleachCanon);
                return canonEps;
            case "One Piece":
                canonEps =  context.getResources().getStringArray(R.array.OnePieceCanon);
                return canonEps;
            case "Dragon Ball Z":
                canonEps =  context.getResources().getStringArray(R.array.DBZCanon);
                return canonEps;
            case "Black Clover":
                canonEps =  context.getResources().getStringArray(R.array.BlackCloverCanon);
                return canonEps;
            case "My Hero Academia":
                canonEps =  context.getResources().getStringArray(R.array.MyHeroCanon);
                return canonEps;
            default:
                canonEps = new String[]{"No Canon Episodes Found"};
                return canonEps;
        }

    }

    public String[] getFillerList(){

        String[] fillerEps;
        switch(series){
            case "Naruto":
                fillerEps =  context.getResources().getStringArray(R.array.NarutoFiller);
                return fillerEps;
            case "Bleach":
                fillerEps =  context.getResources().getStringArray(R.array.BleachFiller);

                return fillerEps;
            case "One Piece":
                fillerEps =  context.getResources().getStringArray(R.array.OnePieceFiller);
                return fillerEps;
            case "Dragon Ball Z":
                fillerEps =  context.getResources().getStringArray(R.array.DBZFiller);
                return fillerEps;
            case "Black Clover":
                fillerEps =  context.getResources().getStringArray(R.array.BlackCloverFiller);
                return fillerEps;
            case "My Hero Academia":
                fillerEps =  context.getResources().getStringArray(R.array.MyHeroFiller);
                return fillerEps;
            default:
                fillerEps = new String[]{"No Filler Episodes Found"};
                return fillerEps;
        }

    }
}
