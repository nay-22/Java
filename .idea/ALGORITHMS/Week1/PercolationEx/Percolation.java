package ALGORITHMS.Week1.PercolationEx;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdStats;

public class Percolation {
    private boolean[][] grid;
    private int top;
    private int bottom;
    private int n;
    private int openSites;
    private WeightedQuickUnionUF uf;

    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        uf = new WeightedQuickUnionUF(n*n+2);
        grid = new boolean[n][n];
        this.n = n;
        openSites = 0;
    }

    public void open(int row, int col) {
        if (!grid[row-1][col-1]) {
            grid[row-1][col-1] = true;
            openSites++;
        }
    }

    public boolean isOpen(int row, int col) {
        return grid[row-1][col-1];
    }

    public boolean isFull(int row, int col) {
        return false;
    }
}
