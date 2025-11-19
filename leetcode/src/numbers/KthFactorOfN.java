package numbers;

public class KthFactorOfN {

    public int kthFactor(int n, int k) {
        int factors = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                factors++;
            }

            if (factors == k)
                return i;
        }

        // if we're here it meas there were not enough factors...
        return -1;
    }
}
