import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        int A[] = new int[n];
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) ;
        // giá trị chia hết cho5 không chia hết cho 6
        System.out.println("Các phần tử chia hết cho 5 không chia hết cho 6: ");
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0)
                if (A[i] % 6 != 0) {
                    System.out.print(A[i] + "\t");
                    // đếm số phần tử trong mảng A có giá trị lẻ
                    do {
                        System.out.println("Nhập vào số phần tử của mảng: ");
                        n = scanner.nextInt();
                    } while (n <= 0);
                    int le[] = new int[n];  // mảng chứa các phần tử là số lẻ
                    System.out.println("Nhập các phần tử cho mảng: ");
                    for (int j = 0; j < n; j++) {
                        System.out.print("Nhập phần tử thứ " + i + ": ");
                        A[i] = scanner.nextInt();
                        for (int k = 0; k < n; k++) {
                            if (A[i] % 2 == 0) {
                                le[i] = A[i];
                                i++;
                            }
                        }
                        System.out.println("\nCác phần tử của mảng le là: ");
                        for (int k = 0; k < k; k++) {
                            System.out.print(le[k] + "\t");
                            // đếm xem có bao nhiêu phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình của tất cả các giá trị trong mảng A
                            int number;

                            // đối số 1 trong Map là number nhập vào
                            // đối số 2 là số lần xuất hiện của number đó
                            Map<Integer, Integer> mapInteger = new HashMap<>();

                            System.out.println("Nhập vào số. Nhập vào số 0 để kết thúc: ");
                            while ((number = scanner.nextInt()) != 0) {
                                // nếu số nhập vào chưa có trong mapInteger
                                // thì sẽ thêm vào trong mapInteger
                                // số đó có số lần xuất hiện là 1
                                // nếu đã có thì sẽ tăng số lần xuất hiện của số đó lên 1
                                if (!mapInteger.containsKey(number)) {
                                    mapInteger.put(number, 1);
                                } else {
                                    mapInteger.put(number, mapInteger.get(number) + 1);
                                }
                            }

                            // trả về maxTimes là số lần xuất hiện nhiều nhất
                            // trong mapInteger
                            int maxTimes = Collections.max(mapInteger.values());

                            // highestMapInteger sẽ lưu trữ
                            // số có số lần xuất hiện nhiều nhất
                            Map<Integer, Integer> highestMapTimes = new HashMap<>();

                            // duyệt qua từng phần tử của mapInteger
                            mapInteger.forEach((key, value) -> {
                                // nếu value nào trong mapInteger lớn hơn hoặc bằng maxNumber
                                // thì thêm key và value của số đó vào trong highestMapInteger
                                if (value >= maxTimes) {
                                    highestMapTimes.put(key, value);
                                }
                            });

                            System.out.println("Số có số lần xuất hiện nhiều nhất là: ");
                            highestMapTimes.forEach((so, soLan) ->
                                    System.out.println(so + " xuất hiện " + soLan + " lần"));
                            // tách tất cả các giá trị lẻ trong mảng A vào mảng C

                            System.out.println("Mang ban dau la: ");
                            for (int l = 0; l < n; l++) {
                                System.out.print(A[i] + "\t");
                            }
                            System.out.println();
                            int c = 0;
                            for (int l = 0; l < n; l++) {
                                if(A[i] % 2 != 0){
                                    le[c] = A[l];
                                    c++;
                                }
                            }
                            System.out.println("Cac phan tu le sau khi tach ra mang khac la: ");
                            for (int l = 0; l < n; l++) {
                                System.out.print(le[i] + "\t");
                                //kiem tra xem trong mang co phan tu nao xuat hien lap lai khong
                                int mid[] = new int[n];
                                boolean find;
                                int count = 0;
                                int dem3 = 0;
                                mid[0] = A[0];
                                count++;
                                for (int p = 0; p < n; p++) {
                                    find = false;
                                    for (int m = 0; m < count; m++) {
                                        if (mid[j] == A[i]){
                                            find = true;
                                            dem3++;
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println("Co " + dem3 + " gia tri lap lai trong mang.");
                            }

                        }
                    }
                }
        }
    }
}

