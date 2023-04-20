public class exercise1 {

    static boolean iwillNotCheat = true;
    static boolean IwillWin = true;

    public static void main(String[] args) throws Exception {

    // Precondition
    assert iwillNotCheat == true: "[Sighs] You could've made it if you didn't cheat!"; // agreement
    
    enterCompetition();

    // Postcondition
    assert IwillWin == true: "CRIMINAL OFFENSIVE SIDE EYE... "; // agreement

    }

    static void enterCompetition(){
        IwillWin = false;
    }
}
