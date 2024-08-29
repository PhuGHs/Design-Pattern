import structural_dp.adapter.adapters.SquarePegAdapter;
import structural_dp.adapter.models.RoundHole;
import structural_dp.adapter.models.RoundPeg;
import structural_dp.adapter.models.SquarePeg;

public class Main {
    public static void main(String[] args) {
        // Adapter - Hole - ClientCode

        //two classes with compatible interfaces
        RoundHole roundHole = new RoundHole(1);
        RoundPeg roundPeg = new RoundPeg(1);

        // incompatible class
        SquarePeg squarePeg = new SquarePeg(2);

        //adapter helps square peg fits round hole
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
        if (roundHole.fits(adapter)) {
            System.out.println("Square peg fits");
        } else {
            System.out.println("Square peg not fits");
        }
    }
}