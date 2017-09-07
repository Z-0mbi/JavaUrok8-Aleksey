package sortSelection;

public class SortSelection {
	//Сортировка выбором массива
	public static void makeSortSelection(int[] mas) {
		int k = mas[0];//временная переменная
		int temp;
		for (int j=0; j<mas.length-1;j++) {
			k = mas[j];
			for (int i=j+1; i<mas.length; i++) {
				if (mas[i] < k) {
					temp = k;
					k = mas[i];
					mas[i] = temp;
				}
			}
			mas[j] = k;//Присваиваем наименьший элемент 
			
		}
		
	}
	//Вывод массива
	public static void showMas(int[] mas) {
		for (int i=0; i<mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] mas = {2,5,3,456,4,89,6,456,6,47,78};
		SortSelection.makeSortSelection(mas);
		SortSelection.showMas(mas);
	}

}
