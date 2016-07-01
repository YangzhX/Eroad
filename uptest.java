@Test
	public void testUpLoadFromDisk(){
		try {
			FileInputStream in=new FileInputStream(new File("D:/test.txt"));
			boolean flag = uploadFile("127.0.0.1", 21, "test", "test", "D:/ftp", "test.txt", in);
			System.out.println(flag);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}<pre></pre>