public class Demo025 {
    public static void main(String[] args) {
        String[] f1 = {"Harshu ","Srujan ","Tarak ","priya ","teju ","nandini"};
        String[] address= {"Hyd ", "KPHB ","KPHB ","Medak ","Medak "," hyd "};
        long[] number = {70324443,24890112,987839991,776891011,1090775432,98765432};

        for(int i =0; i<f1.length; i++){
            System.out.println("Friend "+(i+1)+" :"+f1[i]+address[i]+number[i]);
        }
        

}
}
