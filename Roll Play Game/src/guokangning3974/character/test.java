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
     * 第一个角色的创建
     */
	if(i==1) 
	{
		      
		      Scanner sc1=new Scanner(System.in);
              String str=null;
              System.out.print("请输入角色名字:");
			  str=sc1.nextLine();
			  Characters character1=new Queen(str);
			  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			  /**
			   * 第二个角色的创建
			   */
				Scanner sc2=new Scanner(System.in);
				int j=sc2.nextInt();
				if(j==1) 
				{
					      Scanner sc3=new Scanner(System.in);
			              String str1=null;
			              System.out.print("请输入角色名字:");
						  str1=sc3.nextLine();
					      Characters character2= new Queen(str1);
					      while(character1.hitpoint>0&&character2.hitpoint>0) {
					    	  /**
					    	   * 当前玩家若被使用frozen魔法，失去一次进攻或使用魔法的机会
					    	   */
					    	  if(character1.frozenchoice==1)
					    	  {
					    		  System.out.println("the player has been frozen, skip to next player");
					    		  character1.frozenchoice=0;
					    	  }
					    	  else {
					    		  
					    		  System.out.println("please choose the first player's operation:1.fight 2.do magic");
					    		  /**
					    		   * 用户键入选择使用魔法还是进攻
					    		   */
					    		  Scanner sc4=new Scanner(System.in);
						    		int h=sc4.nextInt();
						    		/**
						    		 * 判断魔法值是否大于80，若魔法值小于80则无法进攻，必须使用recover魔法恢复魔法值
						    		 */
					    		  if(character1.magicpoint<80)
					    			{
					    				System.out.println("your magicpoint is too low, please do magic to recover");
					    				h=2;
					    			}
					    		ok: if(h==1)
					    		{
					    			/**
					    			 * 若对方上回合使用invisible魔法，则本回合攻击无效
					    			 */
					    			if(character2.invisiblechoice==1)
					    			{
					    				System.out.println("the opponebt is invisible, skip this fight");
					    				character2.invisiblechoice=0;
					    				break ok;
					    				/**
					    				 * 跳出攻击
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
					    	   * 一位玩家进攻或使用魔法结束后根据对方hitpoint是否小于等于零来判断游戏是否结束
					    	   */
					    	  if(character1.hitpoint<=0)
					    	  {
					    		  System.out.println("the"+character1.name+"is dead, the"+character2.name+"win");
					    		  System.exit(0);
					    	  }
					    	  /**
					    	   * 轮到第二位玩家开始操作
					    	   * 以下情况与第一位玩家操作阶段一致
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
					 * 当第二位玩家的选择为2号角色时
					 * 以下操作同上
					 */
				{
					Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("请输入角色名字:");
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
					 * 当第二位玩家的选择为3号角色时
					 * 以下操作同上
					 */
				{
					Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("请输入角色名字:");
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
					 * 当第二位玩家的选择为4号角色时
					 * 以下操作同上
					 */
				{

					Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("请输入角色名字:");
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
		 * 一号玩家创建角色的第二种选择，以下操作与第一种选择相似
		 */
	{
		Scanner sc1=new Scanner(System.in);
        String str=null;
        System.out.print("请输入角色名字:");
		  str=sc1.nextLine();
		  Characters character1=new King(str);
		  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			Scanner sc2=new Scanner(System.in);
			int j=sc2.nextInt();
			if(j==1) 
			{
				      Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
		 * 一号玩家创建角色的第三种选择，以下操作与第一种选择相似
		 */
	{
		Scanner sc1=new Scanner(System.in);
        String str=null;
        System.out.print("请输入角色名字:");
		  str=sc1.nextLine();
		  Characters character1=new Knight(str);
		  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			Scanner sc2=new Scanner(System.in);
			int j=sc2.nextInt();
			if(j==1) 
			{
				      Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
		 * 一号玩家创建角色的第四种选择，以下操作与第一种选择相似
		 */
	{
		Scanner sc1=new Scanner(System.in);
        String str=null;
        System.out.print("请输入角色名字:");
		  str=sc1.nextLine();
		  Characters character1=new Troll(str);
		  System.out.println("please choose the character of the second roll: 1.Queen 2.King 3.Knight 4.Troll");
			Scanner sc2=new Scanner(System.in);
			int j=sc2.nextInt();
			if(j==1) 
			{
				      Scanner sc3=new Scanner(System.in);
		              String str1=null;
		              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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
	              System.out.print("请输入角色名字:");
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

