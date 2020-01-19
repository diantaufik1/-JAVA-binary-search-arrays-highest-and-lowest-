package com.company;
public class Main {
    public static void main(String[] args) {
//        array
        int data[] = {55,89,45,74,34,56,78,32,34,33,92};
        int indexTerbesar = data[0];
        int indexTerkecil = data[0];
        int total = 0;

//        rata-rata
        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        int rata = total / data.length;
        System.out.println("nilai Rata-ratanya : " + rata);

//        nilai terbesar dan terkecil
        for(int i=0;i<data.length;i++){
            if(indexTerbesar < data[i]){
                indexTerbesar = data[i];
            }
            if(indexTerkecil > data[i]){
                indexTerkecil = data[i];
            }
        }
        System.out.println(indexTerbesar+" :nilai terbesar" );
        System.out.println(indexTerkecil+" :nilai terkecil" );

//        pengurutan nilai
        pengurutan(data);
        System.out.print("dari yang besar ke kecil : ");
        for (int a = 0; a < data.length; a++){
            System.out.print(data[a]+",");
        }
    }

//    method pengurutan
    public static void pengurutan(int[]angka) {
        for (int i = 0; i < angka.length; i++) {
            for (int j = angka.length - 1; j > i; j--) {
                if (angka[j] > angka[j - 1]) {
                    int tempat = angka[j];
                    angka[j] = angka[j - 1];
                    angka[j - 1] = tempat;
                }
            }
        }
    }
}
