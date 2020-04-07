package bean.impl;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ServiceTableImplTest {
    private ServiceTableImpl serviceTable = new ServiceTableImpl();

    @Test
    public void isThereAWinner() {
        String[][] array = serviceTable.getArray();
        final String SIGN_X = "x";


        array[0][0] = SIGN_X;
        array[0][1] = SIGN_X;
        array[0][2] = SIGN_X;

        assertTrue(serviceTable.isThereAWinner(SIGN_X));
    }

    @Test
    public void isTableFull() {
        String[][] array = serviceTable.getArray();
        final String SIGN_X = "x";
        final String SIGN_O = "o";

        array[0][0] = SIGN_X;
        array[0][1] = SIGN_X;
        array[0][2] = SIGN_X;
        array[1][2] = SIGN_X;
        array[1][1] = SIGN_X;
        array[1][0] = SIGN_O;
        array[2][0] = SIGN_O;
        /*array[2][1] = SIGN_O;*/
        array[2][2] = SIGN_O;

        assertFalse(serviceTable.isTableFull());
    }
}
