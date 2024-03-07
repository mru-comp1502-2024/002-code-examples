package staticExamples;

public class WebData {
    
    private static String dataset;


    public static String getDataset() {
        if (dataset == null) {
            System.out.println("downloading data..."); // this line represents the download
            dataset = "this string represents the data";
        }
        return dataset;
    }

    public static void main(String[] args) {
        // suppose 2 classes both need to use the dataset
        
        WebData.getDataset();

        WebData.getDataset();

        WebData.getDataset();

    }
}
