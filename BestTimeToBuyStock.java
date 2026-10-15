class BestTimeToBuyStock 
{
	public static void main(String[] args) 
	{
		int prices[] = {7,6,4,3,1};
		
		int n = prices.length;
		int maxProfit = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;;
		
		for(int i=0;i<n;i++)
		{
			if(prices[i]<min){
				min=prices[i];
		}
		int profit=prices[i]-min;
			maxProfit = Math.max(profit, maxProfit);
		}
		System.out.println(maxProfit);
	}
}



	//for(int i=0; i<n; i++)
		//{
		//	for(int j=i+1; j<n; j++)
		//	{
		//		int profit = prices[j] - prices[i];
		//		
		//		maxProfit = Math.max(profit, maxProfit);
		//	}
		//}
		//System.out.println(maxProfit);