import java.util.*;

public class pr1 {
    private static void solution(int numOfOperation, Operation[] operations) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> count = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= numOfOperation; i++) {
            count.add(i);
        }

        int cnt = 0;

        for (Operation operation : operations) {
            if (operation.type == OperationType.valueOf("branch")) {
                list.add(count.get(cnt));
                cnt++;
            } else {  // merge
                int m = operation.value;
                list.remove((Integer) m);
                count.add(m);
                Collections.sort(count);
                cnt = 0;
            }
        }
        list.add(0, 1);
        Collections.sort(list);

        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }

        System.out.println(sb);
    }

    private static class InputData {
        int numOfOperation;
        Operation[] operations;
    }

    private static class Operation {
        OperationType type;
        Integer value;

        public Operation(OperationType type, Integer value) {
            this.type = type;
            this.value = value;
        }
    }

    private static enum OperationType {
        branch,
        merge;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner sc = new Scanner(System.in)) {
            inputData.numOfOperation = Integer.parseInt(sc.nextLine());
            inputData.operations = new Operation[inputData.numOfOperation];

            for (int i = 0; i < inputData.numOfOperation; i++) {
                String[] temp = sc.nextLine().split(" ");

                Integer value = null;
                OperationType operationType = OperationType.valueOf(temp[0]);
                if (OperationType.merge == operationType) {
                    value = Integer.valueOf(temp[1]);
                }

                inputData.operations[i] = new Operation(operationType, value);
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();
        solution(inputData.numOfOperation, inputData.operations);
    }
}
