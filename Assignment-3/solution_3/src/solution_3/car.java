package solution_3;

import java.util.Scanner;

public class car {

			int day;
			int parkingfees;
			float miliespergallon;
			float gasoline;
			int toll;
			float gallons;

			public car(int day, int parkingfees, float miliespergallon, float gasoline, int toll, float gallons) {

				this.day = day;
				this.parkingfees = parkingfees;
				this.miliespergallon = miliespergallon;
				this.gasoline = gasoline;
				this.toll = toll;
				this.gallons = gallons;
			}

			public car() {

			}

			public int getDay() {
				return day;
			}

			public void setDay(int day) {
				this.day = day;
			}

			public int getParkingfees() {
				return parkingfees;
			}

			public void setParkingfees(int parkingfees) {
				this.parkingfees = parkingfees;
			}

			public float getMiliespergallon() {
				return miliespergallon;
			}

			public void setMiliespergallon(float miliespergallon) {
				this.miliespergallon = miliespergallon;
			}

			public float getGasoline() {
				return gasoline;
			}

			public void setGasoline(float gasoline) {
				this.gasoline = gasoline;
			}

			public int getToll() {
				return toll;
			}

			public void setToll(int toll) {
				this.toll = toll;
			}

			public float getGallons() {
				return gallons;
			}

			public void setGallons(float gallons) {
				this.gallons = gallons;
			}

			public void acceptCar() {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter day=");
				day = sc.nextInt();
				System.out.println("enter parkingfees=");
				parkingfees = sc.nextInt();
				System.out.println("enter miliespergallon=");
				miliespergallon = sc.nextFloat();
				System.out.println("enter gasoline=");
				miliespergallon = sc.nextFloat();
				System.out.println("enter toll=");
				toll = sc.nextInt();

			}

			void calculateperday() {
				float totalcost = ((miliespergallon / gallons) * gasoline) + parkingfees + toll;

			}

		


	}


