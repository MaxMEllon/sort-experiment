package main.java.sequence;

import java.util.Random;
import main.java.data.NumData;

public class NumSequenceGenerator {

    /**
     * {size}個だけ 0から始まる ソート済みのデータ列を生成する
     * @param size
     * @return NumDataSequence
     */
    public static NumDataSequence generateOfSorted(int size) {
    }

    /**
     * {size}個だけ randamな データ列を生成する
     * @param size
     * @return NumDataSequence
     */
    public static NumDataSequence generateByRandom(int size) {
    }

    /**
     * 全データのうち，(probabolity / 1.00) * 100 % だけランダムなデータ列を生成する
     * @param size
     * @param probability {double} 0.00 ~ 1.00
     * @return NumDataSequence
     */
    public static NumDataSequence generateByShuffle(int size, double probability) {
    }

    /**
     * count回 交換を行った データ列を生成する
     * @param size
     * @param count
     * @return
     */
    public static NumDataSequence generateByExchange(int size, int count) {
    }
}
