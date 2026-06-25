package LeetcodeProblemSeries;

public class RichestCustomer {

	// https://leetcode.com/problems/richest-customer-wealth/description/

	public static void main(String[] args) {

		int[][] accoutns = { { 1, 2, 3 }, { 1, 2, 3 }, };
		System.out.println(maxWealth(accoutns));

	}

	/**
	 * You are given an m x n integer grid accounts where accounts[i][j] is the
	 * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
	 * bank. Return the wealth that the richest customer has.
	 * 
	 * A customer's wealth is the amount of money they have in all their bank
	 * accounts. The richest customer is the customer that has the maximum wealth.
	 */

	/**
	 * Input: accounts = [[1,2,3],[3,2,1]] Output: 6 Explanation: 1st customer has
	 * wealth = 1 + 2 + 3 = 6 2nd customer has wealth = 3 + 2 + 1 = 6
	 */

	public static int maxWealth(int[][] accounts) {

		int maxWealth = 0;

		for (int customer = 0; customer < accounts.length; customer++) {
			int currentWealth = 0;

			for (int banks = 0; banks < accounts[customer].length; banks++) {
				currentWealth = currentWealth + accounts[customer][banks];
			}
			maxWealth = Math.max(maxWealth, currentWealth);
		}
		return maxWealth;
	}

}
