package main.java.sort.simple;

import main.java.sequence.NumDataSequence;

public class NumSimpleSorter {

    // void select(DataSequence *seq)
    // {
    //     int i, j;
    //     int p;
    //     for ( i = 0; i < seq->size -1; i++ ) {
    //         p = i;
    //         for ( j = i+1; j < seq->size; j++ ) {
    //             if ( ! DataSequence_order(seq, p, j) ) { p = j; }
    //         }
    //         DataSequence_swap(seq, i, p);
    //     }
    // }
    public static void select(final NumDataSequence seq) {

    }

    // void insert(DataSequence *seq)
    // {
    //     int i, j;
    //     for ( i = 0; i < seq->size -1; i++ ) {
    //         for ( j = i; j >= 0; j-- ) {
    //             if ( DataSequence_order(seq, j, j+1) ) { break; }
    //             DataSequence_swap(seq, j, j+1);
    //         }
    //     }
    //  }
    public static void insert(final NumDataSequence seq) {

    }

    // void exchange(DataSequence *seq)
    // {
    //     int i, j;
    //     int p = 0;
    //     int t;
    //     for ( i = 0; i < seq->size -1; i++ ) {
    //         t = 0;
    //         for ( j = seq->size -1; j > p; j-- ) {
    //             if ( ! DataSequence_order(seq, j-1, j) ) {
    //                 DataSequence_swap(seq, j-1, j);
    //                 t = j;
    //             }
    //         }
    //         if ( t == 0 ) { break; }
    //         p = t;
    //     }
    // }
    public static void excange(final NumDataSequence seq) {

    }
}
