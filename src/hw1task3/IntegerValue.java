package hw1task3;

import java.util.HashMap;
import java.util.Objects;

public class IntegerValue {

    private String string;
    private Integer integer;

    public IntegerValue(String string, Integer integer) {
        this.string = string;
        this.integer = integer;
    }


    public String getString() {
        return string;
    }

    public Integer getInteger() {
        return integer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerValue that = (IntegerValue) o;
        return Objects.equals(string, that.string) && Objects.equals(integer, that.integer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, integer);
    }

    @Override
    public String toString() {
        return string + " --> " + integer;
    }
}
