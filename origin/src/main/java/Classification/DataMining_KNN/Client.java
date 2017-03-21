package Classification.DataMining_KNN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * k最近邻算法场景类型
 *
 * @author lyq
 */
public class Client {
    public static void main(String[] args) {
        String trainDataPath = Client.class.getResource("trainInput.txt").getPath();
        String testDataPath = Client.class.getResource("testinput.txt").getPath();

        KNNTool tool = new KNNTool(trainDataPath, testDataPath);
        tool.knnCompute(3);
    }
}
