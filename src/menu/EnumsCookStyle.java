package menu;

public enum EnumsCookStyle {

    RARE(1),MEDIUM(2),WELL_COOKED(3);

    final int id;

    EnumsCookStyle(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
