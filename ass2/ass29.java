class ass29{

	public static void main(String args[]){
		String octal = "7776";
        Integer i = Integer.parseInt(octal,8);
        System.out.println("Integer value: "+i);

        Integer i1 = new Integer(20);
        String binary = Integer.toBinaryString(i1);
        System.out.println("Binary value: "+binary);

        String binary1 = "1101001";
        Integer i2 = Integer.parseInt(binary1,2);
        System.out.println("Integer value: "+i2);

        String str = "23";
        Integer i3 = Integer.valueOf(str);
        System.out.println("The integer value: "+i3);
	}
}