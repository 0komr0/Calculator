package calculatorSimple;

import java.util.Arrays;
import java.util.List;

public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,

    LEAVE;

    static List<String> enumList = Arrays.asList(Operation.ADD.toString(), Operation.LEAVE.toString(), Operation.DIVIDE.toString(), Operation.MULTIPLY.toString(), Operation.SUBTRACT.toString());

    public static Boolean checkIfOperationExist(String choice) {
        if (enumList.contains(choice.toUpperCase())) {
            return true;
        } else return false;

    }

    public static Operation getEnum(String name) {

        return Operation.valueOf(name.toUpperCase());
    }

}