class Solution {
    public double[] convertTemperature(double celsius) {
        // double kel=celsius + 273.15;
        // double fa=celsius * 1.80 + 32.00;
        // DecimalFormat df=new DecimalFormat("#.#####");
        // String str1=df.format(kel);
        // String str2=df.format(fa);
        double arr[]=new double[2];
        // arr[0]=Double.parseDouble(str1);
        //  arr[1]=Double.parseDouble(str2);
        arr[0]=celsius + 273.15;
        arr[1]=celsius * 1.80 + 32.00;
        return arr;
        
 
    }
}