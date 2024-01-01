package smartHouse.addFunction.radio;

public class Radio {

    private int currantRadioStation;
    private int currantVolume;

    public int getCurrantRadioStation() {
        return currantRadioStation;
    }
    
    public void setCurrantRadioStation(int newCurrantRadioStation) {
        if (newCurrantRadioStation > 9) {
            return;
        }
        if (newCurrantRadioStation < 0) {
            return;
        }
        currantRadioStation = newCurrantRadioStation;
    }

    public int getCurrantVolume() {
        return currantVolume;
    }

    public int next() {
        if (currantRadioStation < 9) {
            currantRadioStation++;
        } else {
            currantRadioStation = 0;
        }
        return currantRadioStation;
    }

    public int prev() {
        if (currantRadioStation > 0) {
            currantRadioStation--;
        } else {
            currantRadioStation = 9;
        }
        return currantRadioStation;
    }

    public void setCurrantVolume(int newCurrantVolume) {

        if (newCurrantVolume > 100) {
            return;
        }
        if (newCurrantVolume < 0) {
            return;
        }
        currantVolume = newCurrantVolume;

    }

    public void volumeUp() {
        if (currantVolume < 100) {
            currantVolume++;
        } else {
            currantVolume = 100;
        }
    }

    public void volumeDown() {
        if (currantVolume > 0) {
            currantVolume--;
        } else {
            currantVolume = 0;
        }
    }
}
