package PinballWizard.Display;

public interface DisplayFactory {
    void displayNoCredit();
    void displayStartGame();
    void displayPlaying();
    void displayGameOver();
    void displayError();
    void displayBallText(int ballNumber);
    void displayExtraBall();
}
