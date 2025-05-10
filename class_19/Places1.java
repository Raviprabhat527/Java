//Q. place Tiles of size 1xm in a floor of size nxm    n =4, m=2
public class Places1 {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        // vertically
        int vertPlacements = placeTiles(n - m, m);

        // horizantlly
        int hortPlacements = placeTiles(n - 1, m);

        return vertPlacements + hortPlacements;
    }

    public static void main(String[] args) {
        int n = 10, m = 4;
        System.out.println(placeTiles(n, m));

    }
}
