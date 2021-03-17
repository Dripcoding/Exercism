class Darts {
    final static double OUTER_CIRCLE_RADIUS = 10;
    final static double MIDDLE_CIRCLE_RADIUS = 5;
    final static double INNER_CIRCLE_RADIUS = 1;
    private final double x;
    private final double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double dist = getDistanceFromCenter();
        if (dist > OUTER_CIRCLE_RADIUS) {
            return 0;
        } else if (dist <= OUTER_CIRCLE_RADIUS && dist > MIDDLE_CIRCLE_RADIUS) {
            return 1;
        } else if (dist <= MIDDLE_CIRCLE_RADIUS && dist > INNER_CIRCLE_RADIUS) {
            return 5;
        } else {
            return 10;
        }
    }

    double getDistanceFromCenter() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
