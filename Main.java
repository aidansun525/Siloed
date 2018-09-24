public class Main {

    public static void main(String[] args) {
        float h1=72f;
        float h2=19f;
        float h3=50f;
        float h4=67f;
        float h5=16f;
        float h6=53f;
        float h7=69f;
        float h8=30f;
        float h9=52f;
        float h10=40f;
        float h11=31f;
        float h12=75f;
        float d1=22f;
        float d2=18f;
        float d3=13f;
        float d4=16f;
        float d5=14f;
        float d6=23f;
        float d7=22f;
        float d8=22f;
        float d9=23f;
        float d10=16f;
        float d11=18f;
        float d12=23f;
        float pi=3.14f;
        float volume1=pi*(d1/2)*(d1/2)*h1;
        float volume2=pi*(d2/2)*(d2/2)*h2;
        float volume3=pi*(d3/2)*(d3/2)*h3;
        float volume4=pi*(d4/2)*(d4/2)*h4;
        float volume5=pi*(d5/2)*(d5/2)*h5;
        float volume6=pi*(d6/2)*(d6/2)*h6;
        float volume7=pi*(d7/2)*(d7/2)*h7;
        float volume8=pi*(d8/2)*(d8/2)*h8;
        float volume9=pi*(d9/2)*(d9/2)*h9;
        float volume10=pi*(d10/2)*(d10/2)*h10;
        float volume11=pi*(d11/2)*(d11/2)*h11;
        float volume12=pi*(d12/2)*(d12/2)*h12;
        float totalVolume=volume1+volume2+volume3+volume4+volume5+volume6+volume7+volume8+volume9+volume10+volume11+volume12;
        float waterUsage=37640f*28f*.246f;
        float avgWaterSaved=(waterUsage-totalVolume)/37640f/28f;       
        System.out.println("Each person need to save"+" "+avgWaterSaved+" "+"m^3 of water a day.");

    }
}
