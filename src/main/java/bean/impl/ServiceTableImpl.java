package bean.impl;

import bean.api.ServiceTable;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Random;

@Service
public class ServiceTableImpl implements ServiceTable {
    final String SIGN_X = "x";
    final String SIGN_O = "o";
    private String[][] array = new String[3][3];


    @Override
    public String[][] getArray() {
        return array;
    }

    @Override
    public String[][] cleanArray() {
        return array = new String[3][3];
    }

    @Override
    public String getSignX() {
        return SIGN_X;
    }

    @Override
    public String getSignO() {
        return SIGN_O;
    }

    @Override
    public void turnHuman(Integer y, Integer x) {
        setValueToField(SIGN_X, y, x);
    }

    @Override
    public void turnComputer() {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while (!isSquareEmpty(y, x));
        setValueToField(SIGN_O, y, x);
    }

    @Override
    public boolean isThereAWinner(String sigh) {
        for (int i = 0; i < 3; i++)

            if ((Objects.equals(array[i][0], sigh) && Objects.equals(array[i][1], sigh) && Objects.equals(array[i][2], sigh)) ||
                    (Objects.equals(array[0][i], sigh) && Objects.equals(array[1][i], sigh) && Objects.equals(array[2][i], sigh))) {
                return true;
            }
        return (Objects.equals(array[0][0], sigh) && Objects.equals(array[1][1], sigh) && Objects.equals(array[2][2], sigh)) ||
                (Objects.equals(array[2][0], sigh) && Objects.equals(array[1][1], sigh) && Objects.equals(array[0][2], sigh));
    }

    @Override
    public boolean isTableFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (array[row][col] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareEmpty(int y, int x) {
        return array[y][x] == null;
    }

    @Override
    public void setValueToField(String sign, Integer y, Integer x) {
        array[y][x] = sign;
    }
}
