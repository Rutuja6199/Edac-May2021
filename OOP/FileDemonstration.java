import java.io.*;
import java.util.Scanner;
public class FileDemonstration {

		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter File or Directory name:");
			analyzepath(sc.nextLine());
		}
		
		public static void analyzepath(String path)
		{
			File name=new File(path);
			
			if(name.exists())
			{
				System.out.printf("%s is exists",name.getName());
				System.out.printf("\n%s ",name.isFile() ?"is file":"is not file");
				System.out.printf("\n%s ",name.isDirectory() ?"is Directory":"is not Directory");
				System.out.printf("\n%s ",name.isAbsolute() ?"is Absolute path":"is not Absolute path");
				System.out.printf("\nLast Modified : %s ",name.lastModified());
				System.out.printf("\nLength is : %s ",name.length());
				System.out.printf("\nPath is : %s ",name.getPath());
				System.out.printf("\nAbsolute Path  is : %s ",name.getAbsolutePath());
				System.out.printf("\nParent is : %s \n",name.getParent());
				
				if(name.isDirectory())
				{
					String dir[]=name.list();
					System.out.println("---------This directory contains----------:");
					
					for(String dirname:dir)
						System.out.println(dirname);
				}
			}
			else
			{
				System.out.printf("\n %s is does not exists",path);
			}
			
		}
}
