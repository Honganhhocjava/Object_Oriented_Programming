package hus.oop.lab10.adapter.pseudocode;

public class Client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        boolean fitsRoundPeg = hole.fits(roundPeg);
        System.out.println("Does the round peg fit the hole? " + fitsRoundPeg); // true

        SquarePeg smallSquarePeg = new SquarePeg(5);
        // hole.fits(smallSquarePeg); // Uncommenting this line will cause a compilation error

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        boolean fitsSmallSquarePegAdapter = hole.fits(smallSquarePegAdapter);
        System.out.println("Does the small square peg fit the hole? " + fitsSmallSquarePegAdapter); // true

        SquarePeg largeSquarePeg = new SquarePeg(10);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        boolean fitsLargeSquarePegAdapter = hole.fits(largeSquarePegAdapter);
        System.out.println("Does the large square peg fit the hole? " + fitsLargeSquarePegAdapter); // false
    }
}