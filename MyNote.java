package silsub1;

import java.util.*;
import java.io.*;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	
	public MyNote() {}
	
	public void fileSave() {
		
		/*BufferedWriter br = new BufferedWriter(fw);
		FileWriter fw = new FileWriter();*/
		String fn = null;
		
		StringBuilder sb = new StringBuilder();
		System.out.println("파일에 저장할 내용을 입력하시오.");
		String typing = null;
	
			while(!(typing = sc.nextLine()).equals("exit")) {
				sb.append(typing + "\n");
				}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		/*char ch = sc.next().toUpperCase().charAt(0);*/
		if(sc.next().toUpperCase().charAt(0) == 'Y') {
			System.out.print("저장할 파일명(txt) : ");
			fn = sc.next();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fn))) {
		
		System.out.println(fn + "파일에 성공적으로 저장하였습니다.");
		bw.write(sb.toString());
		bw.flush();
		
		} catch(IOException e) {
			e.printStackTrace();
		}
				
	}
	
	public void fileOpen() {
		System.out.print("열기할 파일명 : ");
		String fn = sc.next();
		
		try(BufferedReader brr = new BufferedReader(new FileReader(fn))) {
			
			StringBuilder sb = new StringBuilder();
			String str = null;
			
			while((str = brr.readLine()) != null) {
			sb.append(str + "\n");
			}
			System.out.println("==== 내용 ====");
			System.out.println(sb.toString());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일명 : ");
		String fn = sc.next();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fn, true));) {
			
			StringBuilder sb = new StringBuilder();
			System.out.println("파일에 추가할 내용을 입력하세요.");
			String typing = null;
			
			while(!(typing = sc.nextLine()).equals("exit")) {
				sb.append(typing + "\n");
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			if(sc.next().toUpperCase().charAt(0) == 'Y') {
				bw.write(sb.toString());
				System.out.println(fn + " 파일의 내용이 변경되었습니다.");
			}
			
			System.out.println();
			bw.flush();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}