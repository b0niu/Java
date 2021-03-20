package zad1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 11111;
        int[] spod = new int[n];
        int[] opt = new int[n];
        int[] pes = new int[n];

        Random generator = new Random();

        for(int i = 0; i < n; i++){
            spod[i] = generator.nextInt(1000);
            opt[i] = i;
            pes[i] = n-i;
        }
        Scanner input = new Scanner(System.in);
        Sort st=new Sort();
        System.out.println("Prosze wybrać metode sortowania : \n1->SelectionSort 2->BubbleSort 3->MergeSort 4->QuickSort 5->HeapSort");
        try{

            int w =input.nextInt();
            switch(w){
                case 1:
                    System.out.println("Oczekiwany");
                    st.set(new SelectionSort(spod));
                    st.print(spod);
                    System.out.println("Optymistyczny");
                    st.set(new SelectionSort(opt));
                    st.print(opt);
                    System.out.println("Pesymistyczny");
                    st.set(new SelectionSort(pes));
                    st.print(pes);
                    break;
                case 2:
                    System.out.println("Oczekiwany");
                    st.set(new BubbleSort(spod));
                    st.print(spod);
                    System.out.println("Optymistyczny");
                    st.set(new BubbleSort(opt));
                    st.print(opt);
                    System.out.println("Pesymistyczny");
                    st.set(new BubbleSort(pes));
                    st.print(pes);
                    break;
                case 3:
                    System.out.println("Oczekiwany");
                    st.set(new MargeSort(spod));
                    st.print(spod);
                    System.out.println("Optymistyczny");
                    st.set(new MargeSort(opt));
                    st.print(opt);
                    System.out.println("Pesymistyczny");
                    st.set(new MargeSort(pes));
                    st.print(pes);
                    break;
                case 4:
                    System.out.println("Oczekiwany");
                    st.set(new QuickSort(spod));
                    st.print(spod);
                    System.out.println("Optymistyczny");
                    st.set(new QuickSort(opt));
                    st.print(opt);
                    System.out.println("Pesymistyczny");
                    st.set(new QuickSort(pes));
                    st.print(pes);
                    break;
                case 5:
                    System.out.println("Oczekiwany");
                    st.set(new HeapSort(spod));
                    st.print(spod);
                    System.out.println("Optymistyczny");
                    st.set(new HeapSort(opt));
                    st.print(opt);
                    System.out.println("Pesymistyczny");
                    st.set(new HeapSort(pes));
                    st.print(pes);
                    break;
                default:
                    System.out.println("Nie wybrałeś żadnej opcji\n Koniec programu");
                    System.exit(0);            }

        }catch(InputMismatchException e){
            System.out.println("Zła wartość!");
            System.exit(-1);
        }


    }
}
