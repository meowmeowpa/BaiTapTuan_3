class MyClass {
    public static void main(String[] args) {
        // Chuỗi s được thiết lập là chuỗi rỗng và gọi getLength()
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // Chuỗi s được thiết lập giá trị và gọi hàm getLength()
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // Đặt s thành null và gọi getLength()
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }

    // hàm trả về độ dài của chuỗi s.

    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }
}