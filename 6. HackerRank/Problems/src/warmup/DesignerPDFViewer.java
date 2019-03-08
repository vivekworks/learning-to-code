package warmup;

public class DesignerPDFViewer {
    public static int designerPdfViewer(int[] h, String word) {
        int maxValue=0;
        for(char letter :word.toCharArray()){
            if(maxValue< h[letter-97])
                maxValue=h[letter-97];
        }
        return maxValue*word.length();
    }
}
