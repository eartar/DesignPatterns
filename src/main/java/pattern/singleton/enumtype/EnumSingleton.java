package pattern.singleton.enumtype;

import lombok.Data;

enum EnumSingleton
{
    INSTANCE;
    int num;

    EnumSingleton() {
        num = 7;
        System.out.println("Enum constr called");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

