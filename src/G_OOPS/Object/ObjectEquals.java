package Z_Practice;

import java.util.Arrays;

public class ObjectEquals {

    int num;

    public ObjectEquals(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + num;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ObjectEquals other = (ObjectEquals) obj;
        if (num != other.num)
            return false;
        return true;
    }

    public static void main(String[] args) {
        ObjectEquals g1 = new ObjectEquals(10);
        ObjectEquals g2 = new ObjectEquals(20);
        System.out.println(g1.equals(g2));
    }
}

/*
 Check difference without equals and hashcode method
 */