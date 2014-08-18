package com.sale.pointofsalecore.tools;

import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 * @param <L>
 * @param <R>
 */
public class Pair<L, R> {
    private static final Logger LOG = getLogger(Pair.class.getName());

    static <L, R> Pair<L, R> of(L left, R right) {
        return new Pair<>(left, right);
    }

    /**
     *
     */
    public final L left;

    /**
     *
     */
    public final R right;

    /**
     *
     * @param left
     * @param right
     */
    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

}
