class Client {

    String name;
    int riskScore;

    Client(String name, int riskScore) {
        this.name = name;
        this.riskScore = riskScore;
    }
}

public class ClientRiskSort {

    static void bubbleSort(Client arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].riskScore > arr[j + 1].riskScore) {

                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (Client c : arr)
            System.out.println(c.name + " " + c.riskScore);
    }

    public static void main(String args[]) {

        Client arr[] = {
                new Client("A", 20),
                new Client("B", 50),
                new Client("C", 80)
        };

        bubbleSort(arr);
    }
}