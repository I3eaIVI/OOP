public class Main3 {
    public static void main(String[] args) {
        
        // สร้างลูกค้า
        Customer1 cust = new Customer1("Somsri", "Boonjing");
        
        // สร้างบัญชี
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        
        // เพิ่มบัญชีให้ลูกค้า
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        
        // ทดลองถอนและฝากเงิน
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        
        // แสดงข้อมูลลูกค้า
        System.out.println(cust);
        
        // แสดงรายละเอียดบัญชีทั้งหมด
        System.out.println("==============================");
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
