package statistics;

import data_base.Words;

/**
 * Created by user on 2016-08-02.
 */
public class StatisticsActivity {

    public static void showStatistics() {
    	System.out.println("���� �ܾ�" + "\t\t" + "����ġ" + "\t\t" + "���� Ƚ��");

        // ���� �ܾ� �����ŭ����
        // �ϴ��� ���Ѵ�� �ܾ��� ��ü�� �غ���
        try {
            for (int i = 0; i < Words.NUM_OF_WORDS; i++) {
                if (NumbersForWordList.numbersOfUsed.get(i) != 0) {
                    System.out.println(Words.words[i] + "\t\t" 
                    		+ NumbersForWordList.numbersOfWeight.get(i) + "\t\t"
                    		+ NumbersForWordList.numbersOfUsed.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("\n" + "���� �ɻ�ġ �ʾ� ���̻���ž�");
        }
        System.out.println(); System.out.println(); System.out.println();
    }
}
