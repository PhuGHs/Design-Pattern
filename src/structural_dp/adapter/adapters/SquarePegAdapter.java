package structural_dp.adapter.adapters;

import structural_dp.adapter.models.RoundPeg;
import structural_dp.adapter.models.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(2*Math.pow(squarePeg.getWidth(), 2))/2;
    }
}
