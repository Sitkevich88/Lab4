package lab_4;

public interface HatifnattActions{
    void lookAt(Object o) throws ImpossibleNumberException;
    //void swarm();
    void approach(Object o) throws ImpossibleNumberException;

    void hear(boolean heard) throws ImpossibleNumberException;
    void takeAStepTowards(Hemul hemul,HatifnattStatus hatifnattStatus) throws ImpossibleNumberException;
    void hiss(Adverbs adverb) throws ImpossibleNumberException;
    //void surround(Hemul hemul);
    void swingPaws() throws ImpossibleNumberException;
    //void flash(Location loc, int loudness);
}
