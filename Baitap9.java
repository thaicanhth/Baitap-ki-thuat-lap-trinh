import java.util.Scanner;

public class Baitap9 {
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
        // giá trị chia hết cho 3 mà không chia hết cho 2
        System.out.println("Các phần tử chia hết cho 3 không chia hết cho 2: ");
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0)
                if (A[i] % 2!=0)
                {
                    System.out.print(A[i] + "\t");
                    // tìm giá trị lớn nhất trong mảng A
                    int a,m;

                    System.out.println("Nhập vào số dòng của ma trận: ");
                    a = scanner.nextInt();
                    System.out.println("Nhập vào số cột của ma trận: ");
                    n = scanner.nextInt();

                    // khai báo ma trận A có m dòng, n cột


                    System.out.println("Nhập các phần tử cho ma trận: ");
                    for (int k = 0; k < a; k++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("A[" + i + "]["+ j + "] = ");
                            A[i] = scanner.nextInt();
                        }
                    }

                    // tìm phần tử có giá trị lớn nhất trong ma trận
                    // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
                    int max = A[0];

                    for (int k = 0; k < n; k++) {
                        for (int j = 0; j < n; j++) {
                            if (max < A[k]) {
                                max = A[k];
                            }
                        }
                    }
                    System.out.println("Phần tử lớn nhất trong ma trận = " + max);

                    // kiểm tra giá trị x có tồn tại trong mảng A hay không
                    int counter, num, item;
                    Scanner input = new Scanner(System.in);
                    System.out.println("Nhập vào số lương phần tử của mảng:");
                    num = input.nextInt();
                    array = new int[num];
                    System.out.println("Nhập giá trị cho các phần tử trong mảng:");
                    for (counter = 0; counter < num; counter++)
                        array[counter] = input.nextInt();
                    System.out.println("Nhập vào giá trị cần kiểm tra trong mảng");
                    item = input.nextInt();
                    for (counter = 0; counter < num; counter++)
                    {
                        if (array[counter] == item)
                        {
                            System.out.println(item+" Đang tồn tại ở vị trí "+(counter+1));
                            break;
                        }
                    }
                    if (counter == num)
                        System.out.println(item + " Không tồn tại trong mảng.");
                    System.out.println("----------------------------");
                    System.out.println("Chương trình nay được đăng tại Freetuts.net");
                    // viết hàm đếm số phần tử trong mảng A có giá trị chẵn
                    int count = 0;
                    do {
                        System.out.println("Nhập vào số phần tử của mảng: ");
                        n = scanner.nextInt();
                    } while (n < 0);

                    System.out.println("Nhập các phần tử cho mảng: ");
                    for (int k = 0; k < n; k++) {
                        System.out.print("Nhập phần tử thứ " + i + ": ");
                        A[i] = scanner.nextInt();
                    }

                    // Đếm số lần xuất hiện của 1 phần tử được nhập từ bàn phím
                    System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
                    int number = scanner.nextInt();

                    for (int k = 0; k < n; k++) {
                        if (A[k] % 2 == 0)
                            if (A[i] == number) {
                                count++;
                            }
                    }
                    System.out.println("Số phần tử " + number + " có giá trị chẵn = " + count);
                    // viết hàm tách tất cả các giá trị chẵn trong mảng A vào các mảng B
                    System.out.println("Mang ban dau la: ");
                    for (int k = 0; i < n; k++) {
                        System.out.print(A[i] + "\t");
                    }
                    System.out.println();
                    int ch[] = new int[n];
                    int b = 0;
                    for (int k = 0; k < n; k++) {
                        if(A[i] % 2 != 0){
                            ch[b] = A[k];
                            b++;
                        }
                    }
                    System.out.println("Cac phan tu le sau khi tach ra mang khac la: ");
                    for (int k = 0; k < n; k++) {
                        System.out.print(ch[k] + "\t");
                    }

                }
        }
    }
}
