package tonhi.com.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class TestHashMap {
// dùng hashmap khi tương tác cơ sở dữ liệu hướng đối tượng
	
	public static void main(String[] args)
	{
		// khai báo 1 cấu trúc dữ liệu HashMap
		//mà nó có thể lưu key có kiểu int, value có kiểu string
		//value được đại diện bởi một key (khóa chính, không trùng nhau)
		HashMap<Integer, String> dsSV= new HashMap<Integer, String>();
		// thêm 1 sinh viên mới
		dsSV.put(1, "Tố Nhi");
		// Tố Nhi được mã hóa thành 1
		dsSV.put(2, "Nhiii");
		// muốn xuất toàn bộ ds (chỉ lấy value)
		Collection<String> values =dsSV.values();
		for(String sv : values) {
			System.out.println(sv);
		}
		// muốn truy xuất tới 1 sinh viên có mã bất kì
		String sv =dsSV.get(1);
		System.out.println("Sinh viên có mã 1 là " +sv);
		// muốn sửa dữ liệu ta lấy 
		dsSV.put(1, "Tố Nhi22");
		System.out.println("SV có mã 1 là" + dsSV.get(1));
		// xóa dữ liệu có khóa chính là 1
		dsSV.remove(1);
		// thường các thao tác xóa ta nên kiểm tra
		if(dsSV.containsKey(1))
			dsSV.remove(1);
		else
			System.out.println("Không có sinh viên nào có mã số 1");
		
	}
// bài tập bài 60
// để làm bài 60 thì làm 58,59
}
