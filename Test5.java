class Test5{
	public static void main(String[] args){
		int dan=Integer.parseInt(args[0]);
		for(int a=dan; a>=2;a-- ){//�� ���� ������ ����
				System.out.println(a+"��");
			for(int i=1;i<9;i++){//������ �� �� ���� ����ϴ� 
				System.out.println(a+"*"+i+"="+a*i);
			}
		}


	}
}
