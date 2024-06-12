package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Tag implements Serializable {

  private ArrayList<String> tags;

    public Tag(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tags=" + tags +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Tag tag = (Tag) object;
        return Objects.equals(tags, tag.tags);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
