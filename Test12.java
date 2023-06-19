class Test12{
	public static void main(String[] args){
		//문자열을 다루는 String의 메서드 중 split 을 알아보자
		//참고 js와 java는 서로 다른 기술이지만, 일반적인
		//프로그래밍 언어에서 문자열을 다루는 메서드들은
		//거의 비숫하기 떄문에, java api와 js api는 문자열에 대해서는 거의 같다
		String filename=args[0];
		/* split으로 처리하는 방법
		String[] arr=filename.split("\\.");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/

		//2) substring()메서드로 처리
		//filename.substring(0,점이 발견된 index);
		String name=filename.substring(0, filename.indexOf("."));
		System.out.println("파일의 이름만 "+name);

		//확장자만 추출하여 출력
		//filename.substring(점이발견된index+1,파일명의 전체 길이);
		String ext=filename.substring(filename.indexOf(".")+1,filename.length());
		System.out.println("파일의 확장자만 "+ext);
	}
}
