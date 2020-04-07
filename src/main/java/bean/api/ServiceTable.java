package bean.api;

public interface ServiceTable {
    String[][] getArray();

    String[][] cleanArray();

    String getSignX();

    String getSignO();

    void turnHuman(Integer y, Integer x);

    void turnComputer();

    boolean isThereAWinner(String sigh);

    boolean isTableFull();

    boolean isSquareEmpty(int y, int x);

    void setValueToField(String sign, Integer y, Integer x);
}
