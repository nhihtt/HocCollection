package tonhi.com.baitaptuluyen;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTap2 {
	static HashMap<Integer , String > dsSinhVien= new HashMap<Integer, String>();
	public static void main(String[] args) {
		do
		{
			menu();
		}
		while(true);
	}

	private static void menu() {
		System.out.println("Chương trình quản lí sinh viên");
		System.out.println("------------------------------------");
		System.out.println("1.Thêm sinh viên");
		System.out.println("2.Xuất danh sách sinh viên");
		System.out.println("3.Sửa sinh viên");
		System.out.println("4.Xóa sinh viên chứa tên bất kỳ");
		System.out.println("5.Tìm sinh viên mà tên có chữ An");
		System.out.println("6.Xuất ra các mã sinh viên(chỉ mã)");
		System.out.println("7.Xuất ra các tên sinh viên(chỉ tên)");
		System.out.println("8.Thoát");
		System.out.println("------------------------------------");
		int kq = new Scanner(System.in).nextInt();
		switch(kq) 
		{
		case 1:
			themSinhVien();
			break;
		case 2:
			xuatDanhSach();
			break;
		case 3:
			suaSinhVien();
			break;
		case 4:
			xoaSinhVien();
			break;
		case 5:
			timSinhVien();
			break;
		case 6:
			xuatMaSinhVien();
			break;
		case 7:
			xuatTenSinhVien();
			break;
		case 8:
			System.out.println("Tạm biệt!!!");
			System.exit(0);
			
			
		}
		
	}

	private static void xuatTenSinhVien() {
		System.out.println("Tất cả tên sinh viên trong danh sách");
		for(Map.Entry<Integer, String> item: dsSinhVien.entrySet()) {
			System.out.println(item.getValue());
		}
		
	}

	private static void xuatMaSinhVien() {
		System.out.println("Tất cả mã sinh viên trong danh sách");
		for(Map.Entry<Integer, String> item: dsSinhVien.entrySet()) {
			System.out.println(item.getKey());
		}
	}

	private static void timSinhVien() {
		System.out.print("Nhập tên sinh viên bạn muốn tìm: ");
		String tenSV = new Scanner(System.in).nextLine();
		int dem=0;
		for(Map.Entry<Integer, String> item : dsSinhVien.entrySet()) {
			if (item.getValue().contains(tenSV)) {
				System.out.println(item.getKey()+ " \t "+ item.getValue());
			}
			else dem++;
			
		}
		if(dem==dsSinhVien.size()) System.out.println("Không có sinh viên bạn muốn tìm");
	}

	private static void xoaSinhVien() {
		System.out.print("Mời bạn nhập mã muốn xóa: " );
		int maSV = new Scanner(System.in).nextInt();
		if(dsSinhVien.containsKey(maSV)==false) {
			System.out.println("Mã "+ maSV+ " không có trong danh sách sinh viên!!");
		}
		else {
			dsSinhVien.remove(maSV);
		}
	}

	private static void suaSinhVien() 
	{
		System.out.print("Mời bạn nhập mã muốn sửa: " );
		int maSV = new Scanner(System.in).nextInt();
		if(dsSinhVien.containsKey(maSV)==false) {
			System.out.println("Mã "+ maSV+ " không có trong danh sách sinh viên!!");
		}
		else 
		{
			System.out.print("Nhập tên sinh viên muốn sửa: ");
			String tenSV =new Scanner(System.in).nextLine();
			dsSinhVien.put(maSV, tenSV);
		}
	}

	private static void xuatDanhSach() {
		System.out.println("Mã \t Tên SV");
		for(Map.Entry<Integer, String> item :dsSinhVien.entrySet()) {
			System.out.println(item.getKey()+" \t "+item.getValue());
		}
	}

	private static void themSinhVien() {
		System.out.print("Hãy nhập mã sinh viên bạn muốn thêm: ");
		int maSV= new Scanner(System.in).nextInt();
		System.out.print("Hãy nhập tên sinh viên đó: ");
		String tenSV = new Scanner(System.in).nextLine();
		if(dsSinhVien.containsKey(maSV)==false)
		{
		dsSinhVien.put(maSV, tenSV);
		}
	}

}
