class Test10 {
	public static void main(String[] args){
		for(int a=1; a<=5;a++){
			for(int i=1;i<=5;i++){
				if(a==i){//Ãþ¼ö¿Í È£¼ö°¡ °°Àº °©ÀÌ¶ó¸é
					System.out.print("¡Ú");
				}else{
					System.out.print("¡Ù");
				}
			}
			System.out.println();//Ãþ¼ö¸¸Å­ ÁÙ¹Ù²Þ
		}
	}
}
