class  Test4{
	//main()�޼���� �����ڰ� ���� ȣ���� �Ұ��� �ϰ�
	//java.exe�� ���� ȣ��ǹǷ�, �����ҋ� �Ű������� �ѱ� �� �ִ�.
	public static void main(String[] args) {
		//�Ű������� args�� 0������ ������, �������� �ܼ��� Ȱ���غ���
		int dan=Integer.parseInt(args[0]); //7 "7"
		for(int i=1;i<=9;i++){
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}
