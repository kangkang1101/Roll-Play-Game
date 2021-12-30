package guokangning3974.character;
/**
 * 游戏角色类
 */
import guokangning3974.behavior.*;
import java.util.Scanner;
public abstract class Characters {
protected String name;
protected WeaponBehavior weapon;
protected int hitpoint=100;
protected MagicBehavior magic;
protected int magicpoint=100;
protected int damage;
protected int defense;
protected int damagetotal;
protected int invisiblechoice;
protected int frozenchoice;
public void fight(Characters C)
{
	System.out.println("fight:"+C.name);
	System.out.println("please choose your weapon:1.Sword 2.Knife 3.Bow and Arrow 4.Axe");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	/**
	 * 根据用户键盘输入动态设置角色武器
	 */
	switch(i) {
	case 1:{
		this.setWeaponBehavior(new SwordBehavior());
		this.weapon.useWeapon();
		this.magicpoint=this.magicpoint-6;
		this.damagetotal=this.damage+4;
	}
	break;
	case 2:{
		this.setWeaponBehavior(new KnifeBehavior());
		this.weapon.useWeapon();
		this.magicpoint=this.magicpoint-15;
	    this.damagetotal=this.damage+2;
	}
	break;
	case 3:{
		this.setWeaponBehavior(new BowAndArrowBehavior());
		this.weapon.useWeapon();
		this.magicpoint=this.magicpoint-12;
		this.damagetotal=this.damage+7;
		break;
	}
	case 4:{
		this.setWeaponBehavior(new AxeBehavior());
		this.weapon.useWeapon();
		this.magicpoint=this.magicpoint-4;
		this.damagetotal=this.damage+3;
	}
	break;
	
	}
	System.out.println(C.name+" : hitpoint-"+this.damagetotal);
	C.hitpoint=C.hitpoint-this.damagetotal;
	
}
public void performMagic(Characters C)
{
	System.out.println("do magic to "+C.name);
	System.out.println("please choose the magic 1.invisible 2.heal 3.frozen");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	System.out.println("please choose the magic receiver: 1.yourself 2.opponent");
	Scanner sc1=new Scanner(System.in);
	int a=sc1.nextInt();
	/**
	 * 根据用户键盘输入设置魔法以及作用对象
	 */
	if(a==1) {
	switch(i) {
	case 1:{
		this.setMagicBehavior(new InvisibleBehavior());
		this.invisiblechoice =1;
		this.magic.useMagic();
		}
	break;
	case 2:{
		this.setMagicBehavior(new HealBehavior());
		this.magic.useMagic();
		System.out.println("hitpoint +5, magicpoint +10");
		this.hitpoint=this.hitpoint+5;
		this.magicpoint=this.magicpoint+10;
	}
	break;
	case 3:{
		this.frozenchoice=1;
		this.setMagicBehavior(new FrozenBehavior());
		this.magic.useMagic();
	}
	break;
	}
	}
	else if(a==2) {
		switch(i) {
		case 1:{
			this.setMagicBehavior(new InvisibleBehavior());
			C.invisiblechoice =1;
			this.magic.useMagic();
			}
		break;
		case 2:{
			this.setMagicBehavior(new HealBehavior());
			this.magic.useMagic();
			System.out.println("hitpoint +5, magicpoint +10");
			C.hitpoint=this.hitpoint+5;
			C.magicpoint=this.magicpoint+10;
		}
		break;
		case 3:{
			C.frozenchoice=1;
			this.setMagicBehavior(new FrozenBehavior());
			this.magic.useMagic();
		}
		break;
		}
		
	}
	else {
		System.out.println("please input correct choice!");
	}
	
}
public void setWeaponBehavior(WeaponBehavior w)
{
	this.weapon=w;
}/**动态设置角色武器*/
public void setMagicBehavior(MagicBehavior m)
{
	this.magic=m;
}/**动态设计角色魔法*/
public String getName()
{
	return this.name;
}
public void display()
{
	System.out.println("It's a"+this.name);
}
}
