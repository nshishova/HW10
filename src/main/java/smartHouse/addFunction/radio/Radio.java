package smartHouse.addFunction.radio;

public class Radio {
    private int firstStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int radioRange = 10;
    private int currantRadioStation;
    private int currantVolume = minVolume;

    public Radio() {
    }

    public Radio(int radioRange) {
        this.radioRange = radioRange;
    }

    public int getCurrantRadioStation() {
        return currantRadioStation;
    }

    public void setCurrantRadioStation(int newCurrantRadioStation) {
        if (newCurrantRadioStation > radioRange) {
            return;
        }
        if (newCurrantRadioStation < firstStation) {
            return;
        }
        currantRadioStation = newCurrantRadioStation;
    }

    public int getCurrantVolume() {
        return currantVolume;
    }

    public void setCurrantVolume(int newCurrantVolume) {

        if (newCurrantVolume > maxVolume) {
            return;
        }
        if (newCurrantVolume < minVolume) {
            return;
        }
        currantVolume = newCurrantVolume;

    }

    public int getRadioRange() {
        return radioRange;
    }

    public int next() {
        if (currantRadioStation < radioRange - 1) {
            currantRadioStation++;
        } else {
            currantRadioStation = firstStation;
        }
        return currantRadioStation;
    }

    public int prev() {
        if (currantRadioStation > firstStation) {
            currantRadioStation--;
        } else {
            currantRadioStation = radioRange - 1;
        }
        return currantRadioStation;
    }


    public void volumeUp() {
        if (currantVolume < maxVolume) {
            currantVolume++;
        } else {
            currantVolume = maxVolume;
        }
    }

    public void volumeDown() {
        if (currantVolume > minVolume) {
            currantVolume--;
        } else {
            currantVolume = minVolume;
        }
    }
}
