package tonhi.com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTapArrayList {
/**
 * Viết chương trinhf quản lý số đt với các yêu càu
 * Khi chạy phần mềm có Mennu chọn lựa
 * 	1.Thêm số Đt
 * 	2.Sửa số ĐT
 * 	3.Tìm số đt( chỉ nhớ mang máng 3 số cuối)
 * 	4.Xóa số đt bất kỳ
 * 	5.Xuất toàn bộ số ĐT trong danh bạ
 * 	6. thoát phần mềm
 * @param args
 */
	static ArrayList<String> dsPhone=new ArrayList<String>();
	
	public static void main(String[] args) 
	{
		do 
		{
		menu();
		}
		while(true);
	}
	static void menu() {
		System.out.println("Mời bạn chọn chức năng");
		System.out.println("1.Thêm số điện thoại");
		System.out.println("2.Sửa số điện thoại");
		System.out.println("3.Tìm số điện thoại");
		System.out.println("4.Xóa số điện thoại bất kỳ");
		System.out.println("5.Xuất toàn bộ số ĐT trong danh bạ");
		System.out.println("6. thoát phần mềm");
		int kq = new Scanner(System.in).nextInt();
		switch (kq) 
		{
		case 1:
			 themMoiPhone();
			 break;
		case 2:
			 suaPhone();
			 break;
		case 3:
			 timPhone();
			 break;
		case 4:
			 xoaPhone();
			 break;
		case 5:
			 xuatPhone();
			 break;
		case 6:
			 System.out.println("Tạm biệt!!!");
			 System.exit(0);
		}
	}
	
	private static void xuatPhone() {
		System.out.println("-----------------");
		System.out.println("Danh sách số ĐT");
		for(String s: dsPhone) {
			System.out.println(s);
		}
	}
	private static void xoaPhone() {
		for(int i=0; i<dsPhone.size();i++) {
			System.out.println((i+1)+".\t"+dsPhone.get(i));
		}
		System.out.println("Vị trí bạn muốn xóa phone?");
		int vitrixoa = new Scanner(System.in).nextInt();
		
		dsPhone.remove(vitrixoa-1);
		
	}
	private static void timPhone() {
		System.out.println("Hãy nhập các số cuối đt");
		String p = new Scanner( System.in).nextLine();
		for(int i=0; i<dsPhone.size();i++) {
			String phone = dsPhone.get(i);
			if(phone.endsWith(p)) {
				System.out.println(phone);
			}
		}
	}
	private static void suaPhone() {
		for(int i=0; i<dsPhone.size();i++) {
			System.out.println((i+1)+".\t"+dsPhone.get(i));
		}
		System.out.println("Vị trí bạn muốn sửa phone?");
		int vitrisua = new Scanner(System.in).nextInt();
		System.out.println("Nhập số phone mới");
		String phone = new Scanner(System.in).nextLine();
		dsPhone.set(vitrisua-1, phone);
		
		
	}
	private static void themMoiPhone() {
		System.out.println("Mời bạn nhập số phone");
		String p = new Scanner(System.in).nextLine();
		dsPhone.add(p);
		
	}
}
