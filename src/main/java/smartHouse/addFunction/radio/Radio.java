package smartHouse.addFunction.radio;

public class Radio {

    public int currantRadioStation;

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

    public int next() {
        if (currantRadioStation < 9) {
            return currantRadioStation++;
        } else {
            return currantRadioStation;
        }
    }

    public int prev() {
        if (currantRadioStation > 0) {
            return currantRadioStation--;
        } else {
            return currantRadioStation;
        }
    }

    public int currantVolume;

    public int getCurrantVolume() {
        return currantVolume;
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

    public int volumeUp() {
        if (currantVolume < 100) {
            return currantVolume++;
        } else {
            return currantVolume;
        }
    }

    public int volumeDown() {
        if (currantVolume > 0) {
            return currantVolume--;
        } else {
            return currantVolume;
        }
    }
}
