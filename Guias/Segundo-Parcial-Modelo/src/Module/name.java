package Module;

import java.io.Serializable;

public class name  implements Serializable {
    private String first;
    private String last;

    public name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return "name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
