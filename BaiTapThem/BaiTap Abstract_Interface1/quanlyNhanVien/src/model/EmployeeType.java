package model;

public enum Type {
    EXPERIENCE(0),
    FRESHER(1),
    INTERN(2);
    int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    Type(int type) {
        this.type = type;
    }

    public static Type parseType(int type) {
        for (Type item : Type.values()) {
            if (item.type == type)
                return item;
        }
        throw new IllegalArgumentException("Invalid input, try again!");
    }
}
