package guokangning3974.character;
import guokangning3974.behavior.*;
import java.util.Scanner;
public class test {
public static void main(String[] args)
{

	System.out.println("welcome to the game! please create two rolls.");
	System.out.println("please choose the character of the first roll: 1.Queen 2.King 3.Knight 4.Troll");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	/**
     * ��һ����ɫ�Ĵ���
     */
	if(i==1) 
	{
		      
		      Scanner sc1=new Scanner(System.in);
              String str=null;
              System.out.print("�������ɫ����:");
			  str=sc1.nextLine();
			  Characters character1=new Queen(str);
			  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			  /**
			   * �ڶ�����ɫ�Ĵ���
			   */
				Scanner sc2=new Scanner(System.in);
				int j=sc2.nextInt();
				if(j==1) 
				{
					      Scanner sc3=new Scanner(System.in);
			              String str1=null;
			              System.out.print("�������ɫ����:");
						  str1=sc3.nextLine();
					      Characters character2= new Queen(str1);
					      while(character1.hitpoint>0&&character2.hitpoint>0) {
					    	  /**
					    	   * ��ǰ�������ʹ��frozenħ����ʧȥһ�ν�����ʹ��ħ���Ļ���
					    	   */
					    	  if(character1.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character1.frozenchoice=0;
					    	  }
					    	  else {
					    		  
					    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
					    		  /**
					    		   * �û�����ѡ��ʹ��ħ�����ǽ���
					    		   */
					    		  Scanner sc4=new Scanner(System.in);
						    		int h=sc4.nextInt();
						    		/**
						    		 * �ж�ħ��ֵ�Ƿ����80����ħ��ֵС��80���޷�����������ʹ��recoverħ���ָ�ħ��ֵ
						    		 */
					    		  if(character1.magicpoint<80)
					    			{
					    				System.out.println("your magicpoint is too low, please do magic to recover");
					    				h=2;
					    			}
					    		ok: if(h==1)
					    		{
					    			/**
					    			 * ���Է��ϻغ�ʹ��invisibleħ�����򱾻غϹ�����Ч
					    			 */
					    			if(character2.invisiblechoice==1)
					    			{
					    				System.out.println("the opponebt is invisible, skip this fight");
					    				character2.invisiblechoice=0;
					    				break ok;
					    				/**
					    				 * ��������
					    				 */
					    			}
					    			character1.fight(character2);
					    		}
					    		if(h==2)
					    		{
					    		  character1.performMagic(character2);
					    		}
					    		}
					    	  /**
					    	   * һλ��ҽ�����ʹ��ħ����������ݶԷ�hitpoint�Ƿ�С�ڵ��������ж���Ϸ�Ƿ����
					    	   */
					    	  if(character1.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
					    		  System.exit(0);
					    	  }
					    	  /**
					    	   * �ֵ��ڶ�λ��ҿ�ʼ����
					    	   * ����������һλ��Ҳ����׶�һ��
					    	   */
					    		if(character2.frozenchoice==1)
						    	  {
						    		  System.out.println("the player has been frozen, skip to next player");
						    		  character2.frozenchoice=0;
						    	  }
					    		else {
					    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
					    	    Scanner sc5=new Scanner(System.in);
					    		int g=sc5.nextInt();
					    		if(character2.magicpoint<80)
				    			{
				    				System.out.println("your magicpoint is too low, please do magic to recover");
				    				g=2;
				    			}
					    		ok1: if(g==1)
					    		{
					    			if(character1.invisiblechoice==1)
					    			{
					    				System.out.println("the opponebt is invisible, skip this fight");
					    				character1.invisiblechoice=0;
					    				break ok1;
					    			}
					    			character2.fight(character1);
					    		}
					    		if(g==2)
					    		{
					    		  character2.performMagic(character1);
					    		}
					    		}
					    		if(character2.hitpoint<=0)
						    	  {
						    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
						    		  System.exit(0);
						    	  }
					      }
					      
				}
				else if(j==2)
					/**
					 * ���ڶ�λ��ҵ�ѡ��Ϊ2�Ž�ɫʱ
					 * ���²���ͬ��
					 */
				{
					Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("�������ɫ����:");
					  str1=sc3.nextLine();
				      Characters character2= new King(str1);
				      while(character1.hitpoint>0&&character2.hitpoint>0) {
				    	  if(character1.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character1.frozenchoice=0;
				    	  }
				    	  else {
				    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
				    	    Scanner sc4=new Scanner(System.in);
				    		int h=sc4.nextInt();
				    		if(character1.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				h=2;
			    			}
				    		ok: if(h==1)
				    		{
				    			if(character2.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character2.invisiblechoice=0;
				    				break ok;
				    			}
				    			character1.fight(character2);
				    		}
				    		if(h==2)
				    		{
				    		  character1.performMagic(character2);
				    		}
				    		}
				    	  if(character1.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
				    		  System.exit(0);
				    	  }
				    		if(character2.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character2.frozenchoice=0;
					    	  }
				    		else {
				    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
				    	    Scanner sc5=new Scanner(System.in);
				    		int g=sc5.nextInt();
				    		if(character2.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				g=2;
			    			}
				    		ok1: if(g==1)
				    		{
				    			if(character1.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character1.invisiblechoice=0;
				    				break ok1;
				    			}
				    			character2.fight(character1);
				    		}
				    		if(g==2)
				    		{
				    		  character2.performMagic(character1);
				    		}
				    		}
				    		if(character2.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
					    		  System.exit(0);
					    	  }
				      }
				}
				else if(j==3)
					/**
					 * ���ڶ�λ��ҵ�ѡ��Ϊ3�Ž�ɫʱ
					 * ���²���ͬ��
					 */
				{
					Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("�������ɫ����:");
					  str1=sc3.nextLine();
				      Characters character2= new Knight(str1);
				      while(character1.hitpoint>0&&character2.hitpoint>0) {
				    	  if(character1.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character1.frozenchoice=0;
				    	  }
				    	  else {
				    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
				    	    Scanner sc4=new Scanner(System.in);
				    		int h=sc4.nextInt();
				    		if(character1.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				h=2;
			    			}
				    		ok: if(h==1)
				    		{
				    			if(character2.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character2.invisiblechoice=0;
				    				break ok;
				    			}
				    			character1.fight(character2);
				    		}
				    		if(h==2)
				    		{
				    		  character1.performMagic(character2);
				    		}
				    		}
				    	  if(character1.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
				    		  System.exit(0);
				    	  }
				    		if(character2.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character2.frozenchoice=0;
					    	  }
				    		else {
				    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
				    	    Scanner sc5=new Scanner(System.in);
				    		int g=sc5.nextInt();
				    		if(character2.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				g=2;
			    			}
				    		ok1: if(g==1)
				    		{
				    			if(character1.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character1.invisiblechoice=0;
				    				break ok1;
				    			}
				    			character2.fight(character1);
				    		}
				    		if(g==2)
				    		{
				    		  character2.performMagic(character1);
				    		}
				    		}
				    		if(character2.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
					    		  System.exit(0);
					    	  }
				      }
				}
				else if (j==4)
					/**
					 * ���ڶ�λ��ҵ�ѡ��Ϊ4�Ž�ɫʱ
					 * ���²���ͬ��
					 */
				{

					Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("�������ɫ����:");
					  str1=sc3.nextLine();
				      Characters character2= new Troll(str1);
				      while(character1.hitpoint>0&&character2.hitpoint>0){
				    	  if(character1.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character1.frozenchoice=0;
				    	  }
				    	  else {
				    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
				    	    Scanner sc4=new Scanner(System.in);
				    		int h=sc4.nextInt();
				    		if(character1.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				h=2;
			    			}
				    		ok: if(h==1)
				    		{
				    			if(character2.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character2.invisiblechoice=0;
				    				break ok;
				    			}
				    			character1.fight(character2);
				    		}
				    		if(h==2)
				    		{
				    		  character1.performMagic(character2);
				    		}
				    		}
				    	  if(character1.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
				    		  System.exit(0);
				    	  }
				    		if(character2.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character2.frozenchoice=0;
					    	  }
				    		else {
				    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
				    	    Scanner sc5=new Scanner(System.in);
				    		int g=sc5.nextInt();
				    		if(character2.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				g=2;
			    			}
				    		ok1: if(g==1)
				    		{
				    			if(character1.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character1.invisiblechoice=0;
				    				break ok1;
				    			}
				    			character2.fight(character1);
				    		}
				    		if(g==2)
				    		{
				    		  character2.performMagic(character1);
				    		}
				    		}
				    		if(character2.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
					    		  System.exit(0);
					    	  }
				      }
				}
				
	}
	else if(i==2)
		/**
		 * һ����Ҵ�����ɫ�ĵڶ���ѡ�����²������һ��ѡ������
		 */
	{
		Scanner sc1=new Scanner(System.in);
        String str=null;
        System.out.print("�������ɫ����:");
		  str=sc1.nextLine();
		  Characters character1=new King(str);
		  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			Scanner sc2=new Scanner(System.in);
			int j=sc2.nextInt();
			if(j==1) 
			{
				      Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("�������ɫ����:");
					  str1=sc3.nextLine();
				      Characters character2= new Queen(str1);
				      while(character1.hitpoint>0&&character2.hitpoint>0) {
				    	  if(character1.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character1.frozenchoice=0;
				    	  }
				    	  else {
				    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
				    	    Scanner sc4=new Scanner(System.in);
				    		int h=sc4.nextInt();
				    		if(character1.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				h=2;
			    			}
				    		ok: if(h==1)
				    		{
				    			if(character2.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character2.invisiblechoice=0;
				    				break ok;
				    			}
				    			character1.fight(character2);
				    		}
				    		if(h==2)
				    		{
				    		  character1.performMagic(character2);
				    		}
				    		}
				    	  if(character1.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
				    		  System.exit(0);
				    	  }
				    		if(character2.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character2.frozenchoice=0;
					    	  }
				    		else {
				    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
				    	    Scanner sc5=new Scanner(System.in);
				    		int g=sc5.nextInt();
				    		if(character2.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				g=2;
			    			}
				    		ok1: if(g==1)
				    		{
				    			if(character1.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character1.invisiblechoice=0;
				    				break ok1;
				    			}
				    			character2.fight(character1);
				    		}
				    		if(g==2)
				    		{
				    		  character2.performMagic(character1);
				    		}
				    		}
				    		if(character2.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
					    		  System.exit(0);
					    	  }
				      }
				      
			}
			else if(j==2)
			{
				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new King(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0) {
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			else if(j==3)
			{
				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new Knight(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0) {
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			else if (j==4)
			{

				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new Troll(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0){
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			
	}
	else if(i==3)
		/**
		 * һ����Ҵ�����ɫ�ĵ�����ѡ�����²������һ��ѡ������
		 */
	{
		Scanner sc1=new Scanner(System.in);
        String str=null;
        System.out.print("�������ɫ����:");
		  str=sc1.nextLine();
		  Characters character1=new Knight(str);
		  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			Scanner sc2=new Scanner(System.in);
			int j=sc2.nextInt();
			if(j==1) 
			{
				      Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("�������ɫ����:");
					  str1=sc3.nextLine();
				      Characters character2= new Queen(str1);
				      while(character1.hitpoint>0&&character2.hitpoint>0);{
				    	  if(character1.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character1.frozenchoice=0;
				    	  }
				    	  else {
				    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
				    	    Scanner sc4=new Scanner(System.in);
				    		int h=sc4.nextInt();
				    		if(character1.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				h=2;
			    			}
				    		ok: if(h==1)
				    		{
				    			if(character2.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character2.invisiblechoice=0;
				    				break ok;
				    			}
				    			character1.fight(character2);
				    		}
				    		if(h==2)
				    		{
				    		  character1.performMagic(character2);
				    		}
				    		}
				    	  if(character1.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
				    		  System.exit(0);
				    	  }
				    		if(character2.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character2.frozenchoice=0;
					    	  }
				    		else {
				    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
				    	    Scanner sc5=new Scanner(System.in);
				    		int g=sc5.nextInt();
				    		if(character2.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				g=2;
			    			}
				    		ok1: if(g==1)
				    		{
				    			if(character1.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character1.invisiblechoice=0;
				    				break ok1;
				    			}
				    			character2.fight(character1);
				    		}
				    		if(g==2)
				    		{
				    		  character2.performMagic(character1);
				    		}
				    		}
				    		if(character2.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
					    		  System.exit(0);
					    	  }
				      }
				      
			}
			else if(j==2)
			{
				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new King(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0); {
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			else if(j==3)
			{
				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new Knight(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0){
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			else if (j==4)
			{

				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new Troll(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0){
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			
	}
	else if(i==4)
		/**
		 * һ����Ҵ�����ɫ�ĵ�����ѡ�����²������һ��ѡ������
		 */
	{
		Scanner sc1=new Scanner(System.in);
        String str=null;
        System.out.print("�������ɫ����:");
		  str=sc1.nextLine();
		  Characters character1=new Troll(str);
		  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			Scanner sc2=new Scanner(System.in);
			int j=sc2.nextInt();
			if(j==1) 
			{
				      Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("�������ɫ����:");
					  str1=sc3.nextLine();
				      Characters character2= new Queen(str1);
				      while(character1.hitpoint>0&&character2.hitpoint>0);{
				    	  if(character1.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character1.frozenchoice=0;
				    	  }
				    	  else {
				    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
				    	    Scanner sc4=new Scanner(System.in);
				    		int h=sc4.nextInt();
				    		if(character1.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				h=2;
			    			}
				    		ok: if(h==1)
				    		{
				    			if(character2.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character2.invisiblechoice=0;
				    				break ok;
				    			}
				    			character1.fight(character2);
				    		}
				    		if(h==2)
				    		{
				    		  character1.performMagic(character2);
				    		}
				    		}
				    	  if(character1.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
				    		  System.exit(0);
				    	  }
				    		if(character2.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character2.frozenchoice=0;
					    	  }
				    		else {
				    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
				    	    Scanner sc5=new Scanner(System.in);
				    		int g=sc5.nextInt();
				    		if(character2.magicpoint<80)
			    			{
			    				System.out.println("your magicpoint is too low, please do magic to recover");
			    				g=2;
			    			}
				    		ok1: if(g==1)
				    		{
				    			if(character1.invisiblechoice==1)
				    			{
				    				System.out.println("the opponebt is invisible, skip this fight");
				    				character1.invisiblechoice=0;
				    				break ok1;
				    			}
				    			character2.fight(character1);
				    		}
				    		if(g==2)
				    		{
				    		  character2.performMagic(character1);
				    		}
				    		}
				    		if(character2.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
					    		  System.exit(0);
					    	  }
				      }
				      
			}
			else if(j==2)
			{
				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new King(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0); {
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			else if(j==3)
			{
				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new Knight(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0){
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character2.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			else if (j==4)
			{

				Scanner sc3=new Scanner(System.in);
	              String str1=null;
	              System.out.print("�������ɫ����:");
				  str1=sc3.nextLine();
			      Characters character2= new Troll(str1);
			      while(character1.hitpoint>0&&character2.hitpoint>0);{
			    	  if(character1.frozenchoice==1)
			    	  {
			    		  System.out.println("the player has been frozen, skip to next player");
			    		  character1.frozenchoice=0;
			    	  }
			    	  else {
			    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
			    	    Scanner sc4=new Scanner(System.in);
			    		int h=sc4.nextInt();
			    		if(character1.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				h=2;
		    			}
			    		ok: if(h==1)
			    		{
			    			if(character2.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character2.invisiblechoice=0;
			    				break ok;
			    			}
			    			character1.fight(character2);
			    		}
			    		if(h==2)
			    		{
			    		  character1.performMagic(character2);
			    		}
			    		}
			    	  if(character1.hitpoint<=0)
			    	  {
			    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
			    		  System.exit(0);
			    	  }
			    		if(character2.frozenchoice==1)
				    	  {
				    		  System.out.println("the player has been frozen, skip to next player");
				    		  character2.frozenchoice=0;
				    	  }
			    		else {
			    	    System.out.println("please choose the second player's operation:1.fight 2.do magic");
			    	    Scanner sc5=new Scanner(System.in);
			    		int g=sc5.nextInt();
			    		if(character2.magicpoint<80)
		    			{
		    				System.out.println("your magicpoint is too low, please do magic to recover");
		    				g=2;
		    			}
			    		ok1: if(g==1)
			    		{
			    			if(character1.invisiblechoice==1)
			    			{
			    				System.out.println("the opponebt is invisible, skip this fight");
			    				character1.invisiblechoice=0;
			    				break ok1;
			    			}
			    			character2.fight(character1);
			    		}
			    		if(g==2)
			    		{
			    		  character2.performMagic(character1);
			    		}
			    		}
			    		if(character2.hitpoint<=0)
				    	  {
				    		  System.out.println("the"+character1.name+"is dead, the"+character1.name+"win");
				    		  System.exit(0);
				    	  }
			      }
			}
			
	}
}
}

