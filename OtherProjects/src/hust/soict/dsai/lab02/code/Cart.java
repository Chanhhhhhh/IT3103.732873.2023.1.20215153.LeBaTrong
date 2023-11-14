package hust.soict.dsai.lab02.code;

public class Cart {
    // Lê Bá Trọng - 20215153
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public  int qutyOrdered = 0; // số lượng DVD trong giỏ hàng

    // thêm DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qutyOrdered == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full"); // check full
        else {
            itemsOrdered[qutyOrdered] = disc;
            qutyOrdered++;
            System.out.println("The disc has been added"); // add success
        }
    }


    // xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qutyOrdered == 0) System.out.println("The cart is already empty"); // check empty
        else {

            // tạo 1 array mới
            DigitalVideoDisc[] new_arr = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
            for(int i=0, k=0;i<qutyOrdered;i++){
                // nếu đó không phải là DVD cần xóa thì lưu vào new_arr
                if(!disc.getTitle().equals(itemsOrdered[i].getTitle())){
                    new_arr[k]=itemsOrdered[i];
                    k++;
                }
                else qutyOrdered--;
            }

            itemsOrdered = new_arr; // gán lại giá trị cho itemsOrdered
            System.out.println("The disc has been removed"); // remove success
        }
    }

    // tính tổng chi phí giỏ hàng
    public float totalCost() {
        float sum = 0;
        for(int i = 0; i<qutyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}
