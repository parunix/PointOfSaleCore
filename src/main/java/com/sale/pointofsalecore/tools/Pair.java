package com.sale.pointofsalecore.tools;

/**
 *
 * @author Bartosz Cichowicz
 * @param <L>
 * @param <R>
 */
public class Pair<L, R> {

    public final L left;
    public final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    static <L, R> Pair<L, R> of(L left, R right) {
        return new Pair<>(left, right);
    }
}
