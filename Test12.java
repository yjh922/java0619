class Test12{
	public static void main(String[] args){
		//���ڿ��� �ٷ�� String�� �޼��� �� split �� �˾ƺ���
		//���� js�� java�� ���� �ٸ� ���������, �Ϲ�����
		//���α׷��� ���� ���ڿ��� �ٷ�� �޼������
		//���� ����ϱ� ������, java api�� js api�� ���ڿ��� ���ؼ��� ���� ����
		String filename=args[0];
		/* split���� ó���ϴ� ���
		String[] arr=filename.split("\\.");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/

		//2) substring()�޼���� ó��
		//filename.substring(0,���� �߰ߵ� index);
		String name=filename.substring(0, filename.indexOf("."));
		System.out.println("������ �̸��� "+name);

		//Ȯ���ڸ� �����Ͽ� ���
		//filename.substring(���̹߰ߵ�index+1,���ϸ��� ��ü ����);
		String ext=filename.substring(filename.indexOf(".")+1,filename.length());
		System.out.println("������ Ȯ���ڸ� "+ext);
	}
}
