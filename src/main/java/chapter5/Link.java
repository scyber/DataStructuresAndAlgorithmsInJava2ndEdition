package chapter5;

/**
 * Элемент списка
 *
 * @author rassoll
 * @created 14.10.2017
 * @$Author$
 * @$Revision$
 */
public class Link
{
	int iData;
	public double dData;
	Link next;

	Link(int iData, double dData)
	{
		this.iData = iData;
		this.dData = dData;
	}

	void displayLink()
	{
		System.out.print(String.format("{%s, %s}", iData, dData));
	}
}
