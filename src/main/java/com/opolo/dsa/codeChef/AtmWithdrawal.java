package com.opolo.dsa.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtmWithdrawal {

	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		double withdraw = 0.00;
		double accBal = 0.00;
		double bankCharge = 0.50;
		double remBal = 0.0;

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String line = br.readLine();

		if(line.length() != 0){
			String[] token = line.split(" ");
			if(token.length != 0){
				withdraw = Double.parseDouble(token[0]);
				accBal = Double.parseDouble(token[1]);
			}
		}
		System.out.println("Withdraw : "+withdraw);
		System.out.println("Acct Bal : "+accBal);

		if(withdraw > accBal) {
			System.out.printf("Value: %.2f", accBal);
		}else {
			if(withdraw % 5 == 0) {
				remBal = accBal - withdraw - bankCharge;
				System.out.printf("Value: %.2f", remBal);
			}else {
				System.out.printf("Value: %.2f", accBal);
			}
		}
	}

}
