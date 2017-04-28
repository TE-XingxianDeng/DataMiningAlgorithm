package BaggingAndBoosting.DataMining_AdaBoost;

/**
 * AdaBoost提升算法调用类
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] agrs){
		String filePath = Client.class.getResource("input.txt").getPath();
		//误差率阈值
		double errorValue = 0.2;
		
		AdaBoostTool tool = new AdaBoostTool(filePath, errorValue);
		tool.adaBoostClassify();
	}
}
