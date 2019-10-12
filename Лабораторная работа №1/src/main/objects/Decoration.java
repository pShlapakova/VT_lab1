package main.objects;

public final class Decoration
        extends Infrastructure
        implements Comparable<Decoration> {
    private int appearance;

    public Decoration() {
        super();
        appearance = 0;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == this.getClass())) {
            Decoration anotherDecoration = (Decoration)obj;
            if ((this.getName() == anotherDecoration.getName()) &&
                    (this.appearance == anotherDecoration.appearance))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 37*this.getName().hashCode() + this.appearance;
    }

    @Override
    public String toString() {
        return "Decoration " + this.getName() + " - " + this.appearance;
    }

    @Override
    public int compareTo(Decoration anotherDecoration) {
        return this.appearance - anotherDecoration.appearance;
    }
}
