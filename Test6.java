class Test6 {
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		/*
		if(n%2==0){
			System.out.println("¦��");
		}else{
			System.out.println("Ȧ��");
		}
		*/
		String result=(n%2==0)? "¦��" :"Ȧ��"
		System.out.println(result);
	}
}
