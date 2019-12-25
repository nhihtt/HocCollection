package tonhi.com.arraylist;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ds= new ArrayList<String>();
		ds.add("12345678");
		ds.add("115446");
		ds.add("54646");
		// Muốn xuất toàn bô danh sách
		for(int i=0; i<ds.size();i++)
		{
			String value =ds.get(i);// lấy phần tử thứ i
			//nếu ds là mảng ds[i]
			System.out.println(value);
		}
		// muốn chèn một phần tử vào đầu danh sách 
		ds.add(0, "16454");
		System.out.println();
		//duyệt tưng phần tử trong ds
		for(String s:ds) 
		{
			System.out.println(s);
		}
		//sửa dữ liệu
		ds.set(1, "654561");
		System.out.println("Phần tử thứ 1=  " +ds.get(1));
		//muốn xóa phần tử
		ds.remove(0);
		//lúc này vị trí 1 lên vị trí 0
		
		
	}

}
