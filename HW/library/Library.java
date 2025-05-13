package hus.oop.library;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        if (rents == null || rents.length == 0) {
            return null;
        }
        Rent longestRent = rents[0];
        for (int i = 1; i < rents.length; i++) {
            if (rents[i].getEnd().compareTo(rents[i].getBegin()) >
                    longestRent.getEnd().compareTo(longestRent.getBegin())) {
                longestRent = rents[i];
            }
        }
        return longestRent;
    }
}
