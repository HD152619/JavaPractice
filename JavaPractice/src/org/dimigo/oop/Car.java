/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public class Car
{
	private String title = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxspeed = 225;
	private int price = 50000000;
	
	public String gettitle()
	{
		return title;
	}
	
	public String getmodel()
	{
		return model;
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public int getmaxspeed()
	{
		return maxspeed;
	}
	
	public int getprice()
	{
		return price;
	}
	
	
	public void settitle(String newtitle)
	{
		title = newtitle;
	}
	
	public void setmodel(String newmodel)
	{
		model = newmodel;
	}
	
	public void setcolor(String newcolor)
	{
		color = newcolor;
	}
	
	public void setmaxspeed(int newmaxspeed)
	{
		maxspeed = newmaxspeed;
	}
	
	public void setprice(int newprice)
	{
		price = newprice;
	}
}