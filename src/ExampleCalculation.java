class ExampleCalculation {
    public static void main(String[] args) {
        // Khởi tạo biến chuỗi với giá trị null
        String str = null;
        String message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);

        // Khởi tạo biến String với giá trị null
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);
    }
}
