package hus.oop.decorator;

import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		/* TODO */
	}

	public void init() {
	    /* TODO
		Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [5, 10], gọi là n.
		Khởi tạo ban đầu cửa hàng có:
	    n bánh mỳ ThickcrustBread chỉ có cheese,
	    n bánh mỳ ThickcrustBread chỉ có olives,
	    n bánh mỳ ThickcrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThickcrustBread có olives và sau đó thêm cheese,

	    n bánh mỳ ThincrustBread chỉ có cheese,
	    n bánh mỳ ThincrustBread chỉ có olives,
	    n bánh mỳ ThincrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThincrustBread có olives và sau đó thêm cheese.
		*/
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên theo yêu cầu
	 *  của khác hàng (ví dụ, ThickcrustBread + Cheese + Olives)
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(String bread) {
		/* TODO */
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
	}

	/**
	 * Trả ra các bánh mỳ còn lại trong cửa hàng được sắp xếp theo giá, thứ tự được cho bởi order,
	 *  nếu order là true, sắp xếp theo thứ tự tăng dần,
	 *  nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Chú ý: việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 *  nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 *  nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
	}

	public static void main(String args[]) {
		/* TODO
		 Tạo ra một cửa hàng bánh mỳ, với số bánh mỳ ban đầu được khởi tạo qua phương thức init(),

		 Viết demo các chức năng:
		   - Bán 5 cái bánh mỳ từ cửa hàng
		   - Mỗi lần bán,
		       + in ra những bánh mỳ còn lại trong cửa hàng (theo định dạng: thông tin mỗi bánh mỳ là description + giá,
		         ví dụ, ThickcrustBread + Cheese, Cost 31.0; mỗi bánh mỳ in ra trên một dòng).
		       + in ra số bánh mỳ còn lại theo thứ tự giá giảm dần (theo định dạng như trên).
		   - In ra nhiều nhất 10 cái bánh mỳ có giá cao nhất còn lại trong cửa hàng (theo định dạng như trên)


		 - Hoàn thiện chương trình và thực hiện các chức năng demo, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BreadStore>.txt (Ví dụ, NguyenVanA_123456_BreadStore.txt).
         - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BreadStore>.zip (Ví dụ, NguyenVanA_123456_BreadStore.zip),
          nộp lên classroom.
		 */
	}
}
