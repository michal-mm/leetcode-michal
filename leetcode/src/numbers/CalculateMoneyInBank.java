package numbers;

/**
 * Hercy wants to save money for his first car.
 * He puts money in the Leetcode bank every day.
 * ---
 * He starts by putting in $1 on Monday, the first day.
 * Every day from Tuesday to Sunday,
 * he will put in $1 more than the day before.
 * On every subsequent Monday, he will put in $1 more
 * than the previous Monday.
 * ---
 * Given n, return the total amount of money he will have
 * in the Leetcode bank at the end of the nth day.
 */
public class CalculateMoneyInBank {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int firstDayAmount = 1;

        while (n > 0) {
            int days = Math.min(n, 7);
            totalMoney += days * (firstDayAmount+firstDayAmount+days-1)/2;
            n -= 7;
            firstDayAmount++;
        }

        return totalMoney;
    }
}
