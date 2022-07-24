package GuessNumberGame;

import java.io.Serializable;
import java.util.Random;

public class GuessNumGame implements Model, Serializable {
    private int tryCount;
    private int randomNum;
    private boolean gamestate;

    public GuessNumGame() {
        this(5);
    }

    public GuessNumGame(int tryCount) {
        this.tryCount = tryCount;
        this.randomNum = new Random().nextInt(1, 11);
        System.out.println(randomNum); // just for educatuion
        this.gamestate = true;
    }

    public boolean isGamestate() {
        return gamestate;
    }

    public String numberInputResult(int input) {
        if (input == randomNum) {
            gamestate = false;
            return String.format("Вы угадали число %d. Поздравляем с ПОБЕДОЙ!\n", input);
        } else if (checkTryCount()) {
            return "Вы неугалали и у вас закончились попытки, удачи в следующий раз!";
        } else if (input > randomNum) {
            return String.format("Загаданное число меньше чем %d\n У вас осталось %d попыток\n", input, tryCount);
        } else if (input < randomNum) {
            return String.format("Загаданное число больше чем %d\n У вас осталось %d попыток\n", input, tryCount);
        }
        return "Что-то пошло не так сообщите разработчикам. Спасибо !";
    }

    private boolean checkTryCount() {
        tryCount -= 1;
        if (tryCount == 0) {
            gamestate = false;
            return false;
        }
        return true;
    }
}
