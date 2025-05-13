package hus.oop.mynumbersystem;

import java.util.ArrayList;
import java.util.List;

public class NumberSystemController {
    private ANumber originalNumber;
    private List<NumberSystemConverter> converters;  // Danh sách các converter theo observer pattern

    public NumberSystemController() {
        this.converters = new ArrayList<>();
    }

    /**
     * Thêm vào converter để quan sát số ban đầu.
     * @param converter
     */
    public void registerConverter(NumberSystemConverter converter) {
        this.converters.add(converter);
    }

    /**
     * Hủy quan sát số ban đầu của converter.
     * @param converter
     */
    public void unregisterConverter(NumberSystemConverter converter) {
        this.converters.remove(converter);
    }

    /**
     * Khi có sự thay đổi trạng thái (biểu diễn số hoặc cơ số), thông báo cho tất cả
     * các converter đang ký quan sát để cập nhật lại trạng thái theo dữ liệu mới.
     */
    public void notifyConverters() {
        for (NumberSystemConverter converter : converters) {
            converter.update(originalNumber);
        }
    }

    public String getNumberPresentation() {
        return originalNumber.getNumberPresentation();
    }

    public void setNumberPresentation(String numberPresentation) {
        originalNumber.setNumberPresentation(numberPresentation);
        onStateChanged();
    }

    public int getRadix() {
        return originalNumber.getRadix();
    }

    public void setRadix(int radix) {
        originalNumber.setRadix(radix);
        onStateChanged();
    }

    /**
     * Được gọi khi có sự thay đổi về trạng thái (biểu diến số hoặc cơ số),
     * hàm này sẽ gọi hàm để thông báo cho tất cả các observer đang ký quan sát
     * cập nhật lại trạng thái.
     */
    private void onStateChanged() {
        notifyConverters();
    }
}
