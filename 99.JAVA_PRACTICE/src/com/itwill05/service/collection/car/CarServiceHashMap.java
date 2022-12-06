package com.itwill05.service.collection.car;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.itwill04.array.car.Car;

public class CarServiceHashMap {
	Car[] carArray = { null, null, new Car("5654", 8), null, null, new Car("3422", 12), null, null, null, null,
					   null, null, null, null, new Car("7789", 11), new Car("1120", 10), null, null, null, null, 
					   null,new Car("2389", 9), null, null, null, null, null, null, null, new Car("5555", 6) };
	private HashMap<String,Car> carMap;
	private int count;// 주차장 구획수

	public CarServiceHashMap() {
		carMap = new HashMap<String,Car>();
		count = 30;
	}

	public CarServiceHashMap(int count) {
		carMap = new HashMap<String,Car>();
		this.count = count;
	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 
	 *   - 주차장이 만차이면 입차실패
	 */
	public boolean ipCha(Car inCar) {
		Car incar= new Car();
		for (int j = 0; j < carArray.length; j++) {
		if(carArray[j]!=null) {
			
			boolean isSuccess = false;
	return isSuccess;
			return false;
		System.out.println("만차");
			
		}
		
	}

	/*
	 * 1. 전체차량출력
	 */
	public void print() {
		for (int i = 0; i < carArray.length; i++) {
			
		}
	}

	/*
	 * 5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar =null;
		findCar=carMap.get(no);
		return findCar;
	}

	/*
	 * 6. 입차시간(8시이후)인자받아서 ArrayList(차객체배열) 참조변수반환
	 */
	public ArrayList<Car> findByInTime(int inTime) {
		ArrayList<Car> findCars = new ArrayList<Car>();
		
		
		
		return findCars;
	}

	/*
	 * 7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차";
	 */
	public Car chulCha(String no, int outTime) {
		Car removeCar= null;
		
		return removeCar;
	}
	/*
	 * 2. 주차전체구획수반환 
	 */
	public int getParkingLotCount() {
		return this.count;
	}
	
	/*
	  3. 주차가능주차구획수반환 
	 */
	public int getAvailableParkingLotCount() {
		return count-carMap.size();
	} 
	
}