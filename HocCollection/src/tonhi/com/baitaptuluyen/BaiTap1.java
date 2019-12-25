package tonhi.com.baitaptuluyen;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class BaiTap1 {

	static ArrayList<String> dsSinhVien= new ArrayList<String>();
	public static void main(String[] args) 
	{
		do {
			menu();
		}
		while(true);
	}
	
	private static void menu() {
			System.out.println("Mời bạn chọn chức năng");
			System.out.println("------------------------------------");
			System.out.println("1.Thêm sinh viên");
			System.out.println("2.Xuất danh sách sinh viên");
			System.out.println("3.Sửa sinh viên");
			System.out.println("4.Xóa sinh viên chứa tên bất kỳ");
			System.out.println("5.Tìm sinh viên mà tên có chữ An");
			System.out.println("6.Sắp xếp sinh viên");
			System.out.println("7.Xuất ra số lượng sinh viên");
			System.out.println("8.Thoát");
			System.out.println("------------------------------------");
			int kq = new Scanner(System.in).nextInt();
			switch (kq) 
			{
			case 1:
				themSinhVien();
				break;
			case 2:
				xuatDanhSachSV();
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
				sapXepSinhVien();
				break;
			case 7:
				soLuongSinhVien();
				break;
			case 8:
				System.out.println("Tạm biệt!!!");
				System.exit(0);
				
				
			}
				
	}

	private static void soLuongSinhVien() {
		System.out.println("Số lượng sinh viên là "+dsSinhVien.size());
		System.out.println();
	}
	private static void sapXepSinhVien() {

		Collections.sort(dsSinhVien);
		xuatDanhSachSV();
		System.out.println();
		
	}
	private static void timSinhVien() {
		System.out.println("Bạn muốn tìm sinh viên tên gì?");
		String ten =new Scanner(System.in).nextLine();
		int dem=0;
		for( int i=0; i<dsSinhVien.size();i++) 
		{
			String sinhvien = dsSinhVien.get(i);
			if(sinhvien.endsWith(ten)) {
				System.out.println(sinhvien);
			}
			else {
				 dem++;
			}
					
		}
		if(dem==dsSinhVien.size())
			System.out.println("Không có sinh viên nào tên "+ten);
		System.out.println(); 
		
	}
	private static void xoaSinhVien() {
		System.out.println("Bạn muốn xóa sinh viên có tên gì?");
		String ten =new Scanner(System.in).nextLine();
		for( int i=0; i<dsSinhVien.size();i++) 
		{
			String sinhvien = dsSinhVien.get(i);
			if(sinhvien.endsWith(ten)) {
				dsSinhVien.remove(i);
			}
				
		}
	}
	private static void suaSinhVien() 
	{
		for(int i=0; i<dsSinhVien.size();i++) {
			System.out.println((i+1)+".\t"+dsSinhVien.get(i));
		}
		System.out.println("Vị trí sinh viên bạn muốn sửa ?");
		int vitrisua = new Scanner(System.in).nextInt();
		System.out.print("Hãy nhập tên mới: ");
		String sinhvien = new Scanner(System.in).nextLine();
		dsSinhVien.set(vitrisua-1, sinhvien);
	}
	private static void xuatDanhSachSV() {
		System.out.println("Danh sách sinh viên");
		for(String s: dsSinhVien) {
			System.out.println(s);
		}
		
	}
	private static void themSinhVien() {
		System.out.print("Hãy nhập tên sinh viên bạn muốn thêm : ");
		String sinhvien = new Scanner(System.in).nextLine();
		dsSinhVien.add(sinhvien);
		
	}

}
