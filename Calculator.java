package calculatorSimple;

public class Calculator {


    public void calculate(int x, int y, Operation operation) throws Exception {
        switch (operation) {
            case ADD:
                System.out.println(add(x, y));
                break;
            case SUBTRACT:
                System.out.println(subtraction(x, y));
                break;
            case MULTIPLY:
                System.out.println(multiply(x, y));
                break;
            case DIVIDE:
                if (divide(x, y) == null) {
                    break;
                } else {
                    System.out.printf("%.3f",divide(x, y));
                }
                break;

        }

    }

    private Double add(int x, int y) {
        return (double) (x + y);
    }

    private Double subtraction(int x, int y) {
        return (double) (x - y);
    }

    private Double multiply(int x, int y) {
        return (double) (x * y);
    }

    private Double divide(int x, int y) throws Exception {
        if (y == 0) {
            System.out.println("Denominator can not be zero!!!");

            return null;

        }

        return (double) (x / y);

    }
}

