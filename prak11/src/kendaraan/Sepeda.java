package kendaraan;

public class Sepeda {
        private boolean isAuto;
        public Sepeda(boolean isAuto){
            this.isAuto = isAuto;
        }
        public void jenis() {
            if (isAuto == true) {
                System.out.println("Sepeda otomatis");
        }   else {
                System.out.println("Sepeda kayuh");
        }
    }
}